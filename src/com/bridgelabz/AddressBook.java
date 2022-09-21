/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;

/**
 * @author hp
 *
 *
 /*UC2
  * Ability to add a new Contact to Address Book - Use Console to add person details from AddressBookMain class
  * - Use Object Oriented Concepts to manage relationship between AddressBook and Contact Person
  */  



public class AddressBook {
	
	
// one address book called family can have many contacts of family
	
	// contact will be an object
// 	right?

// Arrays or Arryalist 
// Where we store objects
	
	
	ArrayList<ContactPerson> allContacts = new ArrayList<ContactPerson>();
	
	public void addToAddressBook(ContactPerson personContact) {
		allContacts.add(personContact);
	}	

}
