import java.util.Scanner;

public class ATM {

	public static void main (String... args){
		Scanner input =  new Scanner(System.in);

		String automatedPrompt = """
		1 -> Create account
		2 -> Close account
		3 -> Deposit Money
		4 -> Withdraw Money
		5 -> Check account balance
		6 -> Transfer from one account to another
		7 -> Change Pin
		""";

		System.out.println(automatedPrompt);
		int userInput = scanner.nextInt();
		
		switch(userInput){
			case 1:{
				createAccount();
				break;
			}
		}
	

	}
	public static String createAccount(){
		System.out.println("Enter your first name for your new account: ");
		String firstName = input.nextLine();

		System.out.println("Enter your last name for your new account: ");
		String lastName = input.nextLine();
		
		System.out.println("Enter phone number to be used as account number: ");
		String accountNumber = input.next();
			if (accountNumber.length != 11 && accountNumber.charAt(0) != "0"){
				System.out.println("Invalid !!! Input an eleven digit number that starts with ");
			}else{
				accountNumber = accountNumber.substring(1);
				System.out.println("Your account number is" + accountNumber)
			}

		System.out.println("Enter 6 digits new account pin: ");
		String accountPin = input.nextLine();


	}

}