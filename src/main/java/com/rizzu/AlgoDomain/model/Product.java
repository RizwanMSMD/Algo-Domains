package com.rizzu.AlgoDomain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
private Long productId;
private String name;
private String productType;
private String category;
private double price;
private double discount;
private double charges;
private double gst;
private double delivery;
private double finalPrice;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(Long productId, String name, String productType, String category, double price, double discount,
		double charges, double gst, double delivery, double finalPrice) {
	super();
	this.productId = productId;
	this.name = name;
	this.productType = productType;
	this.category = category;
	this.price = price;
	this.discount = discount;
	this.charges = charges;
	this.gst = gst;
	this.delivery = delivery;
	this.finalPrice = finalPrice;
}
public Long getProductId() {
	return productId;
}
public void setProductId(Long productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
public double getCharges() {
	return charges;
}
public void setCharges(double charges) {
	this.charges = charges;
}
public double getGst() {
	return gst;
}
public void setGst(double gst) {
	this.gst = gst;
}
public double getDelivery() {
	return delivery;
}
public void setDelivery(double delivery) {
	this.delivery = delivery;
}
public double getFinalPrice() {
	return finalPrice;
}
public void setFinalPrice(double finalPrice) {
	this.finalPrice = finalPrice;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", name=" + name + ", productType=" + productType + ", category="
			+ category + ", price=" + price + ", discount=" + discount + ", charges=" + charges + ", gst=" + gst
			+ ", delivery=" + delivery + ", finalPrice=" + finalPrice + "]";
}


}
