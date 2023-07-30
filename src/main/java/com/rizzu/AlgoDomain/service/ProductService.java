package com.rizzu.AlgoDomain.service;

import java.util.List;

import com.rizzu.AlgoDomain.model.Product;

public interface ProductService {

	Product saveProduct(Product product);
	void deleteProduct(Long productId);
	Product getProductById(Long productId);
	List<Product> getAllProducts();
	Product updateProductById(Product product,Long productId);
}
