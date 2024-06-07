package org.fun;

public class LargestNumberInArray {
	
	
	public static void main(String[] args) {
		
		
		int[] array= {5,7,45,56,100,1};
		
		int max=array[0];
		
		for(int i=1;i<array.length;i++) {
			
			if(max<array[i]) {
				
				max=array[i];
				
			}
			
			
		}
		
		System.out.println("the largest number in the array is" +max);
		
	}

}
