package people;

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
 * Source Class: Dog_liker <br>
 * @version generated on Sun May 16 17:26:15 IST 2021 by ayushyadav
 */

public interface Dog_liker extends Person {

    /* ***************************************************
     * Property http://owl.man.ac.uk/2006/07/sssw/people#eats
     */
     
    /**
     * Gets all property values for the eats property.<p>
     * 
     * @returns a collection of values for the eats property.
     */
    Collection<? extends WrappedIndividual> getEats();

    /**
     * Checks if the class has a eats property value.<p>
     * 
     * @return true if there is a eats property value.
     */
    boolean hasEats();

    /**
     * Adds a eats property value.<p>
     * 
     * @param newEats the eats property value to be added
     */
    void addEats(WrappedIndividual newEats);

    /**
     * Removes a eats property value.<p>
     * 
     * @param oldEats the eats property value to be removed.
     */
    void removeEats(WrappedIndividual oldEats);


    /* ***************************************************
     * Property http://owl.man.ac.uk/2006/07/sssw/people#has_pet
     */
     
    /**
     * Gets all property values for the has_pet property.<p>
     * 
     * @returns a collection of values for the has_pet property.
     */
    Collection<? extends Animal> getHas_pet();

    /**
     * Checks if the class has a has_pet property value.<p>
     * 
     * @return true if there is a has_pet property value.
     */
    boolean hasHas_pet();

    /**
     * Adds a has_pet property value.<p>
     * 
     * @param newHas_pet the has_pet property value to be added
     */
    void addHas_pet(Animal newHas_pet);

    /**
     * Removes a has_pet property value.<p>
     * 
     * @param oldHas_pet the has_pet property value to be removed.
     */
    void removeHas_pet(Animal oldHas_pet);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
