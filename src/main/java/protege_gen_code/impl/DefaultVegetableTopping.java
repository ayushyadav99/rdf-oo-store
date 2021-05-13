package protege_gen_code.impl;

import protege_gen_code.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultVegetableTopping <br>
 * @version generated on Tue Apr 27 14:33:01 IST 2021 by ayushyadav
 */
@Entity
 public class DefaultVegetableTopping extends WrappedIndividualImpl implements VegetableTopping , Serializable {
	 private static final long serialVersionUID = 1L;
	 @GeneratedValue
	 private long id;
	 @Id 
	 private String name;

private class DefaultVe ableTopping extends WrappedIndividualImpl implements Ve ableTopping { ;
private DefaultVe ableTopping ; CodeGenerationInference inference, IRI iri ) { ;
private Collection < ? extends Food > HasIngredient ;

    public DefaultVegetableTopping(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
	name = iri.toSting();
	
	ableTopping getableTopping
	extends getextends
	WrappedIndividualImpl getWrappedIndividualImpl
	implements getimplements
	VeableTopping getVeableTopping
	, get,
	Serializable getSerializable
	{ get{
	ableTopping(CodeGenerationInference inference, IRI iri) getableTopping(CodeGenerationInference inference, IRI iri)
	{ get{
	HasIngredient= getHasIngredient();
    }





    /* ***************************************************
     * Object Property http://www.co-ode.org/ontologies/pizza/pizza.owl#hasIngredient
     */
     
    public Collection<? extends Food> getHasIngredient() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASINGREDIENT,
                                               DefaultFood.class);
    }

    public boolean hasHasIngredient() {
	   return !getHasIngredient().isEmpty();
    }

    public void addHasIngredient(Food newHasIngredient) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASINGREDIENT,
                                       newHasIngredient);
    }

    public void removeHasIngredient(Food oldHasIngredient) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASINGREDIENT,
                                          oldHasIngredient);
    }


}
