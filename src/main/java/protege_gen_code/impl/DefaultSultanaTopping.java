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
 * Source Class: DefaultSultanaTopping <br>
 * @version generated on Tue Apr 27 14:33:01 IST 2021 by ayushyadav
 */
@Entity
 public class DefaultSultanaTopping extends WrappedIndividualImpl implements SultanaTopping , Serializable {
	 private static final long serialVersionUID = 1L;
	 @GeneratedValue
	 private long id;
	 @Id 
	 private String name;

private Collection < ? extends Food > HasIngredient ;

    public DefaultSultanaTopping(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
	name = iri.toSting();
	
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
