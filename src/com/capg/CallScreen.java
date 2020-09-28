package com.capg;

import java.util.Scanner;

public class CallScreen {
	public void screen(){
		Scanner sc = new Scanner(System.in);
		
		AddressBook addBook = new AddressBook();
		
		int a = 0;
		while(a !=1){
			System.out.println("Press 1 to Add Contact.");
			System.out.println("Press 0 to Exit.");
			
			int input = sc.nextInt();
			sc.nextLine();
				switch(input) {
				case 0:
					System.out.println("Exiting...");
					a=1;
					break;
				case 1:
					System.out.println("Enter first name: ");
					String firstName = sc.nextLine();
					System.out.println("Enter last name: "); 
					String lastName = sc.nextLine();
					System.out.println("Enter address: "); 
					String address = sc.nextLine();
					System.out.println("Enter city name: ");
					String city = sc.nextLine();
					System.out.println("Enter state name: ");
					String state = sc.nextLine();
					System.out.println("Enter zip code: "); 
					int zipCode = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter phone no: "); 
					String phoneNo = sc.nextLine();
					System.out.println("Enter e-mail address: ");
					String email = sc.nextLine();
					
					Contact newContact = new Contact(firstName, lastName, address, city, state, zipCode, phoneNo, email);
					addBook.addContact(newContact);
					addBook.viewBook(addBook.book);
					break;
					default:
						System.out.println("Invalid");
						break;			
				}
		}
		sc.close();
	}

}
