package com.leetcode.array;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] nums = {1,2,3,2,1,1,2};
     int val = 1;
     System.out.println(removeElement(nums,val));
	}
	
		 public static int removeElement(int[] nums, int val) {
	         int i = 0;
			 for(int j=0; j<nums.length; j++){
				 if(nums[j]!=val) {
	                 int temp = nums[i];
	                 nums[i]=nums[j];
	                 nums[j] = temp;
	                i++;
	             }
	             
	         }return i;
			 }
		
		
	    }


