package org.fun;

import java.util.Scanner;

public class CoffeMachine {
	public static void main(String[] args) {
	String[]machine= {"tea","coffe","blackcoffe","greentea"};
	
	Scanner v =new Scanner(System.in);
	System.out.println("enter what do you like to have ");
	String userinput = v.nextLine();
	
	boolean found= false;
	for(String i:machine) {
		
		if(userinput.equals(i)) {
			
			System.out.println("your "+i+" will be ready in 3 minutes");
			found=true;
			
			break;
			
		}
		
		
	}
	if(!found) {
		System.out.println("THE item desired by you is not found here sorry ");
	}
	v.close();
	}
	

}
