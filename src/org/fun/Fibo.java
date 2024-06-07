package org.fun;

public class Fibo {
	
	
	public static void main(String[] args) {
	
	int n=10;
	int p=0;
	int v=1;
	
	for(int i=0;i<n;i++) {
		
		System.out.println("the fibonacci series"+p);
		
		int next=0;
		 next=p+v;
		 p=v;
		 v=next;	
		
	}
	}

}
