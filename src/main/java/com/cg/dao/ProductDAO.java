package com.cg.dao;

import java.util.List;

import com.cg.entities.Product;

public interface ProductDAO {
	List<Product> populate();
	void add(Product product);
	List<Product> getAll();
}
