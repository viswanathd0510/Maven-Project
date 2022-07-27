package com.trainingjava;

import java.util.Arrays;

public class Array_Demo {
	
	public static void main(String[] args) {
		
		int num[]=new int[5];
		
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=100;
		System.out.println(num[2]);
			
		
		int length =num.length;
		for (int i:num) {
	
			System.out.println(i);
			
		}
			System.out.println(Arrays.toString(num));
	}

}
