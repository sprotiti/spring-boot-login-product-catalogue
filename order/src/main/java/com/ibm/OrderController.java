package com.ibm;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ibm.model.Orders;
import com.ibm.model.Products;
import com.ibm.repository.OrderRepository;
import com.ibm.service.OrderService;

@RestController
@RequestMapping("/")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	//get all orders 
	@GetMapping("")
	public ResponseEntity<List<Orders>> getAll()
	{
		System.out.println("enter getAll orders");
		return ResponseEntity.ok(orderService.findAll());
	}
	
	//get all orders of Customer by Cust Id
	@GetMapping("/cust/{custId}")
	public ResponseEntity<List<Orders>> getOrderByCustId(@PathVariable Long custId)
	{
		System.out.println("enter getOrderByCustId custId="+custId);
		return ResponseEntity.ok(orderService.getCustOrders(custId));
	}
		
	//get orders by OrderId			
	@GetMapping("/order/{orderId}")
	public ResponseEntity<Orders>  getOrdersByOrderId(  @PathVariable("orderId") Long orderId){
	
		System.out.println("enter getOrdersByOrderId  orderId="+orderId);
		return ResponseEntity.ok(orderService.getOrder(orderId));
	}
	
	@PostMapping
	public ResponseEntity<Orders> createOrders(@RequestBody Orders order)
	{
		Orders result = orderService.createOrders(order);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{orderId}")
				.buildAndExpand(result.getId()).toUri();		
			return ResponseEntity.created(location).body(result);
	}
	
	@PutMapping("/order/{orderId}")
	public ResponseEntity<@Valid Orders> updateOrder( @PathVariable Long orderId, @Valid @RequestBody Orders order)
	{

		System.out.println("enter updateOrder  orderId="+orderId);
		Orders updatedOrder = orderService.updateOrder(orderId, order);
		if(updatedOrder!=null)
		{
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("order//{orderId}")
				.buildAndExpand(order.getOrderId()).toUri();
		
			return ResponseEntity.created(location).body(order);
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
		
	}

	@DeleteMapping("/order/{orderId}")
	public ResponseEntity<?>  deleteOrder( @PathVariable Long orderId)
	{
		System.out.println("enter deleteOrder orderId="+orderId);
		
		if(orderService.deleteOrder(orderId))
			return ResponseEntity.noContent().build();
		else
			return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/cust/{custId}")
	public ResponseEntity<?>  deleteCustOrder(@PathVariable("custId") Long custId)
	{
		System.out.println("enter deleteCustOrder custId="+custId);
		
		if(orderService.deleteCustOrder(custId))
			return ResponseEntity.noContent().build();
		else
			return ResponseEntity.notFound().build();
	}

}	