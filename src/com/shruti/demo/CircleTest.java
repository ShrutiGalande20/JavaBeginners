package com.shruti.demo;
//multilevel Inheritance
class Shape{
	int length;
	int width;
	public void printDimentions() {
		System.out.println("Print dimentions of different shapes");
	}
}

class Polygon extends Shape{
	
}

class Circle extends Polygon{
	int radius=2;
	int diameter = radius*2;
	public void printdiameter() {
		System.out.println("Daimeter printed");
	}
}

public class CircleTest {

	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.printdiameter();
		System.out.println(obj.radius + " radius");
		System.out.println(obj.diameter + " diameter");
	}

}
