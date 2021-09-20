package com.lti.services;

import com.lti.beans.Product;
import com.lti.dao.ProductDao;
import com.lti.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	
	ProductDao dao=new ProductDaoImpl();

	@Override
	public void addProduct(Product p) {
		
		dao.addProduct(p);
	}
	
}
