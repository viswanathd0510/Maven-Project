package com.trainingjava;

public abstract class Abss_Demo extends Abs_Demo {

	@Override
	public void employee_salary() {
    System.out.println("10LPA");
	}
	
	@Override
	public void company_name() {
System.out.println("TCS");		
	}
		
public static void main(String[] args) {
	Abss_Demo obj = new Abss_Demo() {
	};
	
	obj.Employee_Data();
	obj.employee_salary();
	obj.company_name();	
}
	
}
