package com;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Application a1=new Application();
		a1.setName("WhatApp");
		a1.setRating(4.5);
		a1.setSize(42);
		a1.setVersion("1.3V");
		
		Application a2=new Application();
		a2.setName("Insta");
		a2.setRating(4.5);
		a2.setSize(44);
		a2.setVersion("3.3V");
		
		Application a3=new Application();
		a3.setName("FaceBook");
		a3.setRating(4.5);
		a3.setSize(99);
		a3.setVersion("9.3V");
		
		ArrayList<Application> list= new ArrayList<Application>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Mobile m1=new Mobile();
		m1.setBrand("OnePlus");
		m1.setColor("Blue");
		m1.setPrice(30000);
		m1.setRAM(8);
		m1.setROM(128);
		m1.setApplications(list);
		
		
		et.begin();
		em.persist(m1);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		et.commit();
		
	}
}
