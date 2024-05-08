import java.util.Scanner;

public class TaskThree {

	public static void main(String... args){
		Scanner keyboardInput = new Scanner(System.in);
		int [] scores = new int [10];

		for (int index = 0; index < 10; index++){
			System.out.println("Enter score "+(index+1) + ": ");
			int userInput = keyboardInput.nextInt();
			scores[index] = userInput;

		}
		for (int indexTwo = 0; indexTwo < 10; indexTwo++){
			System.out.print("Scores: " + scores[indexTwo] + " ");
			System.out.println( );

		}
	}

}