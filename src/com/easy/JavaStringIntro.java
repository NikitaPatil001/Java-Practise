package com.easy;

//https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
import java.util.Scanner;

public class JavaStringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		String A1 = A.substring(0, 1).toUpperCase();
		String A2 = A.substring(1);

		String B1 = B.substring(0, 1).toUpperCase();
		String B2 = B.substring(1);

// Sum the lengths of and .
		System.out.println(A.length() + B.length());

// Determine if is lexicographically larger than (i.e.: does come before in the dictionary?).

		int i = A.compareTo(B);
		if (i > 0)
			System.out.println("Yes");
		else
			System.out.println("No");

// Capitalize the first letter in and and print them on a single line, separated by a space.
		System.out.println((A1 + A2) + " " + (B1 + B2));

	}

}
