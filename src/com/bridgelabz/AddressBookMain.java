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
		
		// Object of address book
		AddressBook addressBook1 = new AddressBook();
		

		int choice =1;  // to keep loop running...
		
		while (choice!=0){
         
            switch (choice){
                case 0:
                    return;                   
                case 1:
                    addressBook1.addToAddressBook();
                    break;
                case 2:
                    addressBook1.editPersonName();
                    break;   
                case 3:
                	addressBook1.displayAddressBook();
                	break;
            }

		// Printing output on screen
		System.out.println("Press 0 to exit \nPress 1 to add more contact \nPress 2 to edit contact \nPress 3 to display");

            choice = input.nextInt();
            
           


        }
		
		input.close(); // closing scanner class after program exit
	}

}
