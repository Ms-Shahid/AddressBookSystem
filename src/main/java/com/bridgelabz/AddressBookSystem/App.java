package com.bridgelabz.AddressBookSystem;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {

		addContacts();

	}

	public static void addContacts() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Your FirstName: ");
		String firstName = scan.nextLine();

		System.out.println("Enter the Your LastName: ");
		String lastName = scan.nextLine();

		System.out.println("Enter the Your Address: ");
		String address = scan.nextLine();

		System.out.println("Enter the Your ZipCode: ");
		int zipCode = scan.nextInt();

		System.out.println("Enter the Your Phone Number: ");
		int phoneNumber = scan.nextInt();

		System.out.println("Enter the Your Email: ");
		String email = scan.next();

		System.out.println("****Success****");
		ContactDetails userDetails = new ContactDetails(firstName, lastName, address, zipCode, phoneNumber, email);
		userDetails.disp();
		scan.close();
	}
}
