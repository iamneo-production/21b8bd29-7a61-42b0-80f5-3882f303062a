package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.examly.springapp.dao.ProductDAO;
import com.examly.springapp.model.ProductModel;

import java.util.*;

@RestController
public class ProductController {
	
	private ProductDAO productDao;
	
	@Autowired
	public ProductController(ProductDAO productDao) {
		this.productDao = productDao;
	}
	
	@GetMapping("/admin/home")
	public List<ProductModel> getProducts(){
		return productDao.getProduct();
	}
	
	@GetMapping("/home")
	public List<ProductModel> getHomeProduct(){
		return productDao.getProduct();
	}
	
	@PostMapping("/admin/addProduct")
	public String productSave(@RequestBody ProductModel product) {
		boolean check = productDao.saveProduct(product);
		if(check)
			return "Product added";
		else
			return "Product not added";
	}
	
	@GetMapping("/admin/productEdit/{id}")
	public ProductModel productEditData(@PathVariable int id) {
		return productDao.getProduct(id);
	}
	
	@PostMapping("/admin/productEdit/{id}")
	public boolean productEditSave(@RequestBody ProductModel product) {
		System.out.println(product);
		return productDao.saveProduct(product);
	}
}
