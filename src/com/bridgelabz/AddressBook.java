/**
 * 
 */
package com.bridgelabz;

/**
 * @author hp
 *
 *UC1
 *Ability to create a Contacts in Address Book with first and last names, address,
 *city, state, zip, phone number and email...
 *
 *
 *
 *
 *
 */



public class AddressBook {
	
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	long phoneNumber;
	String emailId;	
	
	
	

	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param phoneNumber
	 * @param emailId
	 */
	public AddressBook(String firstName, String lastName, String address, String city, String state, int zip,
			long phoneNumber, String emailId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// no use of getter and setter
		
		AddressBook contactNo1 = new AddressBook("Radhika","Sagar","Jeedimetla","Hyd","TS",55,773082683,"reddypallyradhika@gmail.com");

	}

}
