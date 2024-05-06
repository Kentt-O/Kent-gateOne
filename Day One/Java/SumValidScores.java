import java.util.Scanner;
public class SumValidScores 
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);

		int score = 0;

		for(int count = 1 ; count <= 10; count++)
		{
			System.out.printf("Enter Score: ");
			int userInput = sc.nextInt();

			if (userInput >= 0 && userInput<= 100)
			{
				score += userInput;

			} else {
				System.out.println("Please enter a valid score");
					count--;
			}
		}

		System.out.println("Total score is = " + score);



	}



}