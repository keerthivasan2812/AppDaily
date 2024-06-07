package org.fun;

public class ShortCut {
	
	
	public static void main(String[] args) {
		
		MyLambda  lambda=(x)->System.out.println(x);	
		
		lambda.myMethod(10);
		
	}

	 interface MyLambda {
	        void myMethod(int x);
	    }

}
