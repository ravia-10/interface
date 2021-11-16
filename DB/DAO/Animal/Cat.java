package com.xworkz.DB.DAO.Animal;

public class Cat implements Animal {

	public Cat() {
		System.out.println("inside the cat");
	}

	public void eat() {

		System.out.println("cat is eating");

	}

	public void move() {
		System.out.println("cat is moving");
	}

	public void makeSound() {
		System.out.println("cat make sound 'meow' ");
	}
}
