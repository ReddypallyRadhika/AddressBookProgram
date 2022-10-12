/**
 * 
 */
package com.bridgelabz;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author hp
 *
 *
 * UC7 Ability to ensure there is no Duplicate Entry of the same Person
 * in a particular Address Book - Duplicate Check is done on Person Name
 * while adding person to Address Book. - Use Collection Methods to
 * Search Person by Name for Duplicate Entry
 */

public class AddressBook {

// one address book called family can have many contacts of family

	// contact will be an object
// 	right?

// Arrays or Arryalist 
// Where we store objects

//	ArrayList<ContactPerson> allContacts = new ArrayList<ContactPerson>();

	ContactPerson[] allContacts = new ContactPerson[100];

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(allContacts);
		result = prime * result
				+ Objects.hash(address1, city1, email1, firstName1, input, lastName1, phoneNo1, state1, zip1);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressBook other = (AddressBook) obj;
		return Objects.equals(address1, other.address1) && Arrays.equals(allContacts, other.allContacts)
				&& Objects.equals(city1, other.city1) && Objects.equals(email1, other.email1)
				&& Objects.equals(firstName1, other.firstName1) && Objects.equals(input, other.input)
				&& Objects.equals(lastName1, other.lastName1) && phoneNo1 == other.phoneNo1
				&& Objects.equals(state1, other.state1) && zip1 == other.zip1;
	}

	static int i, index = 0;// 0,1,2,4,5

	Scanner input = new Scanner(System.in);
	String addressBook1;
	String firstName1, lastName1, address1, city1, state1, email1;
	int zip1;
	long phoneNo1;

	public void addToAddressBook() {
		System.out.println("Enter Address Book Name:");
		addressBook1 = input.next();
		for (int i = 0; i < index; i++) {
			if (allContacts[i].addressBook.equals(addressBook1)) {
				System.out.println("already exist");
				return;
			}
		}

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
		for (int i = 0; i < index; i++) {
			if (allContacts[i].firstName.equals(firstName1) || allContacts[i].lastName.equals(lastName1)
					|| allContacts[i].address.equals(address1) || allContacts[i].city.equals(city1)
					|| allContacts[i].state.equals(state1) || allContacts[i].emailId.equals(email1)) {
				System.out.println("Duplicate Entry");
				return;
			}
		}
		ContactPerson personObj = new ContactPerson(addressBook1, firstName1, lastName1, address1, city1, state1,
				email1, zip1, phoneNo1);

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
		} else {
			allContacts[i].firstName = null;
			allContacts[i].lastName = null;
			System.out.println("Delete completed");
		}

	}

	public void displayAddressBook() {
		for (int i = 0; i < index; i++) {
			allContacts[i].displayContact();
		}
	}

}
