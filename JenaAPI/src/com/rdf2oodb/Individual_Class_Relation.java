package com.rdf2oodb;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Individual_Class_Relation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	long id;
	String Ind_name;
	String Class_name;  

	public Individual_Class_Relation(String Ind_name, String Class_name) {
		this.Ind_name = Ind_name;
		this.Class_name = Class_name;
	}
	public String getClass_name() {
		return Class_name;
	}
	public String getInd_name() {
		return Ind_name;
	}
	public void setClass_name(String class_name) {
		Class_name = class_name;
	}
	public void setInd_name(String ind_name) {
		Ind_name = ind_name;
	}
	@Override
	public String toString() {
		return String.format("(%s, %s)",this.Ind_name, this.Class_name);
	}

}
