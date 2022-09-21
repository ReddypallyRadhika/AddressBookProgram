/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class AddressBookMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String firstName1,lastName1, address1, city1, state1, email1;
		int zip1;
		long phoneNo1;
		
		System.out.println("Enter first name, last name, address, city, state,email ID, zip, phone number  sequentially");
		firstName1 = input.nextLine();
	    lastName1 = input.nextLine();
		address1 = input.nextLine();
		city1 = input.nextLine();
		state1 = input.nextLine();
		email1 = input.nextLine();	
		zip1 = input.nextInt();
		phoneNo1 = input.nextInt();
			
		
		ContactPerson personObj = new ContactPerson(firstName1, lastName1, address1, city1, state1, zip1,phoneNo1, email1);
		
		// Object, take this object and throw it in arryas list addressbook
		
		AddressBook addressBook1 = new AddressBook();
		addressBook1.addToAddressBook(personObj);
		
		input.close();


	}

}
