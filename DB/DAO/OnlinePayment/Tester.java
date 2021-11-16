package com.xworkz.DB.DAO.OnlinePayment;

public class Tester {

	public static void main(String[] args) {
		PhonePay pay = new PhonePay();
		
		pay.bookCylinder(264782381910L, 960);
		pay.creditCardBill(123244568987L,126393,1123);
		pay.fastageacharge("Axis Bank", "Ka-06-HN1825");
		pay.reacharge(9844040436L, 249);
	}
}
