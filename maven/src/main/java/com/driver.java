package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		person p=new person();
		p.setPid(1);
		p.setName("tom");
		p.setGender("Male");
		p.setAge(25);
		
		
		et.begin();
		em.persist(p);
		et.commit();
	}

}
