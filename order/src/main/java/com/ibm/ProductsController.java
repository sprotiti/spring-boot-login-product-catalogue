package com.ibm;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
//import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.ibm.model.Products;
import com.ibm.service.ProductsService;

@RestController
@RequestMapping("/Products")
@CrossOrigin
public class ProductsController {
	@Autowired
	ProductsService productsService;
	/*
	@GetMapping
	public ResponseEntity<List<Products>> getProducts()
	{
		return ResponseEntity.ok(productsService.getProducts());
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<Products>  getProductsById(@PathVariable int productId)
	{
		return ResponseEntity.ok(productsService.getProductById(productId));
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity<?>  deleteProductsById(@PathVariable int productId)
	{
		if(productsService.deleteProducts(productId))
			return ResponseEntity.noContent().build();
		else
			return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<Products> createProducts( @Valid @RequestBody Products products)
	{
		Products result = productsService.createProducts(products);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{productId}")
				.buildAndExpand(result.getProductId()).toUri();		
			return ResponseEntity.created(location).body(result);
		
	}
	
	@PutMapping("/{productId}")
	public ResponseEntity<Products> createProducts(@PathVariable int productId, @Valid @RequestBody Products products)
	{
		
		if(productsService.updateProducts(productId, products))
		{
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{productId}")
				.buildAndExpand(products.getProductId()).toUri();
		
			return ResponseEntity.created(location).body(products);
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
		
	}*/
}