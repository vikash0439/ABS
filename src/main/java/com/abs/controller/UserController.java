package com.abs.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
	
	@FXML
	public void login(ActionEvent event) throws IOException {	
		Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();  //calling the stage of first fxml page
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/home.fxml"));
		Scene scene = new Scene(root);				
		scene.getStylesheets().add(getClass().getResource("/styles/application.css").toExternalForm());		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Dashboard");
		primaryStage.show();
	}
	
	
	@FXML 
	public void alert(ActionEvent event) throws IOException {	   //creating an alert box
		
		Alert al = new Alert(Alert.AlertType.INFORMATION);
		al.setTitle("Information");
		al.setHeaderText("Plaese read carefully!");
		al.setContentText("12:44:12.409 [main] DEBUG com.abs.AbsApplication - Logging from At com.abs packaged");
		al.showAndWait();
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
