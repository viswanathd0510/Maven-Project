package com.trainingjava;

public class Overloading1{

      public void employee_info() {

    	  System.out.println("*****Employee_Information*****");
}
    public void employee_Info(String fname, String lname) {
   
   System.out.println("Employee_Name 1: " + fname + lname);
   }
    
    public void employee_Info(int id) {
System.out.println("Employee_Id:" + id);
	}
    
   public void employee_Info(String designation) {
System.out.println("Employee_Designation:" +designation);
}

    public static void main(String[] args) {
        Overloading1 ref = new Overloading1();

        ref.employee_info();
        ref.employee_Info("Viswanath");
        ref.employee_Info(135289);
        ref.employee_Info("Team Leader");
       System.out.println('\n');
       ref.employee_info();
       ref.employee_Info("Harina");
       ref.employee_Info(145268);
       ref.employee_Info("Team Leader");
        System.out.println('\n');
        ref.employee_info();
        ref.employee_Info("Vidhya");
        ref.employee_Info(145789);
        ref.employee_Info("Team Leader");
        System.out.println('\n');
        ref.employee_info();
        ref.employee_Info("Rakesh");
        ref.employee_Info(145789);
       ref.employee_Info("Team Leader");
       System.out.println('\n');
       ref.employee_info();
       ref.employee_Info("Ganesh");
       ref.employee_Info(178954);
       ref.employee_Info("Team Leader");
    
	}

	
}
	
	
	
	
	
	
	
	
	
	
	
	


