package people.impl;

import people.*;


import java.net.URI;
import java.io.Serializable;
import javax.jdo.annotations.Embedded;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultVegetarian <br>
 * @version generated on Sun May 16 17:26:15 IST 2021 by ayushyadav
 */
@Entity
 public class DefaultVegetarian extends WrappedIndividualImpl implements Vegetarian , Serializable {
	 private static final long serialVersionUID = 1L;
	 @GeneratedValue
	 private long id;
	 @Id 
	 private String name;

private Collection < ? extends WrappedIndividual > Eats ;

    public DefaultVegetarian(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
	name = iri.toString();
	
	Eats= getEats();
    }





    /* ***************************************************
     * Object Property http://owl.man.ac.uk/2006/07/sssw/people#eats
     */
     
    public Collection<? extends WrappedIndividual> getEats() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_EATS,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasEats() {
	   return !getEats().isEmpty();
    }

    public void addEats(WrappedIndividual newEats) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_EATS,
                                       newEats);
    }

    public void removeEats(WrappedIndividual oldEats) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_EATS,
                                          oldEats);
    }


}
