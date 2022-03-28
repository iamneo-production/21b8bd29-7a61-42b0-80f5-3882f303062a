package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.examly.springapp.model.CartModel;


public interface CartRepository extends CrudRepository<CartModel, String> {

}
