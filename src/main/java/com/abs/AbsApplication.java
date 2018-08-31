package com.abs;

import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

@SpringBootApplication
public class AbsApplication extends Application{   //Inheriting application class is the entry class of javaFX Applications
	
	private static final Logger LOG = getLogger(AbsApplication.class);  // logging slf4j logger

	public static void main(String[] args) {
		Application.launch(args);      //Launching a standalone application	
		LOG.debug("Logging from At com.abs package");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {  //start class is the main entry point of all javafx application
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/styles/application.css").toExternalForm());		
		Image applicationIcon = new Image(getClass().getResourceAsStream("/images/favicon.jpg"));   // setting favicon icon
        primaryStage.getIcons().add(applicationIcon);
		primaryStage.setScene(scene);
		primaryStage.setTitle("User Login");
		primaryStage.show();
	}
}
