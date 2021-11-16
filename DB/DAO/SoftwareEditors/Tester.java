package com.xworkz.DB.DAO.SoftwareEditors;

public class Tester {

	public static void main(String[] args) {
		SublimeText software = new SublimeText();
		
		software.addFile("testfile");
		software.openFile("testfile");
		software.saveFile("testfile");
		software.help();
	}

}
