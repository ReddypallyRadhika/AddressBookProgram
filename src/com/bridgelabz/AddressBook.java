/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 *
 *         /*UC4 Ability to delete a person using person's name - Use Console to
 *         delete a person.
 */

public class AddressBook {

// one address book called family can have many contacts of family

	// contact will be an object
// 	right?

// Arrays or Arryalist 
// Where we store objects

//	ArrayList<ContactPerson> allContacts = new ArrayList<ContactPerson>();

	ContactPerson[] allContacts = new ContactPerson[100];

	static int i, index = 0;// 0,1,2,4,5

	Scanner input = new Scanner(System.in);
	String firstName1, lastName1, address1, city1, state1, email1;
	int zip1;
	long phoneNo1;

	public void addToAddressBook() {
		System.out
				.println("Enter first name, last name, address, city, state,email ID, zip, phone number  sequentially");
		firstName1 = input.nextLine();
		lastName1 = input.nextLine();
		address1 = input.nextLine();
		city1 = input.nextLine();
		state1 = input.nextLine();
		email1 = input.nextLine();
		zip1 = input.nextInt();
		phoneNo1 = input.nextInt();

		ContactPerson personObj = new ContactPerson(firstName1, lastName1, address1, city1, state1, email1, zip1,
				phoneNo1);

		allContacts[index] = personObj;
		index++;

	}

	// Edit person name for the given name

	public void editPersonName() {
		int initallyPersonIsNotPresnt = 0;
		System.out.println("\nEnter current name of person to edit name");
		String currentName = input.nextLine();
		System.out.println("Enter name to update");
		String nameToUpdate = input.nextLine();

		for (int i = 0; i < index; i++) {
			if (allContacts[i].firstName.equals(currentName)) {
				allContacts[i].firstName = nameToUpdate;
				initallyPersonIsNotPresnt = 1;
				System.out.println(initallyPersonIsNotPresnt);
				return;
			}
		}

		if (initallyPersonIsNotPresnt == 0) {
			System.out.println("No record found with given name");
		}

	}

	public void deletePersonName() {
		int initallyPersonIsNotPresnt = 0;
		System.out.println("\nEnter current name of person to delete");
		String deleteName = input.nextLine();

		for (int i = 0; i < index; i++) {
			if (allContacts[i].firstName.equals(deleteName)) {
				allContacts[i].firstName = deleteName;
				initallyPersonIsNotPresnt = 1;
				System.out.println(initallyPersonIsNotPresnt);
				continue;
			}
		}

		if (initallyPersonIsNotPresnt == 0) {
			System.out.println("No record found with given name");
		}

	}

	public void displayAddressBook() {
		for (int i = 0; i < index; i++) {
			allContacts[i].displayContact();
		}
	}

}
