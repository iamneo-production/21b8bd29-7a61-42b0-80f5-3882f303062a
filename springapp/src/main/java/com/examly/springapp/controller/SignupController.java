package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.dao.UserDAO;
import com.examly.springapp.model.UserModel;

@RestController
public class SignupController {
	
	private UserDAO userDao;
	
	@Autowired
	public SignupController(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	@PostMapping("/signup")
	public boolean saveUser(@RequestBody UserModel user) {
		System.out.println(user);
		return userDao.create(user);
	}
}
