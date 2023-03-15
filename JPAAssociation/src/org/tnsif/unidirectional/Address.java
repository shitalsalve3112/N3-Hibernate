package org.tnsif.unidirectional;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//program to demonstrate on OneToOne Unidirectional association

@Entity
@Table(name="Address")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private data members
	@Id
	private Integer pincode;
	private String area;
	private String city;
	private String state;
	
	//getters and setters
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//To String method
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", area=" + area + ", city=" + city + ", state=" + state + "]";
	}
	
	//Default Constructor
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}                                          
	
	//Parameterized Constructor
	public Address(Integer pincode, String area, String city, String state) {
		super();
		this.pincode = pincode;
		this.area = area;
		this.city = city;
		this.state = state;
	}
	
	
}