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
 * Source Class: DefaultCamera <br>
 * @version generated on Sun May 16 18:13:09 IST 2021 by ayushyadav
 */
@Entity
 public class DefaultCamera extends WrappedIndividualImpl implements Camera , Serializable {
	 private static final long serialVersionUID = 1L;
	 @GeneratedValue
	 private long id;
	 @Id 
	 private String name;

private Collection < ? extends Body > Body ; ;
private Collection < ? extends Money > Cost ; ;
private Collection < ? extends Lens > Lens ; ;
private Collection < ? extends Viewer > ViewFinder ;

    public DefaultCamera(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
	name = iri.toString();
	
	Body= getBody();
	Cost= getCost();
	Lens= getLens();
	ViewFinder= getViewFinder();
    }





    /* ***************************************************
     * Object Property http://www.xfront.com/owl/ontologies/camera/#body
     */
     
    public Collection<? extends Body> getBody() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_BODY,
                                               DefaultBody.class);
    }

    public boolean hasBody() {
	   return !getBody().isEmpty();
    }

    public void addBody(Body newBody) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_BODY,
                                       newBody);
    }

    public void removeBody(Body oldBody) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_BODY,
                                          oldBody);
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
     * Object Property http://www.xfront.com/owl/ontologies/camera/#lens
     */
     
    public Collection<? extends Lens> getLens() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_LENS,
                                               DefaultLens.class);
    }

    public boolean hasLens() {
	   return !getLens().isEmpty();
    }

    public void addLens(Lens newLens) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_LENS,
                                       newLens);
    }

    public void removeLens(Lens oldLens) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_LENS,
                                          oldLens);
    }


    /* ***************************************************
     * Object Property http://www.xfront.com/owl/ontologies/camera/#viewFinder
     */
     
    public Collection<? extends Viewer> getViewFinder() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_VIEWFINDER,
                                               DefaultViewer.class);
    }

    public boolean hasViewFinder() {
	   return !getViewFinder().isEmpty();
    }

    public void addViewFinder(Viewer newViewFinder) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_VIEWFINDER,
                                       newViewFinder);
    }

    public void removeViewFinder(Viewer oldViewFinder) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_VIEWFINDER,
                                          oldViewFinder);
    }


}
