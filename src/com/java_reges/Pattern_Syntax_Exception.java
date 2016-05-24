package com.java_reges;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Pattern_Syntax_Exception {

    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	Matcher matcher=null;
        while (true) {
        	// use flag for two arguments compile method)
        	//pattern = Pattern.compile("[az]$", Pattern.MULTILINE | Pattern.UNIX_LINES);
        	//You could also specify an int variable instead:
        	//final int flags = Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE;
        	//Pattern pattern = Pattern.compile("aa", flags);
        	try {
	        	//below is one argument compile method
	        	System.out.println("Enter your regex: ");
	        	String regex = sc.nextLine();
	            Pattern pattern = Pattern.compile(regex);            
	            System.out.println("Enter input string to search: ");
	            String input_string = sc.nextLine();
	            matcher = pattern.matcher(input_string);
        	}
            catch (PatternSyntaxException pse) {
                System.out.printf("There is a problem" +
                        " with the regular expression!%n");
                System.out.printf("The pattern in question is: %s%n",
                        pse.getPattern());
                System.out.printf("The description is: %s%n",
                        pse.getDescription());
                System.out.printf("The message is: %s%n",
                        pse.getMessage());
                System.out.printf("The index is: %s%n",
                        pse.getIndex());
         System.exit(0);	
            }
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

