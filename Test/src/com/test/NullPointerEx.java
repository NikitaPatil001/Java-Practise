package com.test;

public class NullPointerEx {
	public static void main(String[] args) {
		String s = "abcd";

		foo(null);
		bar(null);
	}

	// Using a try-catch block:
	static void foo(String x){
		try {
			System.out.println("First character: " + x.charAt(0));
		}
		catch(Exception e) {
			//System.out.println("NullPointerException thrown!");
		}
	}

	// Using if-else condition:
	static void bar(String x){
		if(x != null)
			System.out.println("First character: " + x.charAt(0));
		else
			System.out.println("NullPointerException thrown!");
	}
}
