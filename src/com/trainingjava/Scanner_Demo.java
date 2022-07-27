package com.trainingjava;

import java.util.Scanner;

public class Scanner_Demo {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String s1 =s.nextLine();
		System.out.println(s1);
		
		System.out.println("Enter Your ID");
		int s2 = s.nextInt();
		System.out.println(s2);
		
		
		System.out.println("Enter your percentage");
		float s3 = s.nextFloat();
		System.out.println(s3);
		
		System.out.println("Enter your Class");
		Character s4 = s.next().charAt(0);
		System.out.println(s4);
		
	}

}
