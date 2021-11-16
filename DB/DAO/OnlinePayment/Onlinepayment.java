package com.xworkz.DB.DAO.OnlinePayment;

public interface Onlinepayment {
	
	public void  reacharge(long number , int amount);
	public void bookCylinder(long cylinderId , int amount);
	public void creditCardBill(long creditCardNumber, int billNumber , int amount);
	public void fastageacharge(String fastagBank , String vechicleRegistrationNumber);
}
