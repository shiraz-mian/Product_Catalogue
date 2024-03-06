package com.nagarro.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.backend.entity.AuthRequest;
import com.nagarro.backend.entity.Products;
import com.nagarro.backend.entity.user;
import com.nagarro.backend.services.userserv;

@RestController
@CrossOrigin
public class customer {
	
	@Autowired
	private userserv userservice;
	
	@GetMapping("/home")
	public String home() {
		return "this is shiraz";
	}
	
	@PostMapping("/Register")
	public user adduser(@RequestBody user userdata) {
		return this.userservice.adduser(userdata);
	}
	
	@GetMapping("/search")
	public Products getproducts() {
		return null;
	}
	
	@PostMapping("/user")
	public boolean isUser(@RequestBody AuthRequest auth) {
		return this.userservice.isUser(auth.getUser(),auth.getPassword());
	}
}
