package com.abs.service;

import com.abs.repository.UserRepository;

public class UserService{
	
   private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public boolean check(String email, String password) {
		if (userRepository.findByEmailAndPassword(email, password)) {
		return true ;
		}else
	return false;
	}

}
