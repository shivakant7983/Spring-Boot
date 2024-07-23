package edu.qs.spring_boot_db.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	private int id;
	private String name ;
	private double rating;
	private double price;
	private String type;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, double rating, double price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.price = price;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
