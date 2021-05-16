package com.rdf2oodb;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Individual_Property_Value implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	long id;
	String Ind_id;
	String Prop_id;
	String value;
	
	public Individual_Property_Value(String Ind_id, String Prop_id, String value) {
		// TODO Auto-generated constructor stub
		this.Ind_id=Ind_id;
		this.Prop_id = Prop_id;
		this.value = value;
	}
	public String getInd_id() {
		return Ind_id;
	}
	public String getProp_id() {
		return Prop_id;
	}
	public String getValue() {
		return value;
	}
	public void setInd_id(String ind_id) {
		Ind_id = ind_id;
	}
	public void setProp_id(String Prop_id) {
		Prop_id = Prop_id;
	}
	public void setValue(String value) {
		this.value = value;
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%s, %s %s)",this.Ind_id, this.Prop_id, this.value);
	}
}
