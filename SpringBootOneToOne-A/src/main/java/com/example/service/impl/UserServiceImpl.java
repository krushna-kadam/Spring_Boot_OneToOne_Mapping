package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	// inject Repository
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub

		User u = userRepository.save(user);

		return u;
	}

}
