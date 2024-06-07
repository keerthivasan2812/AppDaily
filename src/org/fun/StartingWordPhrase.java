package org.fun;

import java.util.ArrayList;

public class StartingWordPhrase {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> n=StartingWord("M");
		System.out.println(n);
		
	}

	public static ArrayList<String> StartingWord(String s) {
		
		
	
	
	
	String v="This was a close game. Much closer than what we thought it would go. Of course you want to make an impact when the ball does something. In this format the ball swings two overs. When I want to bowl more, I play Test cricket. That fulfills my desires. This format is a little difficult for bowlers, with time restrictions and impact player rules. Batting lineup becomes deeper and deeper. But that's not in your control. I do relay the message to the bowlers whenever I can. "
			+ 
		"But you also don't want to "
			+ "deliver too many messages in the heat of the moment.";
	
	String[] n=v.split(" ");
	
	ArrayList<String> b=new ArrayList<String>();
	
	ArrayList<String> b1=new ArrayList<String>();
		
		
		for(int i=0;i<n.length;i++) {
			
			
			if(n[i].startsWith(s)) {
				
				b.add(n[i]);
				
				
			}else {
				b1.add(n[i]);
			}
			
			
		}
		
		return b;
		
		
		
	}
	
	
}
