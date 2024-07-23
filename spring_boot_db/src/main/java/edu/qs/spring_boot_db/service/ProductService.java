package edu.qs.spring_boot_db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.qs.spring_boot_db.Entity.Product;
import edu.qs.spring_boot_db.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao pDao;
	
	
	public Product findProductById(int id) {
		
		Product p = pDao.findProductById(id);
		
		return (p != null) ? p : null;
		
	}
	
	public boolean addProduct(Product p) {
		
		if(findProductById(p.getId()) == null) {
			pDao.addProduct(p);
			
			if(findProductById(p.getId()) != null) {
				return true;
			}
		}
		
		return false;
		
	}
}
