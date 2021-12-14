package com.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ibm.model.Products;

@RepositoryRestResource(collectionResourceRel = "products", path="products")
public interface ProductRepository extends JpaRepository<Products, Integer>{

}
