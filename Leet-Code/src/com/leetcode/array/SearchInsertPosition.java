package com.leetcode.array;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int target = 6;

		System.out.println(searchInsert(arr, target));
	}

	public static int searchInsert(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i]) {
				return i;
			} else if (target < nums[i]) {
				return i;
			}

		}
		return nums.length;
	}

}
