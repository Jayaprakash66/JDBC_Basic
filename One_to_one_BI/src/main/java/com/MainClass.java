package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		AadharCard a=new AadharCard();
		a.setAddress("Chennai");
		a.setDob("24/07/2002");
		a.setPhone(9292833329l);
		Person p=new Person();
		p.setName("tom");
		p.setGender("male");
		p.setAge(21);
		
		p.setC(a);
		a.setP(p);
		
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		System.out.println("Inserted");
	}

}
