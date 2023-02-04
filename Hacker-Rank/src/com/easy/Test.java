package com.easy;

public class Test {
	static int n1 = 100;
	static int n2 = 200;
	static {
		n1 += 1;
		n2 += 1;
	}

	public static void main(String[] args) {
		n1 += 5;
		n2 += 10;
		System.out.println(n1+n2);
	}

	static {
		n1 += 200;
		n2 += 300;
	}

}
