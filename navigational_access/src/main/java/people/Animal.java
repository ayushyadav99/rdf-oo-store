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
 * Source Class: Animal <br>
 * @version generated on Sun May 16 17:26:14 IST 2021 by ayushyadav
 */

public interface Animal extends WrappedIndividual {

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
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
