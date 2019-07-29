package com.cg.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entities.Product;

public interface ProductService{
	List<Product> populate();
	void add(Product product);
	List<Product> getAll();
}
