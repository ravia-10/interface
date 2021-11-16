package com.xworkz.DB.DAO.SoftwareEditors;

public class SublimeText implements SoftwareEditors {

	public SublimeText() {
		System.out.println("inside the sublime text");
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
