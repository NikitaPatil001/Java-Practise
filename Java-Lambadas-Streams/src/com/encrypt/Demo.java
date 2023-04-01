package com.encrypt;

public class Demo {

	public static void main(String[] args) {
		String plaintext = "Nikita";
		String encrypted = VoltageCipher.encrypt(plaintext);
		System.out.println(encrypted);

	}

}
