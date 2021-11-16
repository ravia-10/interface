package com.xworkz.DB.DAO.Animal;

public class Dog implements Animal {

	public Dog() {
		System.out.println("inside the dog");
	}

	public void eat() {
		System.out.println("Dog is eating");
	}

	public void move() {
		System.out.println("dog is moving");
	}

	public void bark() {
		System.out.println("dog is barking");
	}

}
