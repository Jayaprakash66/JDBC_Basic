package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
			
			EntityManager em=emf.createEntityManager();
			
			EntityTransaction et=em.getTransaction();
			
			person p =em.find(person.class, 1);
			
			if(p!=null) {
				et.begin();
				em.remove(p);
				et.commit();
				System.out.println("deleted");
			}
			else {
				System.out.println("id not found");
			}
			
		}
}


