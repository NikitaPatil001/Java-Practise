package com.basic.string;

public class Reverse_String {

	public static void main(String[] args) {
		String str =  " nikita ";
		System.out.println(reverseWord(str));
		
}

public static String reverseWord(String str)
{
	int s = str.length();
	String rem = "";
	char ch;
	
	while(s!=0) {
		ch= str.charAt(s-1);
         rem = rem+ch;
         s--;
}
	return rem;
}

}




