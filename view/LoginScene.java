package view;

import application.Controller;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import model.User;
import model.UserDatabase;

public class LoginScene extends Scene {
	
	private UserDatabase myUserDatabase;
	// reference to controller
	private Controller controller;
	// main layout pane
	private static VBox mainPane = new VBox();
	// label for quote
	private Label quoteLabel;
	// label for title of app
	private Label startLabel;
	// label for username
	private Label usernameLabel;
	
	// label for password
	private Label passwordLabel;
	// textfield for username
	private TextField usernameTxtField;
	// textfield for password
	private PasswordField passwordTxtField;
	// button to start game
	private Button loginBtn;
	
	public LoginScene(Controller controller){
		super(mainPane);
		this.controller = controller;
		myUserDatabase = new UserDatabase();
		mainPane.setSpacing(40);
		mainPane.setPadding(new Insets(50, 50, 50, 50));
		mainPane.setAlignment(Pos.CENTER);
		createComponents();
	}
	
	// set up components in pane
	public void createComponents(){
		// label for quote
		quoteLabel = new Label("\"Keep track of your finances easily\""); 
		quoteLabel.setAccessibleText("Helpful application to keep track of finances"); 
		quoteLabel.setFont(Font.font("Chalkduster", 25)); 
		quoteLabel.setWrapText(true);
		quoteLabel.setTextAlignment(TextAlignment.CENTER);
		
		// label for title
		startLabel = new Label("Portfolio Manager");
		startLabel.setAccessibleText("Title of application");
		startLabel.setFont(Font.font("Arial", 50));
		
		// label for username
		usernameLabel = new Label("Username:");
		usernameLabel.setAccessibleText("Username:");
		
		// textfield for username
		usernameTxtField = new TextField();
		usernameTxtField.setAccessibleText("Please enter your username here");
		usernameTxtField.setPromptText("Enter username here");
		
		// label for password
		passwordLabel = new Label("Password:");
		passwordLabel.setAccessibleText("Password:");
		
		// textfield for password
		passwordTxtField = new PasswordField();
		passwordTxtField.setAccessibleText("Please enter your password here");
		passwordTxtField.setPromptText("Enter password here");
		
		// set up button to log in
		loginBtn = new Button("Login"); 
		loginBtn.setAccessibleHelp("Press this button to login"); 
		loginBtn.setOnAction(e->{
			// make a new user based on use	username/password
			User tempUser = new User(usernameTxtField.getSelectedText(), passwordTxtField.getSelectedText());
			// add that user to the big user database
			myUserDatabase.addUserToList(tempUser);
			// load the next (menu) scene
			controller.loadMenuScene();
		});
		// add components to main pane
		mainPane.getChildren().addAll(startLabel, quoteLabel, usernameLabel, usernameTxtField, 
				passwordLabel, passwordTxtField, loginBtn);
	}
	
	// reset components whenever scene is loaded
	public void resetComponents(){
		usernameTxtField.clear();
		passwordTxtField.clear();
	}	
}
