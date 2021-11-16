package com.xworkz.DB.DAO.OnlinePayment;

public class GooglePay implements Onlinepayment {

	public GooglePay() {
		System.out.println("inside Googlepay");
	}

	public void reacharge(long number, int amount) {
		System.out.println("successfully recharged to " + number);

	}

	public void bookCylinder(long cylinderId, int amount) {
		System.out.println("Cylinder is booked");
	}

	public void creditCardBill(long creditCardNumber, int billNumber, int amount) {
		System.out.println("credit card bill payed");
	}

	public void fastageacharge(String fastagBank,String vechicleRegistrationNumber) {
		System.out.println("fastag is recharged successfully to "
				+ vechicleRegistrationNumber);
	}

}
