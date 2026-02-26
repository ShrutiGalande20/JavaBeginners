package com.shruti.demo;
//Overriding

class Cat{
	String fur="hardBlack";
	public void jump() {
		System.out.println("Cats love to jump!");
	}
}

class Kitten extends Cat{
	String fur="softGrey";
	public void jump() {
		System.out.println("Kitten can jump but softly!");
	}
}

public class KittenTest {

	public static void main(String[] args) {
		Kitten obj = new Kitten();
		obj.jump();
		System.out.println(obj.fur);
	}

}
