package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FectchByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select p from person p where p.name='tom'");
		
//		Object o=q.getSingleResult();
//		person p=(person)o;//length 
		person p=(person)q.getSingleResult();
		System.out.println(p);
		
	}
}