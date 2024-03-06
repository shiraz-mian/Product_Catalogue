package com.nagarro.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;
	  private String code;
	  private String name;
	  private String brand;
	  private int price;
	  private boolean availability;
	public Products(int id, String code, String name, String brand, int price, boolean availability) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.availability = availability;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", code=" + code + ", name=" + name + ", brand=" + brand + ", price=" + price
				+ ", availability=" + availability + "]";
	}
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
  
}
