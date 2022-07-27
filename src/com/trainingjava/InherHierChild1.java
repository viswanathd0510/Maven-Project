package com.trainingjava;

public class InherHierChild1 extends InherHierPar {

	public void phone() {
System.out.println("Samsung");
	}
	public static void main(String[] args) {
		InherHierChild1 obj = new InherHierChild1();
		
		obj.phone();
		obj.land();
		obj.house();
		obj.car();
			
	}
}
