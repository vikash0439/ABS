package com.abs.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service")
public class Service {
	
	@Id
	
	private long id;
	private String serviceName;
	private String serviceCharge;
	private String cancelCharge;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public String getCancelCharge() {
		return cancelCharge;
	}
	public void setCancelCharge(String cancelCharge) {
		this.cancelCharge = cancelCharge;
	}
	
	public Service() {
		
	}
	
	
	public Service(long id, String serviceName, String serviceCharge, String cancelCharge) {
		super();
		this.id = id;
		this.serviceName = serviceName;
		this.serviceCharge = serviceCharge;
		this.cancelCharge = cancelCharge;
	}
	
	
	

}
