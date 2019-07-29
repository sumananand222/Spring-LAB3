package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entities.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{
	private static List<Product> products=new ArrayList<Product>();

	public List<Product> populate() {
		products.add(new Product(101,"Dabur",500.00));
		products.add(new Product(102,"Maggi",200.00));
		products.add(new Product(103,"Dairy Milk",100.00));
		return products;
		
	}

	public void add(Product product) {
		products.add(product);
		
	}

	public List<Product> getAll() {
		return products;
	}
	
}
