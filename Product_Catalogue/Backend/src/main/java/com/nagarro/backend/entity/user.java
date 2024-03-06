package com.nagarro.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {
	@Id
	private String email;
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String firstname;
	private String lastname;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "user [email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
				+ "]";
	}
	public user(String email, String firstname, String lastname, String password) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}
	
	
}
