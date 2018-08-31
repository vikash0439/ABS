package com.abs.service;

import com.abs.bean.Service;
import com.abs.repository.ServiceRepository;

@org.springframework.stereotype.Service
public class ServiceService{
	
   private final ServiceRepository serviceRepository;
	
	public ServiceService(ServiceRepository serviceRepository) {
		this.serviceRepository = serviceRepository;
	}
	
	public void saveService(Service service) {
		System.out.println("From saveService method");
		serviceRepository.save(service);
	}

}
