package com.nagarro.backend.services;

import java.util.List;

import com.nagarro.backend.entity.Products;

public interface ProductService {
	public List<Products> getProducts(String code);
	public void addproduct(Products product);
	public List<Products> getAll(); 
}
