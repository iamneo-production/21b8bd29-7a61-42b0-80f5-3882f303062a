package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.dao.UserDAO;
import com.examly.springapp.model.LoginModel;


@RestController
@CrossOrigin(origins = "*")
public class LoginController {
	
private UserDAO userDao;
	
	@Autowired
	public LoginController(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	@PostMapping("/login")
	public boolean checkUser(@RequestBody LoginModel login) {
		return userDao.checkUser(login);
	} 
}
