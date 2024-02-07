package com;	

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
    
   public static void main(String[] args) {
	
	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	   EntityManager em=emf.createEntityManager();
	   EntityTransaction et=em.getTransaction();
	   
	   person p= new person();
	   p.setPid(2);
	   p.setName("jerry");
	   p.setGender("male");
	   p.setAge(25);
	   
	   et.begin();
	   em.merge(p);
	   et.commit();
	   
	   
}
}
