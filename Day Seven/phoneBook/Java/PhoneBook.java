import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook {
	static Scanner input = new Scanner(System.in);
    	static ArrayList<String> firstNameStorage = new ArrayList<>();
    	static ArrayList<String> lastNameStorage = new ArrayList<>();
    	static ArrayList<String> phoneNumberStorage = new ArrayList<>();
    	static ArrayList<String> emailStorage = new ArrayList<>();

    	public static void main(String... args){
        	String prompt = """
        	: : : : : : : : : : : : : : : : : :         
        	:: Welcome to your new phonebook ::
        	: : : : : : : : : : : : : : : : : :   
        	Select an option 
        	1 -> Add Contact
        	2 -> Remove Contact
        	3 -> Find contact by phone number
        	4 -> Find contact by first name
        	5 -> Find contact by last name
        	6 -> Edit contact
        	0 -> Close Phonebook
        	""";

        	System.out.println(prompt);
        	int userResponse = input.nextInt();
		input.nextLine;

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
			case 4: {
				System.out.println(findContactByFirstName());
                		break;
			}
			case 5: {
				System.out.println(findContactByLastName());
                		break;
			}
			case 6:{
				System.out.println(editContact());
				break;
			}
			default:{
				System.out.println("Invalid Selection, Select option between 1 to 6");
				break;
			}
        	}
    	}

    	public static String addContact(){

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
	
		System.out.println("Saving >>>>>>>>>>>>>>");

        	return "Contact saved successfully!";
    	}

    	public static String removeContact(){
		System.out.print("Enter first name of the contact you want to remove: ");
        	String removeName = input.nextLine();

        	int index = firstNameStorage.indexOf(removeName);
       	 	if (index != -1) {
            		firstNameStorage.remove(index);
            		lastNameStorage.remove(index);
            		phoneNumberStorage.remove(index);
            		emailStorage.remove(index);

            		return "Contact removed successfully!";
        	} else {
            		return "Contact not found!";
        	}
    	}

    	public static String findContactByPhoneNumber(){
		System.out.print("Search phone number: ");
        	String phoneNumberSearch = input.nextLine();
        	int index = phoneNumberStorage.indexOf(phoneNumberSearch);
        	if (index != -1) {
            		return "Contact found: " + firstNameStorage.get(index) + " " + lastNameStorage.get(index);
        	} else {
            		return "Contact not found!";
        	}
    	}
	
	public static String findContactByFirstName(){
		System.out.print("Enter contact first name: ");
		String firstNameSearch = input.nextLine();
		
		return "Contact found!";
	}

	public static String findContactByLastName(){
		System.out.print("Enter contact first name: ");
		String firstNameSearch = input.nextLine();
	
		return "Contact found!";

	}

	public static String editContact(){
		
		return "Sucessfully edited";
	}
}
