import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MenstrualApp {
    	public static void main(String... args) {
        	Scanner scanner = new Scanner(System.in);

		System.out.println("=".repeat(30));
		System.out.println("Avoid Belle Calculator")
		System.out.println("=".repeat(30));

		String prompt = """
		\n Select one
		"1" -> Get menstration tips
		"2" -> Calculate cycle length and know safe days
		"3" -> Pregnancy tips
		"4" -> Get Ovulation tips
		"5" -> General Female health
		""";

		System.out.println(prompt);
		String userInput = sc.nextInt();

		switch(userInput){
			case 1: {
				System
				break;
			}



		}

        	System.out.println("Enter the start date of your last menstrual cycle (YYYY-MM-DD): ");
        	String startDate = scanner.nextLine();
        	
		System.out.println("\nEnter the start date of your current menstrual cycle (YYYY-MM-DD): ");
		String startDateTwo = scanner.nextLine();

		int days = calculateMenstrualCycle(startDate, startDateTwo);
			if (days < 21 && days >35){
				System.out.println("Cycle Length (Days): " + days + " you have an abnormal cycle length, please see a doctor");
			}else{
				System.out.println("Cycle Length (Days): " + days);
			}

		String [ ] ovulationRange = calculateOvulation(startDateTwo);
				System.out.println("Ovulation period: " + ovulationRange[0] + " to " + ovulationRange[2]);
				System.out.println("\nYou are fertile from: "+ ovulationRange[3] + " to " + ovulationRange[4] + "\nYou have a high chance of getting pregnant");

		
		System.out.println("\nHow many days does your period last for");
		int periodDays = scanner.nextInt();
		

    	}
	public static String menstrationtips(){
		
	}

    	public static int calculateMenstrualCycle(String startDate, String startDateTwo) {
        	LocalDate menstrualCycleStartDate = LocalDate.parse(startDate);
        	LocalDate currentDate = LocalDate.parse(startDateTwo);
       		return Period.between(menstrualCycleStartDate, currentDate).getDays();
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

	public static int calculateSafePeriod() {
		LocalDate 

	}

}
