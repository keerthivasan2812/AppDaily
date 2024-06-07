package org.fun;

public class Main1 {
	
	public static void main(String[] args) {
		Myrunnable runnable=new Myrunnable();
		
		Thread thread=new Thread(runnable);
		thread.start();
		
		
		
	}

}
