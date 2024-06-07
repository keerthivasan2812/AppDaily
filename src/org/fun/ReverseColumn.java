package org.fun;

public class ReverseColumn {
	
	
	
	
	
	
	
	
	
	
	
	
	    public static void main(String[] args){
	        int[][] array = {
	            {1, 5, 9},
	            {7, 8, 0},
	            {8, 9, 5},
	            {5, 7, 8}
	        };
	        
	        System.out.println(array[0].length);

	        int colIndex = 1; // Index of the column you want to reverse
	        
	        if (colIndex >= 0 && colIndex < array[0].length) { // Check if the column index is valid
	            int colLength = array.length;
	            int[] reversedColumn = new int[colLength]; // Temporary array to store the reversed column
	            
	            // Reverse the specified column and store it in the temporary array
	            for (int i = 0; i < colLength; i++) {
	                reversedColumn[i] = array[i][colIndex];
	            }
	            
	            // Copy the reversed column back to the original column
	            for (int i = 0; i < colLength; i++) {
	                array[i][colIndex] = reversedColumn[colLength - 1 - i];
	            }
	            
	            // Print the modified array
	            for (int i = 0; i < array.length; i++) {
	                for (int j = 0; j < array[i].length; j++) {
	                    System.out.print(array[i][j] + " ");
	                }
	                System.out.println(); // Move to the next line
	            }
	        } else {
	            System.out.println("Invalid column index.");
	        }
	    }
	

	
	

}
