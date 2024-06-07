package org.reccursion;

public class Recursive {
	
	
	public static void main(String[] args) {
		
		walk(6);
		gun(10);
		System.out.println(power(2,1));
		System.out.println(factorial(2));
		
	}
	
	
private static void walk(int steps) {
		
		if(steps < 1) return; //base case
		System.out.println("You take a step!");
		walk(steps - 1); //recursive case
	}

private static void gun(int bullets) {
	
	if(bullets<1)return;
	System.out.println("you take a bullet"+bullets);
	
	gun(bullets-1);
	
}

private static int power(int base,int power) {
	
	if(power<1) return 1;
	return base* power(base,power-1);
	
	
}
private static int factorial( int num) {
	if(num < 1) return 1;
	return num *factorial(num-1);
	
}

}
