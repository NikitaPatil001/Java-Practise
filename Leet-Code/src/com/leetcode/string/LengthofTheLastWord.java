package com.leetcode.string;

public class LengthofTheLastWord {
	public static void main(String[] args) {
		String s = "HELLO world";
		// public int lengthOfLastWord(String s) {
		int c = 0;
		s = s.trim();
		//System.out.print(s);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				c = 0;
				continue;
			} else
				c++;
		}
		System.out.println(c);
	}
}
