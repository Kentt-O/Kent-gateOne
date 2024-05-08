import java.util.Scanner;

public class TaskOne {

	public static void main(String... args){
		Scanner keyboardInput = new Scanner(System.in);
		int [ ] scores = new int [10];

		for (int index = 0; index < 10; index++){
			System.out.println("Enter score "+(index+1) + ": ");
			int userInput = keyboardInput.nextInt();
			scores[index] = userInput;

		}
		
	}

}