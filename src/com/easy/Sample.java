package com.easy;

import java.util.Scanner;

public class Sample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //System.out.println(Short.MAX_VALUE);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(+ n +" can be fitted in:");
		
		
		if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE)
			System.out.println("*Short");
		
		if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE)
			System.out.println("*Byte");
		
		if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE)
			System.out.println("*int");
		
		
		if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE)
			System.out.println("*long");
		
		else
		{
			System.out.println("n can't be fitted anywhere.");
		}
	}

}
