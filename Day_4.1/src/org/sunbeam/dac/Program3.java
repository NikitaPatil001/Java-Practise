package org.sunbeam.dac;

import java.util.Scanner;

class Employee{
	private String name;
	private int empid;
	private float salary;
	
	void acceptrecord(/*Employee this*/) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name  : ");
		this.name = sc.next();
		
		System.out.print("empid  : ");
		this.empid = sc.nextInt();
		
		System.out.print("salary  : ");
		this.salary = sc.nextFloat();
	}
	void PrintRecord() {
		System.out.println(this.name+"/"+this.empid+"/"+this.salary);
	}
}
    public class Program3 {
	     public static void main(String[] args) {
		
		  Employee e1 = new Employee();
	      e1.acceptrecord();
	      e1.PrintRecord();
	       	
	     }
	     
	
	





//public class Program3 {
//public static void main(String[] args) {
//	class Employee{  // in this example the class Employee is a local class
//	private String name;
//	private int empid;
//	private float salary;
//	
//	}
//	Employee e1 = new Employee();
//	e1.name="nikita";
//	e1.empid=10;
//	e1.salary=10000;
//}
}
