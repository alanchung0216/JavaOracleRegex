package com.java_reges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppendReplace {

	public static void main(String[] args) {
		String reges = "a*b"; // try a+b
		String input = "aabfooaabfooabfoob";
		String replace = "-";
		Pattern pat = Pattern.compile(reges);
		Matcher mat = pat.matcher(input);
		StringBuffer sb = new StringBuffer();
		while (mat.find()){
			mat.appendReplacement(sb, replace); // this append string to sb
			System.out.println("replace "+sb.toString());
		}
		mat.appendTail(sb); // this append the remaining. the whole thing is like a copy
							// from orig to destination (sb) with replacements.
		System.out.println("tail "+sb.toString());
		
	}

}
