package com.examly.springapp.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.ProductModel;
import com.examly.springapp.service.ProductService;



@CrossOrigin(origins="https://8081-ebaadaebdaebdbdebcfdcceffaadfba.examlyiopb.examly.io")
@RestController
public class ProductsController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/admin")
	public List<ProductModel> getHomeProduct() {
		return productService.getAllProducts();
	}
	
	@RequestMapping("/admin/productEdit/{id}")
	public ProductModel getProduct(@PathVariable String id) {
		return productService.getProduct(id);
	}
	@CrossOrigin(origins="https://8081-ebaadaebdaebdbdebcfdcceffaadfba.examlyiopb.examly.io")
	@RequestMapping(method = RequestMethod.POST,value = "/admin/addProduct")
	public void productSave(@RequestBody ProductModel productmodel) {
		productService.addProduct(productmodel);
		
	}
	@RequestMapping(method = RequestMethod.POST,value="/admin/productEdit/{id}")
	public void productEditSave(@RequestBody ProductModel productmodel,@PathVariable String id ) {
		productService.updateProduct(productmodel,id);
	}
	@CrossOrigin(origins="https://8081-ebaadaebdaebdbdebcfdcceffaadfba.examlyiopb.examly.io")
	@RequestMapping(method= RequestMethod.DELETE,value="/admin/delete/{id}")
	public void productDelete(@PathVariable String id) {
		productService.deleteProduct(id);
	}
}