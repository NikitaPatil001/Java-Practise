package com.CustomerClass;

import java.time.LocalDate;

public class Customer {

	private int id;
	private String firstName;
	private String lastname;
	private String Address;
	private String contactNumber;
	private String Email;
	private LocalDate DOB;
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, String lastname, String address, String contactNumber, String email, LocalDate dOB,
			String password) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		Address = address;
		this.contactNumber = contactNumber;
		Email = email;
		DOB = dOB;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Main [firstName=" + firstName + ", lastname=" + lastname + ", Address=" + Address + ", contactNumber="
				+ contactNumber + ", Email=" + Email + ", DOB=" + DOB + ", password=" + password + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
