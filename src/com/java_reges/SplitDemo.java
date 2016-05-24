package com.java_reges;

import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		final String REGES = ":";
		String str = new String("One:Two:Three:Four:Five");
		// another reges
		//String REGES = new String("\\d");
		//String str = new String("One4Two6Three8Four2Five");
		Pattern p = Pattern.compile(REGES);
		String[] strArray = p.split(str);
		for (String x:strArray) {
			System.out.println(x);
		}

	}

}
