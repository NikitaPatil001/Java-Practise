package com.easy;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
public class Java_String_Token {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        String[] str = s.split("[^a-zA-Z]+");
        if(s.length()==0) {
        	System.out.println(0);
        }else {
        	System.out.println(str.length);
        }

        for(String a:str) {
        	System.out.println(a);
        }
       
	}

}
