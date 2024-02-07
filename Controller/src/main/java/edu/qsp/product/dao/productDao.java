package edu.qsp.product.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class productDao {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	static EntityManager em=emf.createEntityManager();
	static EntityTransaction et=em.getTransaction();
	public void saveProduct(product p) {
		et.begin();
		em.persist(p);
		et.commit();
	}
	public Product getbyid(int id) {
		return em.find(Product.class, id);
	}
}
