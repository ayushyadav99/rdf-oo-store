package protegeGenCode.pizza.impl;

import protegeGenCode.pizza.*;


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
 * Source Class: DefaultVegetarianPizza1 <br>
 * @version generated on Tue Apr 27 14:33:01 IST 2021 by ayushyadav
 */
@Entity
 public class DefaultVegetarianPizza1 extends WrappedIndividualImpl implements VegetarianPizza1 , Serializable {
	 private static final long serialVersionUID = 1L;
	 @GeneratedValue
	 private long id;
	 @Id 
	 private String name;

private class DefaultVe arianPizza1 extends WrappedIndividualImpl implements Ve arianPizza1 { ;
private DefaultVe arianPizza1 ; CodeGenerationInference inference, IRI iri ) { ;
private Collection < ? extends PizzaBase > HasBase ; ;
private Collection < ? extends Food > HasIngredient ; ;
private Collection < ? extends PizzaTopping > HasTopping ;

    public DefaultVegetarianPizza1(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
	name = iri.toSting();
	
	arianPizza1 getarianPizza1
	extends getextends
	WrappedIndividualImpl getWrappedIndividualImpl
	implements getimplements
	VearianPizza1 getVearianPizza1
	, get,
	Serializable getSerializable
	{ get{
	arianPizza1(CodeGenerationInference inference, IRI iri) getarianPizza1(CodeGenerationInference inference, IRI iri)
	{ get{
	HasBase= getHasBase();
	HasIngredient= getHasIngredient();
	HasTopping= getHasTopping();
    }





    /* ***************************************************
     * Object Property http://www.co-ode.org/ontologies/pizza/pizza.owl#hasBase
     */
     
    public Collection<? extends PizzaBase> getHasBase() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASBASE,
                                               DefaultPizzaBase.class);
    }

    public boolean hasHasBase() {
	   return !getHasBase().isEmpty();
    }

    public void addHasBase(PizzaBase newHasBase) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASBASE,
                                       newHasBase);
    }

    public void removeHasBase(PizzaBase oldHasBase) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASBASE,
                                          oldHasBase);
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


    /* ***************************************************
     * Object Property http://www.co-ode.org/ontologies/pizza/pizza.owl#hasTopping
     */
     
    public Collection<? extends PizzaTopping> getHasTopping() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASTOPPING,
                                               DefaultPizzaTopping.class);
    }

    public boolean hasHasTopping() {
	   return !getHasTopping().isEmpty();
    }

    public void addHasTopping(PizzaTopping newHasTopping) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASTOPPING,
                                       newHasTopping);
    }

    public void removeHasTopping(PizzaTopping oldHasTopping) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASTOPPING,
                                          oldHasTopping);
    }


}
