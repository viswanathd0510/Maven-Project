package com.trainingjava;

public class NarrowCasting_Demo {
	
	public static void main(String[] args) {
		
		double d =10.0;
		long l = (long) d;
		int i = (int)l;
		
		System.out.println("Double Value :"+d);
		System.out.println("Long Value :"+l);
		System.out.println("Int Value :"+i);
	
	}

}
