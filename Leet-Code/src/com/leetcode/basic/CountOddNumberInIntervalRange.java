package com.leetcode.basic;

import java.util.Scanner;

public class CountOddNumberInIntervalRange {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int start = sc.nextInt();
	int end = sc.nextInt();
	
	  if(start%2==0){
          start++;
      }
           
		System.out.println((end-start+2)/2);
	}
	
	
}
