package org.fun;

import java.util.Arrays;

public class OddorEvenASC {
	
	public static void main(String[] args) {
		
		int[] array = { 5, 8, 11, 6, 2, 1, 7 };
		
		int[] desc = new int[array.length];
		int[] asc = new int[array.length];
		
		int descIndex = 0; // Separate index for desc
		int ascIndex = 0;  // Separate index for asc
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				desc[descIndex++] = array[i];
			} else {
				asc[ascIndex++] = array[i];
			}
		}
		
		System.out.println("Unsorted even numbers (desc): " + Arrays.toString(desc));
		System.out.println("Unsorted odd numbers (asc): " + Arrays.toString(asc));
		
		// Sort desc array in descending order
		for (int i = 0; i < descIndex - 1; i++) {
			for (int j = 0; j < descIndex - 1 - i; j++) {
				if (desc[j] < desc[j + 1]) {
					int temp = desc[j];
					desc[j] = desc[j + 1];
					desc[j + 1] = temp;
				}
			}
		}
		
		// Sort asc array in ascending order
		for (int i = 0; i < ascIndex - 1; i++) {
			for (int j = 0; j < ascIndex - 1 - i; j++) {
				if (asc[j] > asc[j + 1]) {
					int temp = asc[j];
					asc[j] = asc[j + 1];
					asc[j + 1] = temp;
				}
			}
		}
		System.out.println(descIndex);
		System.out.println(ascIndex);
		System.out.println("Sorted even numbers (desc): " + Arrays.toString(Arrays.copyOf(desc, descIndex)));
		System.out.println("Sorted odd numbers (asc): " + Arrays.toString(Arrays.copyOf(asc, ascIndex)));
		
		// Combine the sorted arrays back into the original array
		int index = 0;
		for (int i = 0; i < ascIndex; i++) {
			array[index++] = asc[i];
		}
		for (int i = 0; i < descIndex; i++) {
			array[index++] = desc[i];
		}
		
		System.out.println("Combined sorted array: " + Arrays.toString(array));
	}
}
