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
 * Source Class: DefaultRange <br>
 * @version generated on Sun May 16 18:13:09 IST 2021 by ayushyadav
 */
@Entity
 public class DefaultRange extends WrappedIndividualImpl implements Range , Serializable {
	 private static final long serialVersionUID = 1L;
	 @GeneratedValue
	 private long id;
	 @Id 
	 private String name;

private Collection < ? extends Float > Max ; ;
private Collection < ? extends Float > Min ; ;
private Collection < ? extends String > Units ;

    public DefaultRange(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
	name = iri.toString();
	
	Max= getMax();
	Min= getMin();
	Units= getUnits();
    }





    /* ***************************************************
     * Data Property http://www.xfront.com/owl/ontologies/camera/#max
     */
     
    public Collection<? extends Float> getMax() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAX, Float.class);
    }

    public boolean hasMax() {
		return !getMax().isEmpty();
    }

    public void addMax(Float newMax) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAX, newMax);
    }

    public void removeMax(Float oldMax) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAX, oldMax);
    }


    /* ***************************************************
     * Data Property http://www.xfront.com/owl/ontologies/camera/#min
     */
     
    public Collection<? extends Float> getMin() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MIN, Float.class);
    }

    public boolean hasMin() {
		return !getMin().isEmpty();
    }

    public void addMin(Float newMin) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MIN, newMin);
    }

    public void removeMin(Float oldMin) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MIN, oldMin);
    }


    /* ***************************************************
     * Data Property http://www.xfront.com/owl/ontologies/camera/#units
     */
     
    public Collection<? extends String> getUnits() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_UNITS, String.class);
    }

    public boolean hasUnits() {
		return !getUnits().isEmpty();
    }

    public void addUnits(String newUnits) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_UNITS, newUnits);
    }

    public void removeUnits(String oldUnits) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_UNITS, oldUnits);
    }


}
