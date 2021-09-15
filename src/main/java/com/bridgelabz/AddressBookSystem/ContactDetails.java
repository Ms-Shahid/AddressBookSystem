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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void disp() {
		System.out.println("\n *****************"+"\nYour Name is " + firstName + " " + lastName + "\naddress " + address + "\nZipCode "
				+ zipCode + "\nPhone Number " + phoneNumber + "\nEmail " + email + "\n *****************");
	}
}
