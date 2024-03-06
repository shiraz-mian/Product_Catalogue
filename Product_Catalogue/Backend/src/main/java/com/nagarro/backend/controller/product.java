package com.nagarro.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.backend.entity.Products;
import com.nagarro.backend.services.ProductService;

	
	
	@RestController
	@CrossOrigin
	public class product {
		@Autowired
		private ProductService service;
		
		@GetMapping("/product")
		public List<Products> getAll(){
			List<Products> list = this.service.getAll();
			return list;
		}
		
		@GetMapping("/search/{code}")
		public List<Products> getProducts(@PathVariable String code){
			List<Products> list = this.service.getProducts(code);
			return list;
		}
		
		@PostMapping("/addproduct")
		public void addproduct(@RequestBody Products product) {
			 this.service.addproduct(product);
		}
}
