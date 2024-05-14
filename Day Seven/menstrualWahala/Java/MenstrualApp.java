import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;
import java.util.Scanner;

public class MenstrualAppII {
    	public static void main(String... args) {
        	Scanner scanner = new Scanner(System.in);

		System.out.println("=".repeat(26));
		System.out.println("  Avoid Belle Calculator");
		System.out.println("=".repeat(26));

		String prompt = """
		KINDLY SELECT\n
		"1" -> Get menstration tips
		"2" -> Calculate cycle length and know safe days
		"3" -> Pregnancy tips
		"4" -> Get Ovulation tips
		"5" -> General Female health
		""";

		System.out.println(prompt);
		String userInput = scanner.nextLine();

		switch(userInput){
			case "1": {
				System.out.print("MENSTRUATION TIPs\n");
				System.out.print(menstrationTips());
				break;
			}
			case "2":{

				System.out.println("Enter the start date of your last menstrual cycle (YYYY-MM-DD): ");
        			String startDate = scanner.nextLine();
        	
				System.out.println("\nEnter the start date of your current menstrual cycle (YYYY-MM-DD): ");
				String startDateTwo = scanner.nextLine();

				long days = calculateMenstrualCycle(startDate, startDateTwo);
					if (days < 21 || days >35){
						System.out.println("\nCycle Length (Days): " + days + " you have an abnormal cycle length, please see a doctor");
					}else{
						System.out.println("\nCycle Length (Days): " + days);
					}

				String [ ] ovulationRange = calculateOvulation(startDateTwo);
				System.out.println("\nOvulation period: " + ovulationRange[0] + " to " + ovulationRange[2]);
				System.out.println("\nYou are fertile from: "+ ovulationRange[3] + " to " + ovulationRange[4] + "\nYou have a high chance of getting pregnant");

				break;
			}
			default: {
        			System.out.println("Invalid input. Please enter a number between 1 and 5.");
      				 break;
			}


		}



        	
		System.out.println("\nHow many days does your period last for");
		int periodDays = scanner.nextInt();
		

    	}

    	public static long calculateMenstrualCycle(String startDate, String startDateTwo) {
        	LocalDate menstrualCycleStartDate = LocalDate.parse(startDate);
        	LocalDate currentDate = LocalDate.parse(startDateTwo);
       		//return Period.between(menstrualCycleStartDate, currentDate).getDays();
		return ChronoUnit.DAYS.between(menstrualCycleStartDate, currentDate);
    	}

	public static String [ ]  calculateOvulation(String startDateTwo) {
		LocalDate date = LocalDate.parse(startDateTwo);
		LocalDate returnValue  = date.minusDays(14); 
		LocalDate  daysBefore = returnValue.minusDays(2); 
		LocalDate  daysAfter = returnValue.plusDays(2); 
		LocalDate  fertileDayStart = daysBefore.minusDays(5);
		LocalDate  fertileDayStop = daysAfter.plusDays(2);
		//return Period.between(daysBefore, daysAfter).getDays();

		String [ ] dateRange = new String[5];
    		dateRange[0] = daysBefore.toString();
    		dateRange[1] = returnValue.toString() ;
    		dateRange[2] = daysAfter.toString();
		dateRange[3] = fertileDayStart.toString();
		dateRange[4] = fertileDayStop.toString();

    		return dateRange;
	}

	public static String menstrationTips(){

	String tips = """
	DIET AND LIFESTYLE CHANGES:\n\n
        Examine your diet: 
		Eating too little food or not getting the right mix of nutrients may stress vital organs,
		examples include,your hypothalamus, pituitary, and adrenal glands. 
		These glands regulate your body’s hormone balance, which can affect your periods.\n
        Skip the low-carb diet: 
		Not getting enough carbs can lead to irregular or even missed cycles (amenorrhea). 
		Experts recommend getting 225 to 325 grams of carbs per day if you’re consuming a 2,000-calorie diet.\n
        Say no to high-fiber diets: 
		Eating too much fiber may affect ovulation, making periods late or causing you to skip them altogether. 
		Experts recommend getting 25 to 30 grams of fiber per day.\n
        Make sure you’re getting enough fats: 
		Consuming enough fats may support hormone levels and ovulation. 
		The Cleveland Clinic recommends that 20 to 35 percent of your daily calories should be from fat.\n
        Maintain a healthy weight: 
		Your weight can impact your menstrual cycle. 
		Maintaining a healthy weight through a balanced diet and regular exercise can help regulate your periods.\n
        Get regular exercise: 
		Regular physical activity can help regulate your menstrual cycle.\n
        Practice good sleep habits: 
		Lack of sleep or poor sleep quality can affect your menstrual cycle. Try to get at least 7-9 hours of sleep per night.\n
        Reduce stress: High levels of stress can affect your menstrual cycle. 
		Consider stress-reducing activities like yoga, meditation, or other relaxation techniques.\n
	""";
    		return tips;

	}


}
