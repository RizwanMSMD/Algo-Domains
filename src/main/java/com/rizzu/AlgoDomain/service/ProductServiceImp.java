package com.rizzu.AlgoDomain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rizzu.AlgoDomain.model.Product;
import com.rizzu.AlgoDomain.repository.ProductRepository;
@Service
public class ProductServiceImp implements ProductService{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		double price=product.getPrice();
		double discount=0.0;
		double gst=0.0;
		double delivery=0.0;
		String category=product.getCategory();
		
		if(category.equals("Electronics"))
		{
			discount=0.15*price;
			gst=0.18*price;
			delivery=350;
		}
		else if(category.equals("HomeApplainces"))
		{
			discount=0.22*price;
			gst=0.24*price;
			delivery=800;
		}
		else if(category.equals("Clothing"))
		{
			discount=0.40*price;
			gst=0.12*price;
			delivery=0;
		}
		else if(category.equals("Furniture"))
		{
			discount=0.10*price;
			gst=0.18*price;
			delivery=300;
		}
		product.setDiscount(discount);
		product.setGst(gst);
		product.setDelivery(delivery);
		double finalPrice=price+gst+delivery-discount;
		product.setFinalPrice(finalPrice);
		Product pdts=productRepository.save(product);
		
		return pdts;
	}

	@Override
	public void deleteProduct(Long productId) {
		productRepository.deleteById(productId);
		
	}

	@Override
	public Product getProductById(Long productId) {
		Product product = productRepository.findById(productId).get();
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = (List<Product>)productRepository.findAll();
		return products;
	}

	@Override
	public Product updateProductById(Product product, Long productId) {
		Optional<Product> optional=productRepository.findById(productId);
		Product pdt=optional.get();
		pdt.setProductId(productId);
		pdt.setName(product.getName());
		pdt.setPrice(product.getPrice());
		pdt.setProductType(product.getProductType());
		pdt.setCategory(product.getCategory());
		
		return productRepository.save(pdt);
	}

}
