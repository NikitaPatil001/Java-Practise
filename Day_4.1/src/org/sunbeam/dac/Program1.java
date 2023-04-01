package org.sunbeam.dac;

import java.util.Scanner;

public class Program1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	class Date{
	int day;
	int month;
	int year;
	}
	
	Date dt = new Date();
	
	System.out.print("Day  : ");
	dt.day = sc.nextInt();
	
	System.out.print("month  : ");
	dt.month = sc.nextInt();
	
	System.out.print("year  : ");
	dt.year = sc.nextInt();
	
	
	System.out.println("Day : "+dt.day+"month"+dt.month+"year"+dt.year);
		
	
	
	
}
	
}
