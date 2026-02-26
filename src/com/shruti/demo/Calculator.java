package com.shruti.demo;
//Overloading


public class Calculator {
	
	public void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of the two numbers is " +sum);
	}
	
	public void add(float num1, float num2) {
		float sum = num1 + num2;
		System.out.println("Sum of the two numbers is " +sum);
	}
	
	public void add(int num1, float num2) {
		float sum = num1 + num2;
		System.out.println("Sum of the two numbers is " +sum);
	}
	
	public void add(float num1, int num2) {
		float sum = num1 + num2;
		System.out.println("Sum of the two numbers is " +sum);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(2, 10);
		obj.add(5.6f, 7.8f);
		obj.add(3.6f, 5);
		obj.add(7,2.4f);
	}

}
