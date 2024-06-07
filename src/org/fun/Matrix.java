package org.fun;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args){
        int[][] array = {
            {1, 5, 9},
            {7, 8, 0},
            {8, 9, 5},
            {5, 7, 8}
        };

        int rowIndex = 3; // Index of the row you want to reverse
        
        if (rowIndex >= 0 && rowIndex < array.length) { // Check if the row index is valid
            int rowLength = array[rowIndex].length;
            int[] reversedRow = new int[rowLength]; // Temporary array to store the reversed row
            
            // Reverse the specified row and store it in the temporary array
            for (int i = 0; i < rowLength; i++) {
                reversedRow[i] = array[rowIndex][rowLength - 1 - i];
            }
            
            // Copy the reversed row back to the original row
            for (int i = 0; i < rowLength; i++) {
                array[rowIndex][i] = reversedRow[i];
            }
            
            // Print the modified array
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println(); // Move to the next line
            }
        } else {
            System.out.println("Invalid row index.");
        }
    }
}
