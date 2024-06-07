package org.fun;

import java.util.Scanner;

public class MatrixDiagonal {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter the number of row :");
		
		
		int rows=scan.nextInt();
		
		System.out.println("enter the number of columns :");
		
		int col=scan.nextInt();
		
		int[][] matrix=new int[rows][col];
		
		
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("enter thematrix elements :");
				matrix[i][j]=scan.nextInt();
			}
			
		}
		
		
		int aboveDiagonal=0;
		int belowDiagonal=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				
				if(j>i) {
					aboveDiagonal+=matrix[i][j];
				}else if(j<i) {
					belowDiagonal+=matrix[i][j];
					
				}
				
			}
		}
		
		
		System.out.println("the largest sum of two diagonals" 
		+Math.max(aboveDiagonal, belowDiagonal));
		
		scan.close();
		
	}
	
	
	
	
	
	
	
	
	

}
