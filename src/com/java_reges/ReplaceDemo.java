package com.java_reges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDemo {
	
	//static String reges = "dog";
	//static String input = "The dog says meow. All dogs say meow.";
	//static String replace = "cat";
	
	//try this 
    private static String reges = "a*b"; // try a+b
    private static String input =
        "aabfooaabfooabfoob";
    private static String replace = "-";
 

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(reges);
		Matcher m = p.matcher(input);
		
		// try first
		//input = m.replaceFirst(replace);
		// or all
		input = m.replaceAll(replace); // note input is String and immutable. the new value
										// can still assigned to input but old value in 
										// Constant String Pool lost the reference. memory leak.
		
		System.out.println("OUTPUT: "+input);
		

	}

}
