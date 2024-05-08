import java.util.Scanner;
import java.util.Random;


public class RandomArithmetic{

	public static void main(String...args){
		Scanner input = new Scanner(System.in);


		// System.out.println(random.nextBoolean());

		for(int count = 1; count <=10; count++){
			
			Random random = new Random();
			int digitOne = random.nextInt(20)+ 1;
			int digitTwo = random.nextInt(10)+1;

			Random operatorChoice = new Random();
			int operator = operatorChoice.nextInt(4));

			String operatorSwitch = """
			int bad
			int good
			""";

			switch(operator){

				case 0: {
					operatorSwitch = "+";
					good = digitOne + digitTwo;
					break;
				}
				case 1: {
					operatorSwitch = "-";
					good = digitOne - digitTwo;
					break;
				}
				case 2: {
					operatorSwitch = "*";
					good = digitOne * digitTwo;
					break;
				}
				case 3: {
					operatorSwitch = "/";
					good = digitOne * digitTwo;
					break;
				}
				default:{
					System.out.println("Invalid input");
				}

			}
			//System.out.pr
		}

	}



}