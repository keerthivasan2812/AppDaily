package org.fun;

import java.util.Scanner;

public class PetrolPrice {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the money for the purchase of petrol");
		
		int money = s.nextInt();
		int petrolPrice=100;//1 litre
		
		
		int litre=money/petrolPrice;
		
		System.out.println("with "+money+" you can buy "+litre+" litres of petrol");
		
		s.close();
	}

}
