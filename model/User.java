// Shamit Bhatia
// Shamitbh@usc.edu
// ITP 368
// Fall 2017
package model;

import java.util.ArrayList;
/* This class to represent all the information about a 
   single user that logs into the app.
 */

public class User {
	// private instance variables
	private String username;
	private String password;
	// list of Stocks in portfolio for specific user
	private ArrayList<Stock> listOfStocks;
	
	public User(String username, String password, ArrayList<Stock> listOfStocks) {
		this.username = username;
		this.password = password;
		this.listOfStocks = listOfStocks;
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Stock> getListOfStocks() {
		return listOfStocks;
	}

	public void setListOfStocks(ArrayList<Stock> listOfStocks) {
		this.listOfStocks = listOfStocks;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", listOfStocks=" + listOfStocks + "]";
	}
	
	
}
