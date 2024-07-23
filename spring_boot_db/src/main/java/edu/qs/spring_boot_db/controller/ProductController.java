package edu.qs.spring_boot_db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.qs.spring_boot_db.Entity.Product;
import edu.qs.spring_boot_db.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService pService;    
	
	
	// find product by id
	@GetMapping("/product/{id}")
	public Product findProductById(@PathVariable int id) {
		
		return pService.findProductById(id);
	}
	
	@PostMapping("/product")
	public String addProduct(@RequestBody Product p) {
		if(pService.addProduct(p)) {
			return "Product add successfully";
		}
		else {
			return "Product is not added";
		}
		
	}
	
}
