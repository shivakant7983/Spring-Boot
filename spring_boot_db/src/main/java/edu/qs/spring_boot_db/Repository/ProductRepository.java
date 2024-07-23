package edu.qs.spring_boot_db.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.qs.spring_boot_db.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	

}
