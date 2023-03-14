//Driver Class
package org.tnsif.singleinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//First employee
		Employee1 e1=new Employee1();
		e1.setId(121);
		e1.setName("Shital Salve");
		e1.setSalary(25000.50f);
		em.persist(e1);
		
		//Second employee
		Employee1 e2=new Employee1();
		e2.setId(122);
		e2.setName("Sampada Shewale");
		e2.setSalary(45000.50f);
		em.persist(e2);
		
		//First Manager
		Manager1 m=new Manager1();
		m.setId(125);
		m.setName("Shital Salve");
		m.setSalary(42000.45f);
		m.setDeptId(45);
		m.setDeptName("Information Technology");
		em.persist(m);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

		
	}

}