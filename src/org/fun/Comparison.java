package org.fun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparison {
	
	
	public static void main(String[] args) {
		
		List <String> l=new ArrayList<String>();
		
		
		l.add("keethi");
		l.add("A.balaji");
		l.add("gopi");
		l.add("uma");
		
		Collections.sort(l);
		
		for(String h:l) {
			
			System.out.println(h);
		}
		
		
	}
	
	
	
	
	

}
