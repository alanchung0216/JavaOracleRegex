package com.java_reges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesLooking {
	private static final String REGES = "foo"; // try foo?, foo*, foo+
	private static Pattern pat;
	private static Matcher mat;
	public static void main(String[] args) {
		
		String input = new String("fooooooooooooooooo");
		pat = Pattern.compile(REGES);
		mat = pat.matcher(input);
		
		System.out.println("Current REGES "+REGES);
		System.out.println("Current Input "+input);
		
		System.out.println("Looking at "+mat.lookingAt());
		System.out.println("matcher "+mat.matches());
	}

}
