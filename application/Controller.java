package application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import model.User;
import view.LoginScene;
import view.MenuScene;

public class Controller {

	// reference to window (used for switching between scenes)
	private Stage primaryStage;
	// reference to start scene
	private LoginScene loginScene;
	// reference to menu scene
	private MenuScene menuScene;

	public Controller(Stage primaryStage){
		this.primaryStage = primaryStage;
		loginScene = new LoginScene(this);
		menuScene = new MenuScene(this);
		loadStartScene();
	}
	
	// show start scene in window
	public void loadStartScene() {
		loginScene.resetComponents();
		primaryStage.setScene(loginScene);
	}
	
	// show menu scene in window
	public void loadMenuScene() {
		primaryStage.setScene(menuScene);
		primaryStage.show();
	}
}
