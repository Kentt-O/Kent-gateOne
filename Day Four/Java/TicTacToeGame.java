import java.util.Scanner;
public class TicTacToeGame {

	public static void main(String...args){
		Scanner input = new Scanner(System.in);

		String [ ][ ] arrangement = new String [3][3];

		
		for (int count = 1; count < 10; count++) {

			System.out.println("\nEnter X or O: ");
			String userResponse = input.nextLine();
			
			String rowNumber = """
			\nSELECT YOUR PREFERRED POSITION
			1 -> One
			2 -> Two
			3 -> Three
			4 -> Four
			5 -> Five
			6 -> Six
			7 -> Seven
			8 -> Eight
			9 -> Nine
			""";
			
			System.out.println(rowNumber);
			String userInput = input.nextLine();

			switch(userInput){
				case "1":{
					arrangement[0][0] = userResponse;
					break;
				}
				case "2":{
					arrangement[0][1] = userResponse;
					break;
				}
				case "3":{
					arrangement[0][2] = userResponse;
					break;
				}
				case "4":{
					arrangement[1][0] = userResponse;
					break;
				}
				case "5":{
					arrangement[1][1] = userResponse;
					break;
				}
				case "6":{
					arrangement[1][2] = userResponse;
					break;
				}
				case "7":{
					arrangement[2][0] = userResponse;
					break;
				}
				case "8":{
					arrangement[2][1] = userResponse;
					break;
				}
				case "9":{
					arrangement[2][2] = userResponse;
					break;
				}
				default:{
					System.out.print("Invalid input");
					break;
				} 

			}
		
		for(String[] row : arrangement){
			String rowOne =  row[0];
			String rowTwo =   row[1];
			String rowThree =  row [2];
			System.out.printf("%-7s %-7s %-7s\n", rowOne, rowTwo, rowThree);
		}

		}
		
		
	}


}