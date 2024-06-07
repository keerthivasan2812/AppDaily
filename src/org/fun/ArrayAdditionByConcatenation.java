package org.fun;

public class ArrayAdditionByConcatenation {
    
    public static void main(String[] args) {
        int[][] array = {
            {3, 5, 4, 2},
            {2, 4, 5},
            {4, 5, 6, 7, 8},
            {4, 9, 2, 1},
            {1, 2}
        };

        // Concatenate the numbers from the arrays into a single string
        StringBuilder concatenatedString = new StringBuilder();
        for (int[] subArray : array) {
            for (int num : subArray) {
                concatenatedString.append(num);
            }
        }

        // Convert the concatenated string to an integer
        String concatenated = concatenatedString.toString();
        int sum = 0;
        for (int i = 0; i < concatenated.length(); i++) {
            sum += Character.getNumericValue(concatenated.charAt(i));
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
