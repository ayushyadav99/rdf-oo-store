import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Persistence;

import org.apache.jena.datatypes.RDFDatatype;
import org.apache.jena.graph.Node;
import org.apache.jena.ontology.AllDifferent;
import org.apache.jena.ontology.AnnotationProperty;
import org.apache.jena.ontology.DataRange;
import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntProperty;
import org.apache.jena.ontology.OntResource;
import org.apache.jena.ontology.Ontology;
import org.apache.jena.ontology.Profile;
import org.apache.jena.rdf.model.AnonId;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.NodeIterator;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.RDFVisitor;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.util.iterator.ExtendedIterator;


public class OntologyTraverserAPI 
{
	public static void readOntology( String file, OntModel model )
	{
		InputStream in = null;
		try
		{
			in = new FileInputStream( file );
			model.read(in, "RDF/XML");
			in.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} 
	}

	/**
	 * Traverse the Ontology to find all given concepts
	 */
	public static void traverseStart( OntModel model, OntClass ontClass ) 
	{
		// if ontClass is specified we only traverse down that branch
		if( ontClass != null )
		{
			traverse(ontClass, new ArrayList<OntClass>(), 0);
			return;
		}

		// create an iterator over the root classes
		Iterator<OntClass> i =     model.listHierarchyRootClasses();

		// traverse through all roots
		while (i.hasNext()) 
		{
			OntClass tmp = i.next();
			traverse( tmp, new ArrayList<OntClass>(), 0 );
		}
	}

	/**
	 * Start from a class, then recurse down to the sub-classes.
	 * Use occurs check to prevent getting stuck in a loop
	 * @param oc OntClass to traverse from
	 * @param occurs stores visited nodes
	 * @param depth indicates the graph "depth" 
	 * @return list of concepts / entities which were visited when recursing through the hierarchy (avoid loops)
	 */
	private static void traverse( OntClass oc, List<OntClass> occurs, int depth )
	{
		if( oc == null ) return;

		// if end reached abort (Thing == root, Nothing == deadlock)
		if( oc.getLocalName() == null || oc.getLocalName().equals( "Nothing" ) ) return;

		// print depth times "\t" to retrieve a explorer tree like output
		for( int i = 0; i < depth; i++ ) { System.out.print("\t"); }

		// print out the OntClass
		System.out.println( oc.toString() );

		// check if we already visited this OntClass (avoid loops in graphs)
		if ( oc.canAs( OntClass.class ) && !occurs.contains( oc ) ) 
		{
			// for every subClass, traverse down
			for ( Iterator<OntClass> i = oc.listSubClasses( true );  i.hasNext(); ) 
			{
				OntClass subClass = i.next();

				// push this expression on the occurs list before we recurse to avoid loops
				occurs.add( oc );
				// traverse down and increase depth (used for logging tabs)
				traverse( subClass, occurs, depth + 1 );
				// after traversing the path, remove from occurs list
				occurs.remove( oc );
			}
		}

	}

//	public static void main(String[] args) 
//	{
//		
//		EntityManagerFactory emf = 	Persistence.createEntityManagerFactory("$objectdb/db/p2.odb");
//	    EntityManager em = emf.createEntityManager();
//		//		StreamRDF noWhere = StreamRDFLib.sinkNull() ;
//		//		String baseURI = "http://owl.man.ac.uk/2006/07/sssw/people" ;
// 
//		//		try (InputStream in = new FileInputStream("resources/people.owl")) {
//		//			RDFParser.create()
//		//			.source(in)
//		//			.lang(RDFLanguages.NTRIPLES)
//		//			.errorHandler(ErrorHandlerFactory.errorHandlerStrict)
//		//			.base(baseURI)
//		//			.parse(noWhere);
//
//		//create OntModel
//		OntModel model = ModelFactory.createOntologyModel();
//		//read people ontology
//		readOntology( "resources/people.owl", model );
//		// start traverse
//		ExtendedIterator classes = model.listClasses();
//		//	ExtendedIterator Individuals = model.listIndividuals();
//		//	while(Individuals.hasNext()){
//		////		Individual ind = model.getIndividual(Individuals.next().toString());
//		//		        	System.out.println(Individuals.next());
//		//        	StmtIterator properties = ind.listProperties();
//		//        	while(properties.hasNext()) {
//		//        		System.out.println(properties.next());
//		//	}
//		//        }
//		em.getTransaction().begin();
//		while (classes.hasNext())
//		{
//			OntClass thisClass = (OntClass) classes.next();
////			System.out.println("Found class: " + thisClass.toString());
//
//			ExtendedIterator instances = thisClass.listInstances();
//
//			while (instances.hasNext())
//			{
//				Individual thisInstance = (Individual) instances.next();
////				System.out.println("  Found instance: " + thisInstance.toString());
//				Individual_Class_Relation ICR = new Individual_Class_Relation();
//				em.persist(thisInstance.toString());
//			}
//			//        }
//		}
//		em.getTransaction().commit();	
//		em.close();
//		emf.close();
//	}

}
