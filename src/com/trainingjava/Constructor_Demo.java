package com.trainingjava;

public class Constructor_Demo {
	public Constructor_Demo() {
		
		System.out.println("Student");
	}
        public Constructor_Demo(String name) {
	    System.out.println("Student name:" +name);
}
        public static void main(String[] args) {
			Constructor_Demo c = new Constructor_Demo("Viswa");
			Constructor_Demo c1 = new Constructor_Demo();
		}
        
}
