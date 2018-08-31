package com.abs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abs.bean.Service;

public interface ServiceRepository extends JpaRepository<Service, Integer>{

}
