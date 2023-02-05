package com.leetcode.string;

public class BaseballGame {

	public static void main(String[] args) {

		String[] ops = { "5", "2", "C", "D", "+" };
		System.out.println(calPoints(ops));
	}

	public static int calPoints(String[] operations) {

		int[] arr = new int[1000];
		int i = 0;
		int sum = 0;
		for (String op : operations) {
			switch (op) {
			case "C":
				sum = sum - arr[i - 1];
				i--;
				break;

			case "D":
				arr[i] = 2 * arr[i - 1];
				sum = sum + arr[i];
				i++;
				break;

			case "+":
				arr[i] = arr[i - 1] + arr[i - 2];
				sum = sum + arr[i];
				i++;
				break;

			default:
				arr[i] = Integer.parseInt(op);
				sum = sum + arr[i];
				i++;
			}

		}
		return sum;

	}
}
