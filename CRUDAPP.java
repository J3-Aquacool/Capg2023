package com.crud.operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class CRUDAPP {

	
	
	  private static EntityManager em;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeePU");

        em = emf.createEntityManager();

     // Create Entity

        Employee employee = new Employee(10,"Abc","xyz");
        
        EntityTransaction etrans=em.getTransaction();
        
       
        etrans.begin();
        
        em.persist(employee);
        
        etrans.commit();
        
        
        //
        
     // Retrieve entity

        employee = em.find(Employee.class, 10);

        System.out.println(employee);
        
        
        
        
        //
        
        etrans.begin();
        employee.setAddress("blore");

        System.out.println("Updated Employee is: " + employee);

        em.getTransaction().commit();
        
        
        
        employee = new Employee(11,"klm","xyz");
        etrans.begin();
        em.merge(employee);
        
        em.getTransaction().commit();
        
        System.out.println("Merged :"+employee);
	}
	
	
	
	
	

}
