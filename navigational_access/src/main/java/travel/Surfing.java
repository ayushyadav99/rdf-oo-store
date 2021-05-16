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
 * Source Class: Surfing <br>
 * @version generated on Sun May 16 18:22:29 IST 2021 by ayushyadav
 */

public interface Surfing extends Sports {

    /* ***************************************************
     * Property http://www.owl-ontologies.com/travel.owl#hasContact
     */
     
    /**
     * Gets all property values for the hasContact property.<p>
     * 
     * @returns a collection of values for the hasContact property.
     */
    Collection<? extends Contact> getHasContact();

    /**
     * Checks if the class has a hasContact property value.<p>
     * 
     * @return true if there is a hasContact property value.
     */
    boolean hasHasContact();

    /**
     * Adds a hasContact property value.<p>
     * 
     * @param newHasContact the hasContact property value to be added
     */
    void addHasContact(Contact newHasContact);

    /**
     * Removes a hasContact property value.<p>
     * 
     * @param oldHasContact the hasContact property value to be removed.
     */
    void removeHasContact(Contact oldHasContact);


    /* ***************************************************
     * Property http://www.owl-ontologies.com/travel.owl#isOfferedAt
     */
     
    /**
     * Gets all property values for the isOfferedAt property.<p>
     * 
     * @returns a collection of values for the isOfferedAt property.
     */
    Collection<? extends Destination> getIsOfferedAt();

    /**
     * Checks if the class has a isOfferedAt property value.<p>
     * 
     * @return true if there is a isOfferedAt property value.
     */
    boolean hasIsOfferedAt();

    /**
     * Adds a isOfferedAt property value.<p>
     * 
     * @param newIsOfferedAt the isOfferedAt property value to be added
     */
    void addIsOfferedAt(Destination newIsOfferedAt);

    /**
     * Removes a isOfferedAt property value.<p>
     * 
     * @param oldIsOfferedAt the isOfferedAt property value to be removed.
     */
    void removeIsOfferedAt(Destination oldIsOfferedAt);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
