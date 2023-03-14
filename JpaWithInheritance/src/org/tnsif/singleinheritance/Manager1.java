package org.tnsif.singleinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MNG")
 public class Manager1  extends Employee1{
  private int deptId;
  private String deptName;
  
//Getters and Setters
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}

//Two String
@Override
public String toString() {
	return "Manager [deptId=" + deptId + ", deptName=" + deptName + "]";
}

  
  
}
