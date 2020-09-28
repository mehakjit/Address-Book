package com.capg;

import java.util.Scanner;

public class CallScreen {
	public void screen(){
		
		Scanner sc = new Scanner(System.in);
		AddressBook addBook = new AddressBook();
		
		int a = 0;
		while(a !=1){
			System.out.println("Press 1 to Add Contact.");
			System.out.println("Press 2 to edit Exisiting Contact.");
			System.out.println("Press 3 to delete Exisiting Contact.");
			System.out.println("Press 0 to Exit.");
			
			int input = sc.nextInt();
			sc.nextLine();
				switch(input) {
				case 0:
					System.out.println("Exiting...");
					a=1;
					break;
				case 1:
					System.out.println("Enter First name: ");
					String firstName = sc.nextLine();
					System.out.println("Enter Last name: "); 
					String lastName = sc.nextLine();
					System.out.println("Enter Address: "); 
					String address = sc.nextLine();
					System.out.println("Enter City name: ");
					String city = sc.nextLine();
					System.out.println("Enter State name: ");
					String state = sc.nextLine();
					System.out.println("Enter Zip code: "); 
					int zipCode = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Phone no: "); 
					String phoneNo = sc.nextLine();
					System.out.println("Enter e-mail address: ");
					String email = sc.nextLine();
					
					Contact newContact = new Contact(firstName, lastName, address, city, state, zipCode, phoneNo, email);
					addBook.addContact(newContact);
					addBook.viewBook(addBook.book);
					break;
				case 2:
					addBook.viewBook(addBook.book);
					System.out.println("Enter first name of existing contact you want to change: ");
			        String firstName1 = sc.nextLine();
					System.out.println(addBook.editContact(firstName1, sc));
					break;
				case 3:
					addBook.viewBook(addBook.book);
					System.out.println("Enter first name of existing contact you want to delete: ");
			        String firstName2 = sc.nextLine();
					addBook.deleteContact(firstName2);
					break;	
				default:
					System.out.println("Invalid");
					break;			
				}
		}
		sc.close();
	}

}
