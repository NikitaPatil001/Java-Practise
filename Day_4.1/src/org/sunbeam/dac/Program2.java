package org.sunbeam.dac;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
	class Date{
		int Day;
		int Month;
		int Year;
		
		void acceptRecord() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Day  : ");
			this.Day = sc.nextInt();
			
			System.out.print("month  : ");
			this.Month = sc.nextInt();
			
			System.out.print("year  : ");
			this.Year = sc.nextInt();
			
			//this is consider as link and connections between methods..
			//if we not goning to use this it will now run
			//Use this to accept to accept state of the objects
		}
		
		void printRecord() {
			System.out.println(this.Day+"/"+this.Month+"/"+this.Year);
		}
		
		
	}
		Date dt = new Date();
		dt.acceptRecord();
		dt.printRecord();
	}

}
