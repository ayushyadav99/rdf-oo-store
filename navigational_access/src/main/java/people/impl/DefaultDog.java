package people.impl;

import people.*;


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
 * Source Class: DefaultDog <br>
 * @version generated on Sun May 16 17:26:14 IST 2021 by ayushyadav
 */
@Entity
 public class DefaultDog extends WrappedIndividualImpl implements Dog , Serializable {
	 private static final long serialVersionUID = 1L;
	 @GeneratedValue
	 private long id;
	 @Id 
	 private String name;


    public DefaultDog(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
	name = iri.toString();
	
    }





}
