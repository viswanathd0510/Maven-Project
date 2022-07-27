package com.practicejava;

public class Specialcharacter_Remove {
	
	public static void main(String[] args) {
		
		String ab= "My#Name%Is^Viswanath*Dharmalingam&.";   
		ab = ab.replaceAll("[^a-zA-Z0-9]", " ");  
		System.out.println(ab);  
		
	}

}
