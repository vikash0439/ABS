package com.abs.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.abs.bean.User;
import com.abs.repository.UserRepository;

@Service
@Transactional
public class UserService{
	
   private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User check(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
   }
}
