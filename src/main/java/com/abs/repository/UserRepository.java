package com.abs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abs.bean.User;


public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmailAndPassword(String email, String password);

}
