package view;

import application.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

	private Controller controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		// create controller object which also sets up scenes
		controller = new Controller(primaryStage);
		// set window title
		primaryStage.setTitle("Welcome");
		// show window
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
