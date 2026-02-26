package com.shruti.demo;

import java.util.Scanner;

class HDFC{
	private int customerID;
	public String customerName;
	float balance=1000000.5f;
	public void withdraw(float amountWithdraw) {
		balance=balance-amountWithdraw;
		System.out.println("Updated balance is " +balance);
	}
	public void deposite(float amountWithdraw) {
		balance=balance+amountWithdraw;
		System.out.println("Updated balance is " +balance);
	}
}

public class HDFCBankTest {

	public static void main(String[] args) {
		HDFC obj = new HDFC();
		System.out.println("Welcome to HDFC bank, we are happy to help you!");
		System.out.println("Please press 1 for withdraw");
		System.out.println("Please press 2 for deposit");
		System.out.println("Please press 3  for adding nominee to your account: ");
		System.out.println("Please press 4  for adding payee to your account: ");
		System.out.println("Please press 5 for exit ");
		Scanner keyBoard = new Scanner(System.in);
		int choice;
		choice=keyBoard.nextInt();
		System.out.println("Thank you!. you have chosen option " +choice);
		if(choice==1) {
			System.out.println("Please enter the amount you want to withdraw");
			float amountWithdraw = keyBoard.nextFloat();
			obj.withdraw(amountWithdraw);
		}
		else if(choice==2) {
			System.out.println("Please enter the amount you want to deposite");
			float amountWithdraw = keyBoard.nextFloat();
			obj.deposite(amountWithdraw);
		}
		else if(choice==5) {
			System.out.println("Thankyou for using HDFC bank service, We are happy to help! :");
		}
		
	}

}