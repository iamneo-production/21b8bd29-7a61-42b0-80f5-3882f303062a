package com.examly.springapp.model;

import javax.persistence.*;

@Entity
@Table(name = "carts")
public class CartModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "prod_id")
	private String cartItemId;
	
	@OneToOne(mappedBy = "cart")
	private UserModel userId;
	
	@Column(name = "product_name")
	private String ProductName;
	
	@Column(name = "qty")
	private int Quantity;
	
	@Column(name = "price")
	private String Price;
	
	public CartModel() {}
	
	public CartModel(String cartItemId, UserModel userId, String productName, int quantity, String price) {
		this.cartItemId = cartItemId;
		this.userId = userId;
		ProductName = productName;
		Quantity = quantity;
		Price = price;
	}

	public int getId() {
		return this.id;
	}

	public String getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(String cartItemId) {
		this.cartItemId = cartItemId;
	}

	public UserModel getUserId() {
		return userId;
	}

	public void setUserId(UserModel userId) {
		this.userId = userId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}
	
}
