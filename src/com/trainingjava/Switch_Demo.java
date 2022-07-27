package com.trainingjava;

import java.util.Scanner;

public class Switch_Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		for (int i = 0; i <5; i++) {
			
		System.out.println("Enter Your Choice");
		
		int ATM = sc.nextInt();
		
		switch (ATM) {
		case 1:
			System.out.println("Balance Enquiry");
			break;
			
		case 2:
			System.out.println("Mini Statement");
			break;

		case 3:
			System.out.println("Cash Withdrawal");
			break;

		case 4:
			System.out.println("Pin Change");
			break;

		case 5:
			System.out.println("Account Statement");
			break;


		default:
			System.out.println("Wrong number entered");
			break;
		}
			
		}
	}

}
