package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.repository.ProductRepository;
import com.examly.springapp.model.ProductModel;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<ProductModel> getAllProducts(){
		List<ProductModel> productModels = new ArrayList<>();
		productRepository.findAll().forEach(productModels::add);
		return productModels;
		
	}
	
	public ProductModel getProduct(String id) {
		return productRepository.findById(id).filter(t->t.getProductId().equals(id)).get();
	}

	public void addProduct(ProductModel productModel) {
		productRepository.save(productModel);
	}

	public void updateProduct(ProductModel productModel, String id) {
		productRepository.save(productModel);
	}

	public void deleteProduct(String id) {
		productRepository.deleteById(id);
	}
}
