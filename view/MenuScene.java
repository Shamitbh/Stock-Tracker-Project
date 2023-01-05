package view;

import application.Controller;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.User;

public class MenuScene extends Scene{

	// reference to controller
	private Controller controller;
	// main layout pane
	private static VBox mainPane = new VBox();
	// label for thing	
	private Label myLabel;
	private Button logoutButton;
	private HBox topHbox = new HBox(25);
	private Label choiceLabel;
	private HBox buttonHbox = new HBox(25);
	private Button buyStockBtn;
	private Button seeDashboardBtn;
	
	public MenuScene(Controller controller){
		super(mainPane);
		this.controller = controller;
		mainPane.setSpacing(40);
		mainPane.setPadding(new Insets(50, 50, 50, 50));
		mainPane.setAlignment(Pos.CENTER);
		createComponents();
	}

	private void createComponents() {
		// TODO Auto-generated method stub
		
		myLabel = new Label("Welcome, Shamit!");
		logoutButton = new Button("Logout");
		topHbox.getChildren().addAll(myLabel, logoutButton);
		
		choiceLabel = new Label("What would you like to do?");		
		
		buyStockBtn = new Button("Buy Stock");
		buyStockBtn.setPrefSize(100, 100);
		seeDashboardBtn = new Button("See my Dashboard");
		seeDashboardBtn.setPrefSize(100, 100);
		// add buttons to hbox
		buttonHbox.getChildren().addAll(buyStockBtn, seeDashboardBtn);
		
		mainPane.getChildren().addAll(topHbox, choiceLabel, buttonHbox);
	}

}
