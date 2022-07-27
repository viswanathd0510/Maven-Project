package com.trainingjava;

public class Overriding extends Overloading1 {

	@Override
	public void employee_info() {
		
		System.out.println("*****Employee Info*****");
		
	}
	
	@Override
	public void employee_Info(String fname, String lname) {
		super.employee_Info(fname, lname);
	}
	
	@Override
	public void employee_Info(String designation) {
		super.employee_Info(designation);
	}
	
public static void main(String[] args) {
		
	Overriding ref = new Overriding();

	ref.employee_info();
	ref.employee_Info("Viswanath", "Dharmalingam");
	ref.employee_Info("Team Leader");
	
	ref.employee_info();
	ref.employee_Info("Harina", "Shalini");
	ref.employee_Info("Team Leader");
	
	ref.employee_info();
	ref.employee_Info("Vidhya", "Viswanath");
	ref.employee_Info("Team Leader");
	
	ref.employee_info();
	ref.employee_Info("Kumar", "Krishna");
	ref.employee_Info("Team Leader");
	
	ref.employee_info();
	ref.employee_Info("Sasi", "Kumar");
	ref.employee_Info("Team Leader");
}
	
}
