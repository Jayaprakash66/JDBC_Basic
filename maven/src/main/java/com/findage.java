package com;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class findage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the Start age");
		int start=sn.nextInt();
		System.out.println("Enter the End Age");
		int end=sn.nextInt();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		//Positonal parameter
//		Query q=em.createQuery("select p from person p where p.age between ?1 and ?2");
		//Named Parameter
		Query q=em.createQuery("select p from person p where p.age between :start and :end");
		q.setParameter("start", start);
		q.setParameter("end",end);
		
		List<person> l=q.getResultList();
		
		System.out.println(l);
		
	}

}
