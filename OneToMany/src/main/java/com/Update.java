package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Application a=new Application();
		a.setName("YouTube");
		a.setRating(5);;
		a.setSize(42);
		a.setVersion("4.6V");
		
		Mobile m=em.find(Mobile.class, 1);
		
		if (m !=null) {
			List<Application> l =m.getApplications();
			l.add(a);
			et.begin();
			em.persist(a);
			em.merge(m);
			et.commit();
		}else {
			System.out.println("Id not found");
		}
	}
}

