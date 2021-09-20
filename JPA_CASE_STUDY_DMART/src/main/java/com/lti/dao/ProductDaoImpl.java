package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.beans.Product;

public class ProductDaoImpl implements ProductDao{
	
	@Override
	public void addProduct(Product p) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		System.out.println("Product added");
		
		
		em.close();
		factory.close();
	}
	

}