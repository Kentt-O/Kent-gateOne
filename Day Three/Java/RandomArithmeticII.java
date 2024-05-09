import java.util.Scanner;
import java.util.Random;


public class RandomArithmeticII{

	public static void main(String...args){
		Scanner input = new Scanner(System.in);


		int correctAnswerCount = 0;
		int wrongAnswerCount = 0;

		for(int count = 1; count <=10; count++){
			
			Random random = new Random();
			int digitOne = random.nextInt(20)+ 1;
			int digitTwo = random.nextInt(10)+1;
			
			if (digitOne < 5){
				int randomArithmetic = digitOne + digitTwo;
				System.out.println("\nWhat is "+digitOne +" + "+ digitTwo);
				System.out.println("Enter the answer: ");
				int userResponse = input.nextInt();
				if (randomArithmetic == userResponse){
					System.out.println("Correct !!");
					correctAnswerCount++;
				}
				else {
					System.out.println("Wrong answer");
					wrongAnswerCount++;
				}

			}
			else if (digitOne > 5 && digitOne <= 10 ){
				int randomArithmetic = digitOne - digitTwo;
				System.out.println("\nWhat is "+digitOne+ " - "+ digitTwo);
				System.out.println("Enter the answer: ");
				int userResponse = input.nextInt();

				if (randomArithmetic == userResponse){
					System.out.println("Correct !!");
					correctAnswerCount++;
				}
				else{
					System.out.println("Wrong answer");
					wrongAnswerCount++;
				}
			}

			else if (digitOne > 10 && digitOne <= 15 ){
				int randomArithmetic = digitOne * digitTwo;
				System.out.println("\nWhat is "+digitOne +" X "+ digitTwo);
				System.out.println("Enter the answer: ");
				int userResponse = input.nextInt();

				if (randomArithmetic == userResponse){
					System.out.println("Correct !!");
					correctAnswerCount++;
				}
				else{
					System.out.println("Wrong answer");
					wrongAnswerCount++;
				}
			}

			else {
				int randomArithmetic = digitOne / digitTwo;
				System.out.println("\nWhat is "+digitOne +" / "+ digitTwo);
				System.out.println("Enter the answer: ");
				int userResponse = input.nextInt();

				if (randomArithmetic == userResponse){
					System.out.println("Correct !!");
					correctAnswerCount++;
				}
				else{
					System.out.println("Wrong answer");
					wrongAnswerCount++;
				}
			}

						
		}
		System.out.println("\nCorrect answers = " + correctAnswerCount);
		System.out.println("Wrong answers = " + wrongAnswerCount);


	}



}