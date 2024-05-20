import java.util.Scanner;

public class ATM {

	private static final int ACCOUNT_NUMBER_LENGTH = 11;
    	private static final int PIN_LENGTH = 6;	

	public static void main (String... args){
		Scanner input =  new Scanner(System.in);

		while (true) {
			String automatedPrompt = """
			Kindly Select an option\n
			1 -> Create account
			2 -> Close account
			3 -> Deposit Money
			4 -> Withdraw Money
			5 -> Check account balance
			6 -> Transfer from one account to another
			7 -> Change Pin
			8 -> Exit
			""";

			System.out.println(automatedPrompt);
			int userInput = input.nextInt();
			input.nextLine();
		
			switch(userInput){
				case 1:
					createAccount(input);
					break;
				case 2:
					closeAccount();
					break;
				case 3:
					depositMoney();
					break;
				case 4:
                    			withdrawMoney();
                    			break;
                		case 5:
                    			checkBalance();
                    			break;
                		case 6:
                    			transferMoney();
                    			break;
                		case 7:
                    			changePin();
                    			break;
                		case 8:
                    			System.out.println("Thank you for using our ATM. Goodbye!");
                    			input.close();
                    			return;
                		default:
                    			System.out.println("Invalid option. Please try again.");

			}
		}
	}

	public static String [] createAccount(Scanner input){
		System.out.println("Enter your first name for your new account: ");
		String firstName = input.nextLine();

		System.out.println("Enter your last name for your new account: ");
		String lastName = input.nextLine();

		 String accountNumber;
        	do {
            		System.out.println("Enter phone number to be used as account number: ");
            		accountNumber = input.nextLine();
            		if (accountNumber.length() != ACCOUNT_NUMBER_LENGTH || accountNumber.charAt(0) != '0'){
                		System.out.println("Invalid input!!! Input an eleven digit number that starts with '0' ");
            		} else {
                		accountNumber = accountNumber.substring(1);
                		System.out.println("Your new account number is: " + accountNumber);
            		}
        	} while (accountNumber.length() != ACCOUNT_NUMBER_LENGTH - 1);

		String accountPin;
        	do {
            		System.out.println("Enter 6 digits new account pin: ");
            		accountPin = input.nextLine();
            		if (accountPin.length() != PIN_LENGTH || !accountPin.matches("\\d+")) {
                		System.out.println("Your pin needs to be a six digit number and contain only digits");
            		} else {
                		System.out.println("Password has been set successfully");
            		}
        	} while (accountPin.length() != PIN_LENGTH);


		String [ ] accountOpeningRequirements = new String[4];
    		accountOpeningRequirements[0] = firstName;
    		accountOpeningRequirements[1] = lastName;
    		accountOpeningRequirements[2] = accountNumber;
		accountOpeningRequirements[3] = accountPin;

		return accountOpeningRequirements;
	}

	public static String closeAccount(){
		
		return "Account successfully closed";
	}
	
	public static String depositMoney(){
		
		return "Deposit successful";
	}

	public static String withdrawMoney(){
		
		return "Withdrawal successful";
	}

	public static String checkBalance(){

		return "Balance is ";
	}

	public static String transferMoney(){

		return "Transaction successful";
	}

	public static String changePin(){

		return "Pin change successful";
	}

}
