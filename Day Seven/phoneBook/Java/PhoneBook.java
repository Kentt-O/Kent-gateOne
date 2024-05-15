import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBook {
	public static void  main (String... args){
		Scanner input = new Scanner(System.in);

    		static ArrayList<String> firstNameStorage = new ArrayList<>();
    		static ArrayList<String> lastNameStorage = new ArrayList<>();
    		static ArrayList<String> phoneNumberStorage = new ArrayList<>();
 		static ArrayList<String> emailStorage = new ArrayList<>();


		
		String prompt = """
		System.out.println(":".repeat(26));
		:: Welcome to your new phonebook ::
		System.out.println(": ".repeat(26));
		Select an option 
		1 -> Add Contact
		2 -> Remove Contact
		3 -> Find contact by phone number
		4 -> Find contact by first name
		5 -> Find contact by last name
		6 -> Edit contact
		0 -> Back
		""";

		System.out.println(prompt);
		int userResponse = input.nextInt();

		switch(userResponse){
			case 1: {
				System.out.println(addContact());
				break;
			}
			case 2: {
				System.out.println(removeContact());
				break;
			}
			case 3: {
				System.out.println(findContactByPhoneNumber());
				break;
			}

		}


	}
	public static void addContact(){
		System.out.println("\nEnter first name: ");
		String firstName = input.nextLine();
		firstNameStorage.add(firstName); 

		System.out.println("\nEnter last name: ");
		String lastName = input.nextLine();
		lastNameStorage.add(lastName); 

		System.out.println("\nEnter phonenumber: ");
		String phoneNumber = input.nextLine();
		phoneNumberStorage.add(phoneNumber);

		System.out.println("\nEnter email: ");
		String email = input.nextLine();
		emailStorage.add(email);

	}

	public static void removeContact(){
		System.out.print("Enter name you want to remove: ");
		String removeName = input.nextLine();

	}

	public static void findContactByPhoneNumber(){
		System.out.print("Search phone number: ");
		String phoneNumberSearch = input.nextLine();

	}

}