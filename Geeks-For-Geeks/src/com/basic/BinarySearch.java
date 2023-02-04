package com.basic;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions
public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int start = arr[0];
		int end = arr.length - 1;
		int mid = 0;
		int target = 6;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] < target)
				start = mid + 1;
			if (arr[mid] > target)
				end = mid - 1;
			else
				target = arr[mid];
		}
		System.out.println(mid);
		
		// String a = "smile";
//		String b = "smoke";
//		System.out.println(find(a, b));
//		int[] temp = { 16, 15, 19, 22, 45, 75 };
//		System.out.println(Arrays.toString(sample(6, temp)));
//	}
//
//	public static int find(String X, String Y) {
//		int sum = 0;
//		for (int i = 0; i < X.length(); i++) {
//			char a = X.charAt(i);
//			char b = Y.charAt(i);
//			sum = sum + ((a - '0') - (b - '0'));
//		}
//		return sum;
//	}
//
//	public static int[] sample(int n, int[] arr) {
//		int[] temp = new int[arr.length];
////		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			int c = 0;
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] == arr[j])
//					c++;
//			}
//			temp[i] = n - c;
//		}
//		return temp;
//	}
	}
}
