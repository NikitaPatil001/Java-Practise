package com.leetcode.array;

public class Plus_One {

	public static void main(String[] args) {

		

		}
	 public int[] plusOne(int[] digits) {
 		int n = digits.length;

	for (int i = n-1; i >=0; i--) {
		if(digits[i]<9) {
			digits[i]++;
			return digits;
			
		}digits[i] = 0;
		
 }	
		
		int[] new_num1 = new int[n+1];
		new_num1[0]=1;
		return new_num1;
}

	}

