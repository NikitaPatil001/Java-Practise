package com.leetcode.array;
public class ShuffleTheArray {

	public static void main(String[] args) {

		int[] arr = {2,3,4,5,4,3,2,3,31};
		int n = 4;
		
		int[] arr1 = shuffle(arr,n);
		 System.out.println(arr1);

		}

	
	public static int[] shuffle(int[] nums, int n) {
	      int[] result = new int[2 * n];
	        for (int i = 0; i < n; ++i) {
	            result[2 * i] = nums[i];
	            result[2 * i + 1] = nums[n + i];
	        }
	        return result;
	        
	    }
}
