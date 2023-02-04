package com.basic;

import java.util.Arrays;

public class Check_Arrays_Are_Equal_Or_Not {

	public static void main(String[] args) {

		int N = 5;
		long A[] = { 1, 2, 5, 4, 0 };
		long B[] = { 2, 4, 5, 0, 1 };

		System.out.println(check(A, B, N));
	}

	public static boolean check(long A[], long B[], int N) {
		Arrays.sort(A);
		Arrays.sort(B);
		int catchval = 0;

		for (int i = 0; i < N; i++) {
			if (A[i] == B[i]) {
//				return false;
				catchval++;
			}
		}
//		return true;
//		System.out.println(catchval);

		if (catchval == N) {
			return true;
		} else {
			return false;
		}
	}
}
