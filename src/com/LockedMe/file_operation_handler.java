package com.LockedMe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file_operation_handler {
	
	private String directory = "./files/";
	
	public void listFiles() {
		String[] all_files;
		File f = new File(directory);
		
		all_files = f.list();
		
		if(all_files.length != 0) {
			for(String file : all_files) {
				System.out.println(file);
			}
		}
		else {
			System.out.println("Currently there are no files in the directory...\n");
		}
		
		System.out.print("\n");
	}
	
	public void addFile(String fileName, String text) {
		File f = new File(this.directory + fileName);
		try {
			if(f.createNewFile()) {
				System.out.println("\nCreated file -> " + fileName + "\n");
			}
			else {
				System.out.println("\nFile not created because it already exists...\n");
			}
			
			//Write lines given
			
			try {
				FileWriter fw = new FileWriter(directory + fileName);
				fw.write(text);
				System.out.println("\nSuccesfully wrote lines given to file...\n");
				fw.close();
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
		}
		catch(IOException e) {
			System.out.println("An error occurred.\n");
		    e.printStackTrace();
		}
		
	}
	
	public void deleteFile(String fileName) {
		File f = new File(this.directory + fileName);
		if(f.delete()) {
			System.out.println("\nDeleted the file -> " + fileName + "\n");
		}
		else {
			System.out.println("\nFailed to delete the file given...\n");
		}
	}
	
	public void searchFile(String fileName) {
		File f = new File(this.directory + fileName);
		if(f.exists()) {
			System.out.println("\nThe file exists\n");
		}
		else {
			System.out.println("\nThe file does not exists\n");
		}
	}
}
