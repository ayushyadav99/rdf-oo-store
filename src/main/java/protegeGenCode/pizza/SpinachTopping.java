package protegeGenCode.pizza;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: SpinachTopping <br>
 * @version generated on Tue Apr 27 14:33:01 IST 2021 by ayushyadav
 */

public interface SpinachTopping extends VegetableTopping {

    /* ***************************************************
     * Property http://www.co-ode.org/ontologies/pizza/pizza.owl#hasIngredient
     */
     
    /**
     * Gets all property values for the hasIngredient property.<p>
     * 
     * @returns a collection of values for the hasIngredient property.
     */
    Collection<? extends Food> getHasIngredient();

    /**
     * Checks if the class has a hasIngredient property value.<p>
     * 
     * @return true if there is a hasIngredient property value.
     */
    boolean hasHasIngredient();

    /**
     * Adds a hasIngredient property value.<p>
     * 
     * @param newHasIngredient the hasIngredient property value to be added
     */
    void addHasIngredient(Food newHasIngredient);

    /**
     * Removes a hasIngredient property value.<p>
     * 
     * @param oldHasIngredient the hasIngredient property value to be removed.
     */
    void removeHasIngredient(Food oldHasIngredient);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
