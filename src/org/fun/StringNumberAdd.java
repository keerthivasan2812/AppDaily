package org.fun;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringNumberAdd {
	
	
	
	public static void main(String[] args) {
		
		Map <String,Integer> m=new LinkedHashMap();
		
		m.put("1",1);
		m.put("2",2);
		m.put("3", 3);
		m.put("4", 4);
		m.put("5", 5);
		m.put("6", 6);
		m.put("7", 7);
		m.put("8", 8);
		m.put("9", 9);
		m.put("0", 0);
		
		String s="82";
		String h="72";
		
		
		int result = 0;
		
		if(s.length()==2) {
			char b = s.charAt(0);
			char n = s.charAt(1);
			Integer i = m.get(String.valueOf(b));
			Integer o = m.get(String.valueOf(n));
			
			int rt=i*10;
			
			result=rt+o;
			
			
		}else if(s.length()==3) {
			char b = s.charAt(0);
			char n = s.charAt(1);
			char b1 = s.charAt(2);
			Integer i = m.get(String.valueOf(b));
			Integer o = m.get(String.valueOf(n));
			Integer mn = m.get(String.valueOf(b1));
			
			int rt=i*100;
			result=rt+mn+o;
			
		}
		
		int result1 = 0;
		
		
		if(h.length()==2) {
			
			char b = h.charAt(0);
			char n = h.charAt(1);
			Integer i = m.get(String.valueOf(b));
			Integer o = m.get(String.valueOf(n));
			
			int rt=i*10;
			
			result1=rt+o;

			
		}else if(h.length()==3) {
			
			
			char b = h.charAt(0);
			char n = h.charAt(1);
			char b1 = h.charAt(2);
			Integer i = m.get(String.valueOf(b));
			Integer o = m.get(String.valueOf(n));
			Integer mn = m.get(String.valueOf(b1));
			
			int rt=i*100;
			result1=rt+mn+o;
			
			
		}
		
		System.out.println(result + result1);
		
		
		
	}
	
	

}
