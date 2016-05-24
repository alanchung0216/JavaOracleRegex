package com.java_reges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {

	public static void main(String[] args) {
		final String REGES = "\\bdog\\b";
		String input = new String("dog dog dog doggie dogg");
		
		Pattern p = Pattern.compile(REGES);
		Matcher m = p.matcher(input);
		int count=0;
		while (m.find()){
			count++;
			System.out.println("Start index "+m.start());
			System.out.println("End index "+m.end());
			System.out.println("Count "+count);
		}

	}

}
