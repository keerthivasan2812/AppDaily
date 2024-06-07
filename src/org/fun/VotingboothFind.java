package org.fun;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VotingboothFind {
	
	
public static void main(String[] args) {
	String v=VotingBooth(6);
	System.out.println(v);
	
	
}
public static String VotingBooth(int i) {
	
	
	
	int[] boothno= {1,2,3};
	
	String[] boothName= {"room 45","room56","room89"};
	
	HashMap<Integer,String> m=new HashMap<Integer, String>();
	
	for(int j=0;j<3;j++) {
		
		
		m.put(boothno[j], boothName[j]);
		
		
	}
	
	String n=m.get(i);
	
	if(n!=null) {
	return "the voting booth "+n;
	}else {
		return "the voting booth number is not found "+i;
		
	}
}
	
	

}
