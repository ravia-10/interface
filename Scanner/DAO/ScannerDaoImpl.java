package com.xworkz.Scanner.DAO;

import com.xworkz.Scanner.DTO.ScannerDTO;

public class ScannerDaoImpl extends ScannerDTO implements ScannerDAO {

	ScannerDTO scanner[] = new ScannerDTO[5];
	int index = 0;

	public ScannerDaoImpl(String brand, String color, boolean wifi, int lenght,
			int cartrig, int price) {
		super(brand, color, wifi, lenght, cartrig, price);
		System.out.println("inside the constructor of impl scanner");
		System.out.println();
	}

	@Override
	public void saveDto(ScannerDTO dto) {
		System.out.println("inside the save method");
		System.out.println();
		scanner[index] = dto;
		index++;

	}

	@Override
	public void displayScanner() {
		System.out.println("");
		System.out.println("display method invoked");
		System.out.println("-------------------");
		for (int i = 0; i < scanner.length; i++) {
			if (scanner[i] != null) {
				System.out.println(scanner[i].getBrand());
				System.out.println(scanner[i].getColor());
				System.out.println(scanner[i].getCartrig());
				System.out.println(scanner[i].getLenght());
				System.out.println(scanner[i].isWifi());
				System.out.println(scanner[i].getPrice());
				System.out.println("-------------------");
				System.out.println();

			}
		}
	}

	@Override
	public void displayByBrandName(String brand) {

		System.out.println("display by Name method invoked");
		for (int i = 0; i < scanner.length; i++) {
			if (scanner[i].getBrand().equals(brand)) {
				System.out.println(scanner[i].getBrand());
				System.out.println(scanner[i].getColor());
				System.out.println(scanner[i].getCartrig());
				System.out.println(scanner[i].getLenght());
				System.out.println(scanner[i].isWifi());
				System.out.println(scanner[i].getPrice());
			}

		}
	}

	@Override
	public void updateByBrandName(String brand, int newPrice) {
		System.out.println();
		System.out.println("update method invoked");
		for (int i = 0; i <scanner.length; i++) {
			if (scanner[i].getBrand().equals(brand)) {
				scanner[i].setPrice(newPrice);
				System.out.println("updated succesfuly");

			}
		}

	}


	@Override
	public void deleteByBrandName(String brand) {
		System.out.println();
		System.out.println("delete method invoked");
		for (int i = 0; i < scanner.length; i++) {
			if (scanner[i].getBrand().equals(brand)) {
				scanner[i] = null;
				System.out.println("item is deleted");
				

			}

		}

	}
	
}