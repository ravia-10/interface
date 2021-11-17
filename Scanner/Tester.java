package com.xworkz.Scanner;

import com.xworkz.Scanner.DAO.ScannerDaoImpl;
import com.xworkz.Scanner.DTO.ScannerDTO;

public class Tester {

	public static void main(String[] args) {
		
	ScannerDaoImpl sc = new ScannerDaoImpl("samsung","black",true,23,3,23000);
	
	ScannerDTO  samsung = new ScannerDTO("samsung","black",true,23,3,23000);
	sc.saveDto(samsung);
	

	ScannerDTO  LG = new ScannerDTO("LG","white",true,16,2,20000);
	sc.saveDto(LG);
	

	ScannerDTO  Pi = new ScannerDTO("pi","black",false,20,3,10000);
	sc.saveDto(Pi);
	

	ScannerDTO  panasonic= new ScannerDTO("panasonic","white",false,19,4,30000);
	sc.saveDto(panasonic);
	

	ScannerDTO  Dell= new ScannerDTO("Dell","black",true,21,2,21000);
	sc.saveDto(Dell);
	
	sc.displayScanner();
	sc.displayByBrandName("LG");
	
	sc.updateByBrandName("LG",22000);
	sc.displayScanner();
	
	sc.deleteByBrandName("LG");
	sc.displayScanner();
	
	}

}
