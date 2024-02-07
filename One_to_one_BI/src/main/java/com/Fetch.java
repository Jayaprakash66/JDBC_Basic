package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Fetch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Person p=em.find(Person.class,2);
//		Person p1=em.find(Person.class, 4);
		System.out.println(p);
//		System.out.println(p1);
	}

}
