package com.xworkz.DB.DAO.SoftwareEditors;

public class VsCode implements SoftwareEditors {
	
	public VsCode() {
		System.out.println("inside the vscode");
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
