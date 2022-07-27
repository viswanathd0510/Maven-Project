package com.trainingjava;

public class Key_Demo1 extends Key_Demo {
	
	int d=100;
	
	private void numbers() {
		
		int d =150;
		
		System.out.println(d);
		System.out.println(super.d);
		System.out.println(this.d);
		
	}

	public static void main(String[] args) {
		
		Key_Demo1 k = new Key_Demo1();
		k.numbers();
		
	}
}
