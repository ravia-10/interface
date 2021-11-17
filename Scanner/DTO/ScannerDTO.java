package com.xworkz.Scanner.DTO;

public class ScannerDTO {

	private String Brand;
	private String color;
	private boolean wifi;
	private int lenght;
	private int cartrig;
	private int price;

	public ScannerDTO(String brand, String color, boolean wifi, int lenght,
			int cartrig, int price) {
		System.out.println("scannerdto is created");
		this.Brand = brand;
		this.color = color;
		this.wifi = wifi;
		this.lenght = lenght;
		this.cartrig = cartrig;
		this.price = price;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		this.Brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getCartrig() {
		return cartrig;
	}

	public void setCartrig(int cartrig) {
		this.cartrig = cartrig;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
