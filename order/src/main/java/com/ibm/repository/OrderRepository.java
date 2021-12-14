package com.ibm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.model.Orders;
@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{
	

	List<Orders> findByCustId(Long custId);
	
	Orders findByOrderId(Long orderId);

	List<Orders> findAll();
	
}
