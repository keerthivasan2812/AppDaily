package org.fun;

public class Time {
	
	
	public static void main(String[] args) {
		
		long in = System.nanoTime();
		
		int[] array=new int[20];
		
		for(int i=0;i<20;i++) {
			
			array[i]=i;
			
		}
		int target=15;
		
		for(int i=0;i<array.length;i++) {
			
			if(target==array[i]) {
				System.out.println("target found");
			}
			
		}
		
		long lo=(System.nanoTime()-in)/1000000;
		
		System.out.println(lo+"mls");
		
	}

}
