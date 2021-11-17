package com.xworkz.Scanner.DAO;

import com.xworkz.Scanner.DTO.ScannerDTO;

public interface ScannerDAO {
	
	public void saveDto(ScannerDTO dto);
	public void displayScanner();
	public void displayByBrandName(String brand);
	public void updateByBrandName(String brand, int newPrice);
	public void deleteByBrandName(String brand); 

}