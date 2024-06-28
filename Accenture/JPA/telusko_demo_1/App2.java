package com.telusko.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
      Alien a = new Alien();
      a.setAid(9);
      a.setAname("Maria");
      a.setTech("Hardware");
      //we need to save the above details in the SQL Database. to do so, we need to use persist() method.
      
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();

      //To make changes inside the database, we need to use transactions.
    	em.getTransaction().begin();   // Transaction begins here
    	em.persist(a);                 // saves the object a inside the database
    	em.getTransaction().commit();  // commits the transaction
      
    	System.out.println(a);
    	
    }
}
