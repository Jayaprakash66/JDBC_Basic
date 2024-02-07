package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchApplication {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the ID");
		int n=s.nextInt();
		Mobile a=em.find(Mobile.class, n);
		System.out.println(a);
	}
}
