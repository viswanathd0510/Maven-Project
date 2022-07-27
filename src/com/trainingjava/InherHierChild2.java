package com.trainingjava;

public class InherHierChild2 extends InherHierPar{

	public void bike() {
System.out.println("Royal Enfield");
	}
	
	public static void main(String[] args) {
		InherHierChild2 obj = new InherHierChild2();
		
		obj.bike();
		obj.car();
		obj.house();
		obj.land();
	}
	
}





