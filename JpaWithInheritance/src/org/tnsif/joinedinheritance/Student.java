package org.tnsif.joinedinheritance;

import java.io.Serializable;

import javax.persistence.Id;

public class Student implements Serializable {
 
	/**
	 * 
	 */private static final long serialVersionUID =1L;
	 @Id
	 private Integer rollno;
	 private String Name;
	 public float percentage;
	 
	 //Getters and Setters
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	 
	 
		 
 }

