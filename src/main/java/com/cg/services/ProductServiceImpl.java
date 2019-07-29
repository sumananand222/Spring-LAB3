package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ProductDAO;
import com.cg.entities.Product;
@Service
public class ProductServiceImpl implements ProductService{
@Autowired ProductDAO dao;
	public List<Product> populate() {
		return dao.populate();		
	}

	public void add(Product product) {
		dao.add(product);		
	}

	public List<Product> getAll() {
		return dao.getAll();
	}

}
