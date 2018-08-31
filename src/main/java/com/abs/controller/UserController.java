package com.abs.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;

import com.abs.service.UserService;

import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

public class UserController implements Initializable{   // implementing initializable declare the class as controller
	
	@FXML
	private TextField emailField;
	
	@FXML 
	private PasswordField passwordField;
	
	@Autowired 
	private UserService userService;
	
	@FXML
	public void login(ActionEvent event) throws IOException {	
		String email = emailField.getText();
		String password = passwordField.getText();
		if(email.equals("admin") && password.equalsIgnoreCase("admin")) {
			
			Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();  //calling the stage of first fxml page
			Parent root = FXMLLoader.load(getClass().getResource("/fxml/dashboard.fxml"));
			Scene scene = new Scene(root);				
			scene.getStylesheets().add(getClass().getResource("/styles/application.css").toExternalForm());		
			primaryStage.setScene(scene);
			primaryStage.setTitle("Dashboard");
			primaryStage.show();
			
		}else {
			Alert al = new Alert(Alert.AlertType.ERROR);
			al.setTitle("Login failed");
			al.setHeaderText("Invalid credentials");
			al.setContentText("Try again");
			al.showAndWait();
		}
	}
	
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub		
		final Tooltip tooltipEmail = new Tooltip();
		tooltipEmail.setText("Enter your email ID here");
		emailField.setTooltip(tooltipEmail);
		
		final Tooltip tooltipPassword = new Tooltip();
		tooltipPassword.setText("Enter your password here");
		passwordField.setTooltip(tooltipPassword);		
	}

}
