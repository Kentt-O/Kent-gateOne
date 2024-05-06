import java.util.Scanner;
public class SumOfEvenIndexes 
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);

		int score = 0;
		int evenIndexes = 0;

		for(int count = 1 ; count <= 10; count++)
		{
			System.out.printf("Enter Score: ");
			int userInput = sc.nextInt();
			score += userInput;

			if (count % 2 == 0)
			{
				evenIndexes += userInput;

			}
		}

		System.out.println("Sum of the even indexes = "+ evenIndexes);



	}



}