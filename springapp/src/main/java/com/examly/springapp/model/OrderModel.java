package com.examly.springapp.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrderModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name = "userid")
	private UserModel userId;
	
	@Column(name = "product_name")
	private String ProductName;
	
	@Column(name = "qty")
	private int quantity;
	
	@Column(name = "total_price")
	private String totalPrice;
	
	@Column(name = "status")
	private String Status;
	
	@Column(name = "price")
	private String Price;
	
	public OrderModel() {}

	public OrderModel(UserModel userId, String productName, int quantity, String totalPrice, String status,
			String price) {
		this.userId = userId;
		ProductName = productName;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		Status = status;
		Price = price;
	}

	public int getOrderId() {
		return orderId;
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
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}
	
}
