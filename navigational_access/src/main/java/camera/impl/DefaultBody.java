package camera.impl;

import camera.*;


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
 * Source Class: DefaultBody <br>
 * @version generated on Sun May 16 18:13:09 IST 2021 by ayushyadav
 */
@Entity
 public class DefaultBody extends WrappedIndividualImpl implements Body , Serializable {
	 private static final long serialVersionUID = 1L;
	 @GeneratedValue
	 private long id;
	 @Id 
	 private String name;

private Collection < ? extends Money > Cost ; ;
private Collection < ? extends Range > Shutter_speed ;

    public DefaultBody(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
	name = iri.toString();
	
	Cost= getCost();
	Shutter_speed= getShutter_speed();
    }





    /* ***************************************************
     * Object Property http://www.xfront.com/owl/ontologies/camera/#cost
     */
     
    public Collection<? extends Money> getCost() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_COST,
                                               DefaultMoney.class);
    }

    public boolean hasCost() {
	   return !getCost().isEmpty();
    }

    public void addCost(Money newCost) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_COST,
                                       newCost);
    }

    public void removeCost(Money oldCost) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_COST,
                                          oldCost);
    }


    /* ***************************************************
     * Object Property http://www.xfront.com/owl/ontologies/camera/#shutter-speed
     */
     
    public Collection<? extends Range> getShutter_speed() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_SHUTTER_SPEED,
                                               DefaultRange.class);
    }

    public boolean hasShutter_speed() {
	   return !getShutter_speed().isEmpty();
    }

    public void addShutter_speed(Range newShutter_speed) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_SHUTTER_SPEED,
                                       newShutter_speed);
    }

    public void removeShutter_speed(Range oldShutter_speed) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_SHUTTER_SPEED,
                                          oldShutter_speed);
    }


}
