package edu.qs.spring_boot_db.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.qs.spring_boot_db.Entity.Product;
import edu.qs.spring_boot_db.Repository.ProductRepository;

@Component
public class ProductDao {
	
	@Autowired
	ProductRepository pRep;

	public Product findProductById(int id) {
		 
		Optional<Product> opt = pRep.findById(id);
		
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			return null;
		}
	}
	
	public void addProduct(Product p) {
		pRep.save(p);
	
	}
	
	// find all product
	
	public List<Product> findAllProducts(){
		return pRep.findAll();
	}
	
	// add all product
	
	public void addAllProduct(List<Product> prds) {
		pRep.saveAll(prds);
	}
	

}
