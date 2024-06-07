package org.fun;

public class MathathematicalOperations {
	
	
	
	
	public static void main(String[] args) {
		
		
		int a=7;
		int b=8;
		
		int i = Math.incrementExact(a);
		
		System.out.println(i);
		
		int add = Math.addExact(a, b);
		
		System.out.println(add);
		
		Math.subtractExact(a, b);
		double g = Math.random()*5;
		System.out.println(g);
		
		double pow = Math.pow(6, 2);
		
		System.out.println(pow);
		long round = Math.round(g);
		System.out.println(round);

		int min = Math.min(a, b);
		System.out.println(min);
		
		int max = Math.max(a, b);
		System.out.println(max);
		
		double sqrt = Math.sqrt(a);
		System.out.println(sqrt);
		
		long round2 = Math.round(sqrt);
		
		System.out.println(round2);
		
		
	}

}
