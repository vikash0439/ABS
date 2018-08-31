package com.abs.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DashboardController implements Initializable{

	
	@FXML
	public void service(ActionEvent event) throws IOException {	
	
		Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();  //calling the stage of first fxml page
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/service.fxml"));
		Scene scene = new Scene(root);				
		scene.getStylesheets().add(getClass().getResource("/styles/application.css").toExternalForm());		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Service || ABS");
		primaryStage.show();
		
		}		
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
