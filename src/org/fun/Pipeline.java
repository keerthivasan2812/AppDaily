package org.fun;

import java.util.Scanner;

public class Pipeline {
	
	
	int wantWater=1;
	int dontWantWater=2;
	
	
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 1 for want water or enter 2 for not wanting it");
		
		int k = s.nextInt();
		
		switch(k) {
			
			case 1:
				System.out.println("you will get water");
				
			break;
			
			case 2:
				System.out.println("you will not get water");
				System.out.println("thank you for sYING THE TRUTH"
						+ "YOUR CONTRIBUTION MEANS NOTHING FOR THE SOCIETY"
						+ "");
				break;
				default:
					
					System.out.println("PLEASE ENTER THE NUMBER THAT WERE GIVEN IN THE PRINT STATEMENT BEFORE");
			
			
			
		}
			
		
		
		
	}
	
	
	
	
	

}
