package com.telusko.JpaDemo;
//This file (App.java) is created inside src/main/java
import javax.persistence.*;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("My"); //"My" is the persistence unit name
        EntityManager em = emf.createEntityManager();
        Alien a = em.find(Alien.class, 5);
        System.out.println(a);
    }
}
