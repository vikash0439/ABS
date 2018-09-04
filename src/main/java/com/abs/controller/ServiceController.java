package com.abs.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;

import com.abs.bean.Service;
import com.abs.service.ServiceService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ServiceController implements Initializable{
	
	@FXML TextField serviceId;
	@FXML TextField serviceName;
	@FXML TextField serviceCharge;
	@FXML TextField cancelCharge;
	
	@Autowired
	private ServiceService serviceService;
	
	@FXML
	public void ServiceSave(ActionEvent event) {
		
		Service service = new Service();
		service.setId(Long.parseLong(serviceId.getText()));
		service.setServiceName(serviceName.getText());
		service.setServiceCharge(serviceCharge.getText());
		service.setCancelCharge(cancelCharge.getText());
		
		serviceService.saveService(service);
		
		Alert al = new Alert(Alert.AlertType.CONFIRMATION);
		al.setTitle("Saved");
		al.setHeaderText("Service updated successfully");
		al.setContentText("This service have been updated successfully.");
		al.showAndWait();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub		
	}

}
