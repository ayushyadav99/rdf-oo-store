package travel;

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
 * Source Class: Farmland <br>
 * @version generated on Sun May 16 18:22:29 IST 2021 by ayushyadav
 */

public interface Farmland extends RuralArea {

    /* ***************************************************
     * Property http://www.owl-ontologies.com/travel.owl#hasAccommodation
     */
     
    /**
     * Gets all property values for the hasAccommodation property.<p>
     * 
     * @returns a collection of values for the hasAccommodation property.
     */
    Collection<? extends Accommodation> getHasAccommodation();

    /**
     * Checks if the class has a hasAccommodation property value.<p>
     * 
     * @return true if there is a hasAccommodation property value.
     */
    boolean hasHasAccommodation();

    /**
     * Adds a hasAccommodation property value.<p>
     * 
     * @param newHasAccommodation the hasAccommodation property value to be added
     */
    void addHasAccommodation(Accommodation newHasAccommodation);

    /**
     * Removes a hasAccommodation property value.<p>
     * 
     * @param oldHasAccommodation the hasAccommodation property value to be removed.
     */
    void removeHasAccommodation(Accommodation oldHasAccommodation);


    /* ***************************************************
     * Property http://www.owl-ontologies.com/travel.owl#hasActivity
     */
     
    /**
     * Gets all property values for the hasActivity property.<p>
     * 
     * @returns a collection of values for the hasActivity property.
     */
    Collection<? extends Activity> getHasActivity();

    /**
     * Checks if the class has a hasActivity property value.<p>
     * 
     * @return true if there is a hasActivity property value.
     */
    boolean hasHasActivity();

    /**
     * Adds a hasActivity property value.<p>
     * 
     * @param newHasActivity the hasActivity property value to be added
     */
    void addHasActivity(Activity newHasActivity);

    /**
     * Removes a hasActivity property value.<p>
     * 
     * @param oldHasActivity the hasActivity property value to be removed.
     */
    void removeHasActivity(Activity oldHasActivity);


    /* ***************************************************
     * Property http://www.owl-ontologies.com/travel.owl#hasPart
     */
     
    /**
     * Gets all property values for the hasPart property.<p>
     * 
     * @returns a collection of values for the hasPart property.
     */
    Collection<? extends Destination> getHasPart();

    /**
     * Checks if the class has a hasPart property value.<p>
     * 
     * @return true if there is a hasPart property value.
     */
    boolean hasHasPart();

    /**
     * Adds a hasPart property value.<p>
     * 
     * @param newHasPart the hasPart property value to be added
     */
    void addHasPart(Destination newHasPart);

    /**
     * Removes a hasPart property value.<p>
     * 
     * @param oldHasPart the hasPart property value to be removed.
     */
    void removeHasPart(Destination oldHasPart);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
