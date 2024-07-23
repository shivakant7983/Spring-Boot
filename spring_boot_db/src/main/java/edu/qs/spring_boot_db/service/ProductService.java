package edu.qs.spring_boot_db.service;

import java.util.Iterator;
import java.util.List;

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
	
	public List<Product> findAllProducts(){
		List<Product> prds =  pDao.findAllProducts();
		
		if(! prds.isEmpty()) {
			return prds;
		}
		else {
			return null;
		}
	}
	
	public boolean addAllProduct(List<Product> prds) {
		if(findAllProducts() == null) {
			pDao.addAllProduct(prds);
			return true;
		}
		
		List<Product> data = findAllProducts();
		if(data != null) {
			for(Product d : data) {
				Iterator<Product> itr = prds.iterator();
				
				while(itr.hasNext()) {
					Product temp = (Product) itr.next();
					
					if(temp.getId() == d.getId()) {
						itr.remove();
					}
				}
			}
			
			pDao.addAllProduct(prds);
			return true;
		}
		return false;
	}
}
