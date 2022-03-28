package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.repository.CartRepository;
import com.examly.springapp.model.CartModel;




@Service
public class CartService {
	@Autowired
	private CartRepository cartRepository;
	
	
	
	public void addProduct(CartModel cartModel) {
		cartRepository.save(cartModel);
	}
	
	public void deleteProduct(String id) {
		cartRepository.deleteById(id);
	}

	public List<CartModel> getAllCartProducts() {
		List<CartModel> cartModels = new ArrayList<>();
		cartRepository.findAll().forEach(cartModels::add);
		return cartModels;
	}

}
