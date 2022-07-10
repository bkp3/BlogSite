package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dto.RegisterRequest;
import com.blog.model.User;
import com.blog.repository.UserRepository;

@Service
public class AuthService {

	@Autowired
	UserRepository userRepository;

	public void signup(RegisterRequest registerRequest) {
		User user = new User();
		user.setUserName(registerRequest.getUsername());
		user.setEmail(registerRequest.getEmail());
		user.setPassword(registerRequest.getPassword());
		userRepository.save(user);
	}

}
