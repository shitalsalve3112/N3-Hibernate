package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first employee
		Employee emp1=new Employee();
		emp1.setEmpname("Sakshi Kamod");
		
		//second employee
		Employee emp2=new Employee();
		emp2.setEmpname("Shruti Shinde");
		
		//first address
		Address a1=new Address();
		a1.setPincode(422102);
		a1.setArea("Sinnar");
		a1.setCity("Nashik");
		a1.setState("Maharashtra");
		
		//first address
		Address a2=new Address();
		a2.setPincode(422003);
		a2.setArea("Aadgaon");
		a2.setCity("Nashik");
		a2.setState("Maharashtra");
		
		emp2.setAddress(a1);
		emp1.setAddress(a2);
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();
		
		System.out.println("Data Added Successfully");
		em.close();
		
		factory.close();

	}

}