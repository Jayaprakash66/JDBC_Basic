package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Author a1=new Author();
		//a1.setAid(1);
		a1.setAge(80);
		a1.setName("JK");
		a1.setGender("Male");
		a1.setLoc("chnna");
		
		Books b1=new Books();
		b1.setName("Harry Potter name");
//		b1.setAuthor("JK");
		b1.setEdition("1st edition");
		b1.setAuthor(a1);
		
		Books b2=new Books();
		b2.setName("Harry Potter name");
		b2.setEdition("1st edition");
		b2.setAuthor(a1);
		
		ArrayList<Books> l=new ArrayList();
		 l.add(b1);
		 l.add(b2);
		 a1.setBooks(l);
		 
		 et.begin();
		 em.persist(b1);
		 em.persist(b2);
		 em.persist(a1);
		 et.commit();
		 System.out.println("Inserted");

	}

}
