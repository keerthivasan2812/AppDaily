package org.fun;

public class Singelton {
private  static Singelton uniqueInstamce =new Singelton();	
	
	private Singelton() {
		
	};
	
	public static Singelton getSingelton() {
		return uniqueInstamce;
	}
	public static void main(String[] args) {
		
	
	
	Singelton singelton=getSingelton();
	Singelton singelton1=getSingelton();
	
	System.out.println(singelton.hashCode());
	System.out.println(singelton1.hashCode());
	
	}

}
