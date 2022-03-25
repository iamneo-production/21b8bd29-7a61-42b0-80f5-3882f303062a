package com.examly.springapp.dao;

import java.util.*;
import	com.examly.springapp.model.*;

public interface ProductDAO {
	List<ProductModel> getProduct();
	boolean saveProduct(ProductModel product);
	ProductModel getProduct(int id);
	boolean updateProduct(ProductModel product);
}
