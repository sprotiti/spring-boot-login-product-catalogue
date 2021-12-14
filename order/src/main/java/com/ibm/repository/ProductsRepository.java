package com.ibm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.model.Products;


@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{
	
	List<Products> findByProductId(String Id);
	
	

}
