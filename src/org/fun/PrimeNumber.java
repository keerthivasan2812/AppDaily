package org.fun;

public class PrimeNumber {
	
	
	
	
	
	public static void main(String[] prime) {
		
		
	if(	isPrime(29)) {
		
		System.out.println("is prime number");
		
	}else {
		
		System.out.println("is not a prime number");
		
	}
		
			
		
		
		
		
		
	}
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			
			if(num%i==0) {
				return false;
				
			}
			
		}
		return true;
		
	}

}
