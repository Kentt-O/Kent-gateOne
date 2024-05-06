import java.util.Scanner;
public class Average 
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);

		int score = 0;

		for(int count = 1 ; count <= 10; count++)
		{
			System.out.printf("Enter Score: ");
			int userInput = sc.nextInt();
			score += userInput;
		}

		System.out.println("Average score is = " + score/ 10);



	}



}