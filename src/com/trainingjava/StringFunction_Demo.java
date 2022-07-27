package com.trainingjava;

public class StringFunction_Demo {
	
	public static void main(String[] args) {
		
String a = "Viswanath Dharmalingam";
		
		int length = a.length();
		System.out.println("String length is "+length);
		
		boolean equals = a.equals(a);
		System.out.println("Condition ="+equals);
		
		boolean equalsignorecase = a.equalsIgnoreCase(a);
		System.out.println("Ignore the case ="+equalsignorecase);
		
		String uppercase = a.toUpperCase();
		System.out.println("Change the letter="+uppercase);
		
		String lowercase = a.toLowerCase();
		System.out.println("Change the letter="+lowercase);
		
		boolean startswith = a.startsWith(a);
		System.out.println("Prefix is="+startswith);
		
		boolean endswith = a.endsWith(a);
		System.out.println("Suffex is="+endswith);
		
		boolean contains = a.contains("ma");
		System.out.println("a.contains(True or False) ="+contains);
		
		int indexOf = a.indexOf("in");
		System.out.println("Index of Character="+indexOf);
		
		int lastindexOf = a.lastIndexOf(a);
		System.out.println("Last IndexOf Character="+lastindexOf);
		
		char CharAt = a.charAt(8);
		System.out.println("Indexed based character 0-10="+CharAt);
		
		String replace = a.replace("Viswanath","v");
		System.out.println("Replace the words="+replace);
		
	
	}

}
