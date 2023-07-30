package com.rizzu.AlgoDomain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rizzu.AlgoDomain.model.Product;
import com.rizzu.AlgoDomain.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {

		return productService.saveProduct(product);
	}
	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable Long productId) {
		productService.deleteProduct(productId);
	}
	@GetMapping("/{productId}")
	public Product getProductById(@PathVariable Long productId) {
		
		return productService.getProductById(productId);
	}
	@GetMapping
	public List<Product> getAllProducts(){
		
		return (List<Product>)productService.getAllProducts();
	}
	@PutMapping("/{productId}")
	public Product updateProductById(Product product,@PathVariable Long productId) {
		return productService.updateProductById(product, productId);
	}
	
	
	
}
