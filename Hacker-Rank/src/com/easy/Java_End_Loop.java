package com.easy;

import java.util.Scanner;

public class Java_End_Loop {
	 public static void main(String[] args) {
	        
	        Scanner scn = new Scanner(System.in);
	        int count = 0;
	        
	        while(scn.hasNext()){
	            count++;
	            System.out.println(count+" "+scn.nextLine());
	        }
	    }
}
