package com.shruti.demo;

class Employeed{
	int id;
	String name;
	
	public void show(){
		System.out.println( name+ " "+id);
	}
}

public class Employee {

	public static void main(String[] args) {
		Employeed e1 = new Employeed();
		Employeed e2 = new Employeed();
		
		e1.name="shreya";
		e1.id=98;
		
		e2.name="john";
		e2.id=90;
		
		e1.show();
		e2.show();

	}

}
