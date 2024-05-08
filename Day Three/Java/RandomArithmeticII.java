import java.util.Scanner;
import java.util.Random;


public class RandomArithmeticII{

	public static void main(String...args){
		Scanner input = new Scanner(System.in);


		int correct_answer_count = 0;
		int wrong_answer_count = 0;

		for(int count = 1; count <=10; count++){
			
			Random random = new Random();
			int digitOne = random.nextInt(20)+ 1;
			int digitTwo = random.nextInt(10)+1;
			
			if (digitOne < 5){
				int random_arithmetic = digit_one + digit_two;
				System.out.println(digit_one, " + ", digit_two);
				System.out.println("Enter the answer: "));
				int userResponse = input.nextInt();
				if (random_arithmetic == user_response){
					System.out.println("Correct !!");
					correct_answer_count++;
				}
			else{
				System.out.println("Wrong answer");
				wrong_answer_count++;

			}
			if (digitOne > 5 && digitOne <= 10 ){
				int random_arithmetic = digit_one - digit_two;
				System.out.println(digit_one, " - ", digit_two);
				System.out.println("Enter the answer: "));
				int userResponse = input.nextInt();

				if (random_arithmetic == user_response){
					System.out.println("Correct !!");
					correct_answer_count++;
				}
			else{
				System.out.println("Wrong answer");
				wrong_answer_count++;

			}




			} 
			

		}

	}



}