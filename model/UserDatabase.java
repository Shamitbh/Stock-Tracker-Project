package model;

import java.util.ArrayList;

public class UserDatabase {

	// list of Users in application
	private ArrayList<User> usersList;

	public UserDatabase() {
		this.usersList = new ArrayList<>();
	}
	
	public ArrayList<User> getUserList() {
		return usersList;
	}
	
	public void addUserToList(User tempUser) {
		usersList.add(tempUser);
	}
	
}
