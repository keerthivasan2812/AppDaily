package org.fun;

public class Singelton1 {
	
	private volatile static Singelton1 uniqueInstance;

	public Singelton1() {
		
	}
	
	public static Singelton1 getInstance() {
		if(uniqueInstance ==null) {
			synchronized (Singelton.class){
				
				if(uniqueInstance==null) {
					uniqueInstance= new Singelton1();
				}
				
			}
			
			
		}
		
		return  uniqueInstance;
		
	}
	
	
}
