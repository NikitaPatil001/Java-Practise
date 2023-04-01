package com.CustomerClass;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Customer cs = new Customer();
		cs.setFirstName("nikita");
		cs.setLastname("patil");
		cs.setAddress("khamni");
		cs.setContactNumber("9165467969");
		cs.setDOB(LocalDate.parse("1998-02-02"));
		
	    Customer cs1 = new Customer("Ankita","Patil","Khamni","19389230","jfdfkdsjfdsj",LocalDate.parse("1998-02-02"), "jsdhsak");
		System.out.println(cs1);
		
		cs.getFirstName();
		cs.getLastname();
		cs.getAddress(); 
		cs.getContactNumber();
		cs.getDOB();
		System.out.println(cs);
		

		
		
		}

}
