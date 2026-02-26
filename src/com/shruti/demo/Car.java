package com.shruti.demo;

class Carr{
	String color;
	String model;
	
	public void show() {
		System.out.println(color+ " " +model);
	}
}

public class Car {

	public static void main(String[] args) {
		Carr c1 = new Carr();
		
		c1.color="red";
		c1.model="BMW";
		
		c1.show();
		

	}

}
