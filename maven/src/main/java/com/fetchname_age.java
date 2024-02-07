package com;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class fetchname_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select p.name,p.age from person p");
		List<Object[]> l=q.getResultList();
		
		for(Object[] arr:l) {
			System.out.println("Name= "+arr[0]+", Age = "+arr[1]);
		}
	}

}
