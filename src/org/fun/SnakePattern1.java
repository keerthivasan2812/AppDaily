package org.fun;

public class SnakePattern1 {
	
	
	
	public static void snakePattern(int n) {
		
		int currentNum=1;
		
		for(int i=0;i<n;i++) {
			
			if(i%2==0) {
				for(int j=0;j<n;j++) {
					System.out.print(currentNum+" ");
					
					currentNum++;
					
				}
			}else {
				
				int start=currentNum+n-1;
				
				for(int j=0;j<n;j++) {
					System.out.print(start+" ");
					start--;
				}
				
				currentNum+=n;
				
			}
			System.out.println();
			
			
		}
		
	}
	
	public static void main(String[] args) {
		int n=4;
		snakePattern(n);
		
	}

}
