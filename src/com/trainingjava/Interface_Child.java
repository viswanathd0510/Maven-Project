package com.trainingjava;

public class Interface_Child implements Interface_Demo, Interface_Demo1 {

	@Override
	public void house() {
System.out.println("IDBI Bank");		
	}

	@Override
	public void home_loan(float f) {
System.out.println(f+ "%");		
	}

	@Override
	public void car() {
System.out.println("IDBI Bank");		
	}

	@Override
	public void loan() {
System.out.println("8.5%");

	}
	
   public static void main(String[] args) {
	   
	   Interface_Child obj = new Interface_Child();
	   
	   obj.house();
	   obj.home_loan(7.5f);
	   obj.car();
	   obj.loan();
	
}
	

	
}
