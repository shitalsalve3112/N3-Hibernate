package org.tnsif.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="Manager_Store")
@Entity
public class Manager extends Employee{
	
	/**
	 * 
	 * 
	 */
    private static final long serialVersionUId =1L;
    
	private Integer dept_id;
	private String dept_name;
	
	//getters and Setters
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	//Two String
	@Override
	public String toString() {
		return "Manager [dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}
	
	
	
}
