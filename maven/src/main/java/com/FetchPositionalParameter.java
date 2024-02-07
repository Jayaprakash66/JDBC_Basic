package com;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class FetchPositionalParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the Name to Fetch");
		String name=sn.next();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("Select p from person p where p.name=?2");
		q.setParameter(2,name);
		person p=(person)q.getSingleResult();
		System.out.println(p);
	}

}
