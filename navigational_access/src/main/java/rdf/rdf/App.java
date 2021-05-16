package rdf.rdf;

/**
 * Hello world!
 *
 */
import java.io.File;
import java.lang.reflect.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import com.google.common.collect.Iterables;

//import protegeGenCode.pizza.*;
//import protegeGenCode.pizza.impl.*;

//import protege_gen.CollegeProtege.*;
//import protege_gen.CollegeProtege.impl.*;

import travel.*;
import travel.impl.*;

public class App {
	public static void main(String[] argv) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
		try {
			String db_path = "target/ayush_travel1.odb";
			String owl_file_path = "src/main/travel.owl";
			
			 
			
			//load ontology from given OWL file
			File file = new File(owl_file_path); 
			OWLOntologyManager om = OWLManager.createOWLOntologyManager();
			OWLOntology o = om.loadOntologyFromOntologyDocument(file);
			
			 // Open a database connection
	        // (create a new database if it doesn't exist yet):
			EntityManagerFactory emf = Persistence.createEntityManagerFactory(db_path);
			EntityManager em = emf.createEntityManager();
			
			//Pass to ontology object 'o' to extract individuals and persist them to the database using the entity manager connection
			persist_data(o, em);
			em.close();
			emf.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	public static void persist_data(OWLOntology o , EntityManager em)  {
		try {
			// Initialize the root class from the protege generated code [MyFactory by default (unless changed)]
			MyFactory root = new MyFactory(o);
			System.out.println(o.getOntologyID().getOntologyIRI());
			
			// using java reflection, we want to introspect the class MyFactoru during runtime
			// and get all it's methods. 
			Class<MyFactory> c = MyFactory.class;
	        Method[] methods = c.getMethods();
	        
	        
	        em.getTransaction().begin();
	        
	        //the free version of objectDB only allows for 10 different types of objects
	        int count = 0;
	        for (int i = 0; i < methods.length; i++) {
	        	
	        	//get names of methods and call methods that are of the form getAll*Instances
	        	String methodName = methods[i].getName();
	            if (methodName.length()>=6 && "getAll".equals(methodName.substring(0,6))) {
	            	System.out.println("Method being invoked: "+methodName);
	            	
	            	//invoke the getAllInstances method for a particular class
	                Object returnVal = methods[i].invoke(root);
	                Collection<Object> returnCol = (Collection<Object>) returnVal;
	                // if the number of types =>10 then stop persisting, otherwise it will raise an exception
	                if (count >= 10) {
	                	break;
	                }
	                // check if collection is not null
	                if (returnVal instanceof Collection<?>) {
	                	for(Object obj: returnCol){ 
	                		count++;
	                		em.persist(obj); 
	                	}
	                }
	            }
	        }
	        //commit your changes to the db
	        em.getTransaction().commit();
	        System.out.println("saved and exiting!");
	        
		}
		catch(Exception e) {
			System.out.println("Exception Caught");
			System.out.println(e.getMessage());
		}
	}

}

