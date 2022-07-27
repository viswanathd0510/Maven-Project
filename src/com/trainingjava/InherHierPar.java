package com.trainingjava;

public class InherHierPar {

	public void house() {
System.out.println("House");
	}
	public void land() {
System.out.println("Land");
	}
	public void car() {
System.out.println("Benz");
	}
	public static void main(String[] args) {
		InherHierPar obj = new InherHierPar();
		
		obj.house();
		obj.land();
		obj.car();
	}
}
