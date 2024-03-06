package com.nagarro.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.backend.dao.Productdao;
import com.nagarro.backend.entity.Products;

@Service
public class ProductServiceimpl implements ProductService{
	@Autowired
	private Productdao productdao;
	
	@Override
	public List<Products> getProducts(String code) {
		// TODO Auto-generated method stub
		List<Products> list = this.productdao.findByCode(code);
		System.out.println("search");
		return list;
	}

	@Override
	public void addproduct(Products product) {
		// TODO Auto-generated method stub
		this.productdao.save(product);
	}

	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		List<Products> list = this.productdao.findAll();
		return list;
	}

}
