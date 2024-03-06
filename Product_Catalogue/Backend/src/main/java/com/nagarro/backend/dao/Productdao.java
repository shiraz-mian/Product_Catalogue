package com.nagarro.backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.backend.entity.Products;

public interface Productdao extends JpaRepository<Products,Integer>{
	public List<Products> findByCode(String code);
}
