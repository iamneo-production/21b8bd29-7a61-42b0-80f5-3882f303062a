package com.examly.springapp.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="users")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "email", nullable=false, length=60,unique=true)
	private String email;
	
	@Column(name = "password", nullable=false)
	private String password;
	
	@Column(name = "username",length=80, nullable=false)
	private String username;
	
	@Column(name = "mobilenumber",length=13, unique=true, nullable=false)
	private String mobileNumber;
	
	@Column(name = "active",length=10, nullable=false)
	private boolean active;
	
	@Column(name = "role",length=12, nullable=false)
	private String role;
	
	@OneToOne
	@JoinColumn(referencedColumnName="id")
	private CartModel cart;
	
	@OneToMany(mappedBy = "userId", cascade = {CascadeType.ALL})
	private List<OrderModel> ordersList = new ArrayList<>();
	
	public UserModel() {}
	
	public UserModel(String email, String password, String username, String mobileNumber, boolean active,
			String role, CartModel cart, List<OrderModel> ordersList) {
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.active = active;
		this.role = role;
		this.cart = cart;
		this.ordersList = ordersList;
	}

	public int getId() {
		return this.id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public CartModel getCart() {
		return cart;
	}

	public void setCart(CartModel cart) {
		this.cart = cart;
	}

	public List<OrderModel> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(OrderModel ordersList) {
		this.ordersList.add(ordersList);
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", email=" + email + ", password=" + password + ", username=" + username
				+ ", mobileNumber=" + mobileNumber + ", active=" + active + ", role=" + role + "]";
	}
	
}
