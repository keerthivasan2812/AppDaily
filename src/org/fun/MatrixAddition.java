package org.fun;

public class MatrixAddition {
	
	public static void main(String[] args) {
		
		int[][] array= {{6,7,8},{7,8,9}};
		
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			
			
			for(int j=0;j<array[i].length;j++) {
				
				sum+=array[i][j];
				
				int k=array[i][j];
				
				System.out.print(k +" ");
				
				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
		System.out.println(sum);
		
		
		
		
	}
	
	

}
