package org.fun;

import java.util.ArrayList;
import java.util.List;

public class LengthIsEqual {
	
	
	
	public static void main(String[] args) {
		
		String h="keerthi";
		String n="mohan";
		String m="naveen";
		String h1="keerthi";
		String h2="keerthi";
		
		String[] vin= {h,n,m,h1};
	ArrayList<String> l=new ArrayList();
		
		
		
		for(String b:vin) {
			l.add(b);
			
		}
		String z=isEqual(l);
		
		System.out.println(z);
		
	}
	
	public static String isEqual(ArrayList<String> h) {
		
		
		String e="keerthi";
		
		int count=0;
		
			
			
			
		for(String m:h) {
			if(e.length()==m.length()) {
				count++;
			}
			
		}
		
		return "the number of times keerthi as been equal in a array is"+count;
		
	}
	
	

}
