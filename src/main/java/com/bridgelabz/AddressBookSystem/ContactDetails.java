package com.bridgelabz.AddressBookSystem;

public class ContactDetails {

	private String firstName, lastName, address;
	private int zipCode, phoneNumber;
	private String email;

	public ContactDetails(String firstName, String lastName, String address, int zipCode, int phoneNumber,
			String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}

	public void disp() {
		System.out.println("\n Your Name is " + firstName + " " + lastName + "\n address " + address + "\n ZipCode "
				+ zipCode + "\n Phone Number " + phoneNumber + "\n Email " + email + "*****************");
	}
}
