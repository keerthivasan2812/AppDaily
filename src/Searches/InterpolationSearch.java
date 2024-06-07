package Searches;

public class InterpolationSearch {
	
	public static void main(String[] args) {
		
		
		int[] array= {1,2,3,4,5,6,7,8,9};
		
		int index=interpolationSearch(array,8);
		
		if(index==-1) {
			System.out.println("the number is not found");
			
		}else {
			System.out.println("the number is found the number"+index);
			
		}
	}
	
	public static int interpolationSearch(int[] array,int value ) {
		
		int low=0;
		int high=array.length-1;
		while(value >=array[low]&& value<=array[high]&& low <=high) {
			int probe=low +(high-low) *(value -array[low])/(array[high]-array[low]);
			System.out.println("probe :"+probe);
			
			if(array[probe]== value) {
				return probe;
			}else if(array[probe]<value) {
				low=probe+1;
			}else {
				high=probe-1;
			}
		}
		
		return -1;
		
	}

}
