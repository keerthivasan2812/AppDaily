package org.fun;

public class Nested {
	
	
	public class Nested1{
		
		public void nest() {
			System.out.println("keerthi");
			
		}
		
	}
public class Nested2{
	
	public void nest1() {
		System.out.println("karthi");
		
	}
		
	}

public static void main(String[] args) {
	
	  // Create an instance of the outer class
    Nested outer = new Nested();
    
    Nested2 n=outer.new Nested2();
    Nested1 h=outer.new Nested1();
    
    n.nest1();
	
	h.nest();
	
}


}
