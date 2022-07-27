package com.trainingjava;

public class StringType_Demo {
	public static void main(String[] args) {
			
		String v1 = "Viswanath";
		String v2 = "D";
		System.out.println("Immutable");
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
		String r = v1.concat(v2);
		System.out.println(r);
		System.out.println(System.identityHashCode(r));
		
		StringBuffer p = new StringBuffer("Viswanath");
		StringBuffer p1 = new StringBuffer("Dharmalingam");
		System.out.println("mutable");
		System.out.println(System.identityHashCode(p));
		System.out.println(System.identityHashCode(p1));
		p.append(p1);
		System.out.println(p);
		System.out.println(System.identityHashCode(p));	
	}
	

}
