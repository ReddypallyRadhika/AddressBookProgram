/**
 * 
 */
package com.bridgelabz;

/**
 * @author hp
 *
 */
public class ContactPerson {

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
	public ContactPerson(String firstName, String lastName, String address, String city, String state, int zip,
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
	
	//Method for displaying data
		public void displayContact() {
			System.out.println("First Name : "+firstName);
			System.out.println("Last Name : "+lastName);
			System.out.println("Address : "+address);
			System.out.println("City : "+city);
			System.out.println("State : "+state);
			System.out.println("Zip : "+zip);
			System.out.println("Phone Number : "+phoneNumber);
			System.out.println("Email Id : "+emailId);
		}
	
	
	

}
