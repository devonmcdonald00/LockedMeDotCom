package com.LockedMe;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LockedMe App Prototype...\n");
		System.out.println("Authored By: Devon McDonald");
		System.out.println("Created: 04/03/2021");
		System.out.println("Organization: Dell Technologies\n");
		
		Scanner s = new Scanner(System.in);
		
		app_options menu = new app_options();
		file_operation_handler file_ops = new file_operation_handler();
		
		while(menu.getState() != 0 || menu.getOption() != 3) {
			menu.displayMenu();
			menu.setOption(s.nextInt());
			
			if(menu.getState() == 0) {
				switch(menu.getOption()) {
					case(1):
						System.out.println("Listing all files...\n");
						menu.setOption(1);
						file_ops.listFiles();
						break;
					case(2):
						System.out.println("Going to main menu...\n");
						menu.setState(1);
						menu.setOption(2);
						break;
					case(3):
						System.out.println("Quitting application...\n");
						menu.setOption(3);
						break;
					default:
						System.out.println("Please select one of the available options...\n");
						break;
				}
			}
			else {
				String filename;

				switch(menu.getOption()) {
					case(1):
						System.out.println("Adding a file...\n");
						menu.setOption(1);
						s.nextLine();
						System.out.print("Please enter the name of the file to add: ");
						filename = s.nextLine();
						System.out.println(filename);
						System.out.print("Please enter the text to add to the file: ");
						String text = s.nextLine();
						file_ops.addFile(filename, text);
						break;
					case(2):
						System.out.println("Deleting a file...\n");
						menu.setOption(2);
						s.nextLine();
						System.out.print("Please enter the name of the file to add: ");
						filename = s.nextLine();
						file_ops.deleteFile(filename);
						break;
					case(3):
						System.out.println("Searching for a file...\n");
						menu.setOption(3);
						s.nextLine();
						System.out.print("Please enter the name of the file to search: ");
						filename = s.nextLine();
						file_ops.searchFile(filename);
						break;
					case(4):
						System.out.println("Navigating to main menu...\n");
						menu.setState(0);
						menu.setOption(4);
						break;
					default:
						System.out.println("Please select one of the available options...\n");
						break;
				}
			}
		}
		
		
	}

}

