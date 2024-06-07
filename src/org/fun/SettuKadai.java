package org.fun;

import java.util.Scanner;

public class SettuKadai {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("enter the amount");
		
		Scanner s=new Scanner(System.in);
		
		int amount = s.nextInt();
		
		System.out.println("enter the amount of intrest you want to pay");
		int inte = s.nextInt();
		int amo =intrest(amount,inte);
		System.out.println(amo);
		
	}
	
	public static int intrest(int h,int n) {
		
		int j=h*n/100;
		
		return j;
		
		
	}
	
	
	

}
