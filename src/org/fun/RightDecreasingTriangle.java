package org.fun;

public class RightDecreasingTriangle {
	
	
	
	public static void main(String[] args) {
		
		
		
		int row=6;
		
		for(int i=0;i<=row;i++) {
			
			for(int space=0;space<i+1;space++) {
				
				System.out.print("  ");
			}
			
			for(int j=row;j>=i;j--) {
				
				System.out.print("*"+" ");
				
				
				
			}
			System.out.println();
			
			
			
		}
		
		
		
		
	}
	

}