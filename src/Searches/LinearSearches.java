package Searches;

public class LinearSearches {
	
	public static void main(String[] args) {
		
		int[] array= {1,3,6,9,96,};
		
		int target =9;
		int index=linearSearch(array,target);
		
		if(index==-1) {
			System.out.println("the targeted number is not found in the array");
		}else {
			System.out.println("the target number is found in a position "+index);
		}
	
	
	}

public static int linearSearch(int[] array,int value) {
	for(int i=0;i<array.length;i++) {
		
		
		if(array[i]==value) {
			
			return i;
		}
		
		
		}
	
	return -1;
}
		
	}

