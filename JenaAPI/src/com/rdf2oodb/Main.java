package com.rdf2oodb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.util.iterator.ExtendedIterator;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		OntModel model = ModelFactory.createOntologyModel();
		InputStream in = null;
		try {
			in = new FileInputStream("resources/people.owl");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.read(in, "RDF/XML");
		in.close();

		EntityManagerFactory emf = 	Persistence.createEntityManagerFactory("objectdb:$objectdb/db/test.tmp;drop");

		EntityManager em = emf.createEntityManager();

		// start traverse
		ExtendedIterator classes = model.listClasses();
		
//		Persisting Individuals Class Relation
		em.getTransaction().begin();
		while (classes.hasNext())
		{
			OntClass thisClass = (OntClass) classes.next();

			ExtendedIterator instances = thisClass.listInstances();

			while (instances.hasNext())
			{
				Individual thisInstance = (Individual) instances.next();
				Individual_Class_Relation ICR = new Individual_Class_Relation(thisInstance.toString(),thisClass.toString());
				em.persist(ICR);
			}
		}
		
//		Persisting Individual Property value
		ExtendedIterator Individuals = model.listIndividuals();
		while(Individuals.hasNext()) {
			Individual thisInd = (Individual) Individuals.next();
			ExtendedIterator Properties = thisInd.listProperties();
			while (Properties.hasNext())
			{
				Statement thisProp = (Statement) Properties.next();
				Individual_Property_Value IPV = new Individual_Property_Value((thisProp.getSubject()).toString(),(thisProp.getPredicate()).toString(), (thisProp.getObject()).toString());
				em.persist(IPV);
			}
		}

		em.getTransaction().commit();	
		em.close();
		emf.close();
	}

}


