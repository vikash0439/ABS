package com.abs.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.abs.bean.User;

@Service
@Transactional
public interface UserRepository extends JpaRepository<User, Integer>{

	boolean findByEmailAndPassword(String email, String password);

}
