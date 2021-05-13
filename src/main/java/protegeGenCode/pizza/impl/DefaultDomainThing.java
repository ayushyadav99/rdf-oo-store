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
 * Source Class: DefaultDomainThing <br>
 * @version generated on Tue Apr 27 14:33:01 IST 2021 by ayushyadav
 */
@Entity
 public class DefaultDomainThing extends WrappedIndividualImpl implements DomainThing , Serializable {
	 private static final long serialVersionUID = 1L;
	 @GeneratedValue
	 private long id;
	 @Id 
	 private String name;


    public DefaultDomainThing(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
	name = iri.toSting();
	
    }





}
