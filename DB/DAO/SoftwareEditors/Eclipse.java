package com.xworkz.DB.DAO.SoftwareEditors;

public class Eclipse implements SoftwareEditors {

	public Eclipse() {
		System.out.println("inside the Eclipse");
	}

	
	public void addFile(String filename) {
		 System.out.println("added a new file");
		
	}

	public void openFile(String filename) {
		System.out.println("open the file");
		
	}

	
	public void saveFile(String filename) {
		System.out.println("file is saved");
	}

	
	public void help() {
		System.out.println("help sections");
	}

}
