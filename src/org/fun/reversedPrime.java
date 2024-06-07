package org.fun;

public class reversedPrime {
	
	
	
	private static StringBuilder reverse;

	public static void main(String[] args) {
		
		isReversedPrime(29);
		if(isReversedPrime(29)) {
			
			System.out.println("it is a reversed prime");
			
		}else {
			
			System.out.println("it is not a reversed prime");
		}
		
	}

	
	static boolean isPrime(int k){
		
		
		if(k<=1) {
			return false;
		}
		
		for(int i=2;i<Math.sqrt(k);i++) {
			if(i%k==0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static boolean isReversedPrime(int k) {
		
		
		String val = String.valueOf(k);
		
		StringBuilder reversedVal = new StringBuilder();
		
		for(int i=val.length()-1;i>0;i--) {
			
			char c = val.charAt(i);
			
			 reversedVal.append(c);
		}
		
		int ps = Integer.parseInt(reversedVal.toString());
		
		System.out.println(ps);
		
		return isPrime(ps);
		
	}
	
}
