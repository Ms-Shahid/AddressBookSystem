package com.bridgelabz.AddressBookSystem;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.println("***Welcome to Address Book System****");
		System.out.println("Enter \n 1:Add Contact information \n 2:Edit Contact information \n 3:Remove Contact");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		switch (input) {
		case 1:
			addContacts();break;
		default: System.out.println("Enter Correct input");
		}
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
