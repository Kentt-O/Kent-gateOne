import java.util.Scanner;

public class PhoneBook {
	public static void  main (String... args){
		Scanner input = new Scanner(System.in);


		Object[][] storage = new Object [4][4];
		
		storage [0] = new  Object [ ] {"firstName","lastName" ,phoneNumber,"email"};
		storage [1] = new  Object [ ] {"firstName","lastName" ,phoneNumber,"email"};
		storage [2] = new  Object [ ] {"firstName","lastName" ,phoneNumber,"email"};
		storage [3] = new  Object [ ] {"firstName","lastName" ,phoneNumber,"email"};

		
		
		String prompt = """
		:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		:: Welcome to your new phonebook ::
		:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		Select an option 
		1 -> Add Contact
		2 -> Remove Contact
		3 -> Find contact by phone number
		4 -> Find contact by first name
		5 -> Find contact by last name
		6 -> Edit contact
		0 -> Back
		""";

		System.out.println(prompt)
		int userResponse = input.nextInt();

		switch(userResponse){
			case 1: {
				System.out.println(addContact)
				break;
			}
			case 2: {
				System.out.println(addContact)
				break;
			}
			case 3: {
				System.out.println(addContact)
				break;
			}

		}


	}
	public static void addContact(){
		System.out.println("Enter first name");
		String firstName = nextLine();

		System.out.println("Enter last name");
		String lastName = nextLine();
		
		System.out.println("Enter phonenumber");
		String phoneNumber = nextLine();

		System.out.println("Enter email");
		String email = nextLine();

	}

	public static void removeContact(){

	}
}