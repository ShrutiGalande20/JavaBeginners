	package com.shruti.demo;
	
	import java.util.Scanner;
	
	public class HelloWOrld {
	
		public static void main(String[] args) {
			System.out.println("hh");
			Scanner keyBoard = new Scanner(System.in);
			System.out.println("how many rows do you want?");
			int rows = keyBoard.nextInt();
			System.out.println("here goes your rows");
			for(int i=1; i<=rows; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(j+ " ");
				}
				System.out.println();
			}
		
		}
	
	}
