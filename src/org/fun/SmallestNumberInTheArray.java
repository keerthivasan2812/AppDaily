package org.fun;

public class SmallestNumberInTheArray {
	
	
	public static void main(String[] args) {
		
		int[] array= {56,78,34,3,6};
		
		int min=array[0];
		
		for(int i=1;i<array.length;i++) {
			
			if(min>array[i]) {
				
				
				min=array[i];
				
			}
			
			
		}
		
		System.out.println(min);
		
	}

}
