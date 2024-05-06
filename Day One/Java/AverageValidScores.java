import java.util.Scanner;
public class AverageValidScores 
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);

		int score = 0;
		int validScoreCount = 0;

		for(int count = 1 ; count <= 10; count++)
		{
			System.out.printf("Enter Score: ");
			int userInput = sc.nextInt();

			if (userInput >= 0 && userInput<= 100)
			{
				score += userInput;
					validScoreCount++;
			} else {
				System.out.println("Please enter a valid score");
					count--;
			}
		}

		System.out.println("Average valid score is = " + score/ validScoreCount);



	}



}