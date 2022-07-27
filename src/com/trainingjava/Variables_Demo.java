package com.trainingjava;

public class Variables_Demo {
	
	static int n = 10;
	
	private void method() {
		int n = 20;
		System.out.println(n);

	}

	public static void main(String[] args) {
		
		Variables_Demo v = new Variables_Demo();
		v.method();
		System.out.println(n);
	}
}
