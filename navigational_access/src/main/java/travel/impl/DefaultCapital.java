package travel.impl;

import travel.*;


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
 * Source Class: DefaultCapital <br>
 * @version generated on Sun May 16 18:22:29 IST 2021 by ayushyadav
 */
@Entity
 public class DefaultCapital extends WrappedIndividualImpl implements Capital , Serializable {
	 private static final long serialVersionUID = 1L;
	 @GeneratedValue
	 private long id;
	 @Id 
	 private String name;

private Collection < ? extends Accommodation > HasAccommodation ; ;
private Collection < ? extends Activity > HasActivity ; ;
private Collection < ? extends Destination > HasPart ;

    public DefaultCapital(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
	name = iri.toString();
	
	HasAccommodation= getHasAccommodation();
	HasActivity= getHasActivity();
	HasPart= getHasPart();
    }





    /* ***************************************************
     * Object Property http://www.owl-ontologies.com/travel.owl#hasAccommodation
     */
     
    public Collection<? extends Accommodation> getHasAccommodation() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASACCOMMODATION,
                                               DefaultAccommodation.class);
    }

    public boolean hasHasAccommodation() {
	   return !getHasAccommodation().isEmpty();
    }

    public void addHasAccommodation(Accommodation newHasAccommodation) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASACCOMMODATION,
                                       newHasAccommodation);
    }

    public void removeHasAccommodation(Accommodation oldHasAccommodation) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASACCOMMODATION,
                                          oldHasAccommodation);
    }


    /* ***************************************************
     * Object Property http://www.owl-ontologies.com/travel.owl#hasActivity
     */
     
    public Collection<? extends Activity> getHasActivity() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASACTIVITY,
                                               DefaultActivity.class);
    }

    public boolean hasHasActivity() {
	   return !getHasActivity().isEmpty();
    }

    public void addHasActivity(Activity newHasActivity) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASACTIVITY,
                                       newHasActivity);
    }

    public void removeHasActivity(Activity oldHasActivity) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASACTIVITY,
                                          oldHasActivity);
    }


    /* ***************************************************
     * Object Property http://www.owl-ontologies.com/travel.owl#hasPart
     */
     
    public Collection<? extends Destination> getHasPart() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASPART,
                                               DefaultDestination.class);
    }

    public boolean hasHasPart() {
	   return !getHasPart().isEmpty();
    }

    public void addHasPart(Destination newHasPart) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASPART,
                                       newHasPart);
    }

    public void removeHasPart(Destination oldHasPart) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASPART,
                                          oldHasPart);
    }


}
