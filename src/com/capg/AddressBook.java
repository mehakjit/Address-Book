package com.capg;

import java.util.*;

public class AddressBook {

	public List<Contact> book = new ArrayList<Contact>();

	public void addContact(Contact newContact) {
		book.add(newContact);
		System.out.println("New contact Added successfully with the first name: "+newContact.firstName);
		}
	
	public void viewBook(List<Contact> book) {
		for (Contact c : book) {
			System.out.println(c);
		}
	}
	public void deleteContact(String firstName) {
		for(Contact z: book) {
			if(z.firstName.equalsIgnoreCase(firstName)) {
				book.remove(z);
				System.out.println("Deleted Contact ");
				return;
			}
		}
		System.out.println("Couldn't find Contact");
		return;
	}
	
	public String editContact(String firstName, Scanner sc) {
	 int y=0;
	 for(Contact x: book) {
		 if(x.firstName.equalsIgnoreCase(firstName)) {
		 int i =1;
		 while(i!=0) {
			 System.out.println("Enter 1 to edit the last name");
			 System.out.println("Enter 2 to edit the address");
			 System.out.println("Enter 3 to edit the city");
			 System.out.println("Enter 4 to edit the state");
			 System.out.println("Enter 5 to edit the zipcode");
			 System.out.println("Enter 6 to edit the phone number");
			 System.out.println("Enter 7 to edit the email");
			 System.out.println("Enter 0 to exit");
			 i = sc.nextInt();
			 sc.nextLine();
			 switch(i) {
			 case 1:
				 System.out.println("Enter the new last name");
				 x.lastName = sc.nextLine();
				 System.out.println("last name updated");
				 break;
			 case 2:
				 System.out.println("Enter the new address");
				 x.address = sc.nextLine();
				 System.out.println("address updated");
				 break;
			 case 3:
				 System.out.println("Enter the new city");
				 x.city = sc.nextLine();
				 System.out.println("city updated");
				 break;
			 case 4:
				 System.out.println("Enter the new state");
				 x.state = sc.nextLine();
				 System.out.println("state updated");
				 break;
			 case 5:
				 System.out.println("Enter the new zipcode");
				 x.zip = sc.nextInt();
				 sc.nextLine();
				 System.out.println("zipcode updated");
				 break;
			 case 6:
				 System.out.println("Enter the new phonenumber");
				 x.phoneNumber = sc.nextLine();
				 System.out.println("phonenumber updated");
				 break;
			 case 7:
				 System.out.println("Enter the new email");
				 x.email = sc.nextLine();
				 System.out.println("email updated");
				 break;
			 case 0:
				 System.out.println("Exiting....");
				 break;
			 default:
				 System.out.println("Invalid ");
			 }	 
		 }
		 y=1;
		 }
		 }
	 if(y==1)
		 return "Contact updated";
	 else
		 return "No contact found with this name";
	}
}
