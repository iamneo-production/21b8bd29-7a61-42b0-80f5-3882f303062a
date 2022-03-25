package com.examly.springapp.dao;

import com.examly.springapp.model.LoginModel;
import com.examly.springapp.model.UserModel;

public interface UserDAO {
	public boolean create(UserModel user);
	public UserModel getUser(int userId);
	public boolean checkUser(LoginModel loginData);
}
