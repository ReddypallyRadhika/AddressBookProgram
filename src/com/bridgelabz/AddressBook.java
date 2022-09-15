/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class AddressBook {

	/**
	 * @param args
	 * @return 
	 */
	/*UC1
	 * Ability to create a Contacts in Address Book with 
	 * first and last names, address,city, state, zip, phone number and email...
	 */
	public  void enterDetails()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstname = input.nextLine();  
		System.out.println("Enter last name: ");  
		String lastname = input.nextLine();  
		System.out.println("Enter address: ");  
		String address = input.nextLine(); 
		System.out.println("Enter city: ");  
		String city = input.nextLine();  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter state: ");
		String state = input.nextLine();  
		System.out.println("Enter zip: ");  
		int zip = input.nextInt();  
		System.out.println("Enter phone number: ");  
		int phonenumber = input.nextInt(); 
		System.out.println("Enter Email: ");
		String email = input.nextLine(); 
		String email1 = input.nextLine(); 
		 
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	AddressBook addressbook =new AddressBook();
	addressbook.enterDetails();
	
}
}
