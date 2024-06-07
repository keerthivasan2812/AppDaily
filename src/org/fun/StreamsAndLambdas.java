package org.fun;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAndLambdas {
	
	
	
	public static void main(String[] args) {
		
		
		List<String> strin = Arrays.asList("I", "am", "a", "list", "of", "Strings");
		
		List<String> result = strin.stream().sorted((s1,s2)->s1.compareToIgnoreCase(s2))
				.limit(4).collect(Collectors.toList());
		
		System.out.println(result);
		Runnable s=() -> System.out.println("Hello!");
		
		Runnable runnable1 = new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("Hello from traditional Runnable");
		    }
		};

		// Runnable with Lambda
		Runnable runnable2 = () -> {
		    System.out.println("Hello from lambda Runnable");
		};
		
		System.out.println(s);
	}

}
