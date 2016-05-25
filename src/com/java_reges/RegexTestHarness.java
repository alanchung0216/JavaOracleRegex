package com.java_reges;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
/*
	Some valid IP address:

		000.12.12.034
		121.234.12.12
		23.45.12.56
		
		this is simplified to handle any 999.888......
		^\d{1,3}(\.\d{1,3}){3}$
		String pattern = "^\\d{1,3}(\\.\\d{1,3}){3}$"
		
		this is complete to reject 666.666.23......
^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9])(\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]){3}$
		String pattern = 
"^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9])(\\.25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]?[0-9]){3}$"	
	Some invalid IP address:

		666.666.23.23
		.213.123.23.32
		23.45.22.32.
		I.Am.not.an.ip	
 */
public class RegexTestHarness {

    public static void main(String[] args){
    	
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
   	
        while (true) {
        	// use flag for two arguments compile method)
        	//pattern = Pattern.compile("[az]$", Pattern.MULTILINE | Pattern.UNIX_LINES);
        	//You could also specify an int variable instead:
        	//final int flags = Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE;
        	//Pattern pattern = Pattern.compile("aa", flags);
        	
        	//below is one argument compile method
        	System.out.println("Enter your regex: ");
        	String regex = sc.nextLine();
            Pattern pattern = Pattern.compile(regex);            
            System.out.println("Enter input string to search: ");
            String input_string = sc.nextLine();
            Matcher matcher = pattern.matcher(input_string);
            boolean found = false;
            while (matcher.find()) {
            	System.out.printf("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
            	System.out.printf("No match found.%n");
            }
        }
    }
}
