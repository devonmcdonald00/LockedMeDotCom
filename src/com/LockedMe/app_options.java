package com.LockedMe;

public class app_options {
	private int state = 0;
	private int option = 0;
	private boolean quit = false;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getOption() {
		return this.option;
	}
	public void setOption(int option) {
		this.option = option;
	}
	
	public void displayMenu() {
		if(this.state == 0) {
			System.out.println("Select on of the below options:");
			System.out.println("1) List all files from directory");
			System.out.println("2) Navigate to file operations");
			System.out.println("3) Quit");
		}
		else {
			System.out.println("Select on of the below options:");
			System.out.println("1) Add a file to directory");
			System.out.println("2) Delete a file from directory");
			System.out.println("3) Search for file from directory");
			System.out.println("4) Go back to main menu");
		}
	}
	
	
}
