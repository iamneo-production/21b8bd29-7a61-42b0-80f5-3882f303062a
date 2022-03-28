package com.examly.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class ProductModel {

	public ProductModel() {
		
	}
	public ProductModel(String productId, String topicName, String description,String imageUrl, String price, String quantity) {
		super();
		this.productId = productId;
		this.productName = topicName;
		this.description = description;
		this.imageUrl = imageUrl;
		this.price=price;
		this.quantity=quantity;
	}
	
	@Id
	@Column(name="product_Id")
	private String productId;
	@Column(name="product_Name")
	private String productName;
	@Column(name="descriptions")
	private String description;
	@Column(name="image_Url")
	private String imageUrl;
	@Column(name="price")
	private String price;
	@Column(name="quantity")
	private String quantity;
	
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
