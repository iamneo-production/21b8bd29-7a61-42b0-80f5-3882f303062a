package com.examly.springapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.CartModel;
import com.examly.springapp.service.CartService;



@CrossOrigin(origins="https://8081-ebaadaebdaebdbdebcfdcceffaadfba.examlyiopb.examly.io")
@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/Cart")
	public List<CartModel> getCartProducts(){
		return cartService.getAllCartProducts();
	}
	@RequestMapping(method= RequestMethod.DELETE,value="/Cart/delete/{id}")
	public void productDelete(@PathVariable String id) {
		cartService.deleteProduct(id);
	}

	@CrossOrigin(origins="https://8081-ebaadaebdaebdbdebcfdcceffaadfba.examlyiopb.examly.io")
	@RequestMapping(method = RequestMethod.POST,value = "/")
	public void addToCart(@RequestBody CartModel cartmodel) {
		cartService.addProduct(cartmodel);
		
	}
}
