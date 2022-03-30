package service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.model.User;
import web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}