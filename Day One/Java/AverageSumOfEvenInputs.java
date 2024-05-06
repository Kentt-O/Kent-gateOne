import java.util.Scanner;
public class AverageSumOfEvenInputs 
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);

		int score = 0;
		int evenInputs = 0;
		int evenInputCount = 0;

		for(int count = 1 ; count <= 10; count++)
		{
			System.out.printf("Enter Score: ");
			int userInput = sc.nextInt();
			score += userInput;

			if (userInput % 2 == 0)
			{
				evenInputs += userInput;
					evenInputCount++;
			}
		}

		System.out.println("Average Sum of the even inputs = "+ evenInputs/evenInputCount);

	}



}