package com.easy;

import java.util.Scanner;

public class JavaAnagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	private static boolean isAnagram(String a, String b) {

		for(int i =0; i<a.length();i++) {
		if(a.charAt(i) == b.charAt(i))
			return true;
		else
		return false;
		
				
	}
		return false;

}
}
