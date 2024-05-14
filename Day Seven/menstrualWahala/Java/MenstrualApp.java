import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MenstrualApp {
    	public static void main(String... args) {
        	Scanner scanner = new Scanner(System.in);

        	System.out.println("Enter the start date of your last menstrual cycle (YYYY-MM-DD): ");
        	String startDate = scanner.nextLine();
        	
		System.out.println("Enter the start date of your current menstrual cycle (YYYY-MM-DD): ");
		String startDateTwo = scanner.nextLine();

		int days = calculateMenstrualCycle(startDate, startDateTwo);
			if (days < 21 && days >35){
				System.out.println("Days since last menstrual cycle : " + days + " you have an abnormal cycle, please see a doctor");
			}else{
				System.out.println("Days since last menstrual cycle: " + days);
			}

		String [ ] ovulationRange = calculateOvulation(startDateTwo);
				System.out.println("Ovulation period: " + ovulationRange[0] + " to " + ovulationRange[2]);
			
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
		//return Period.between(daysBefore, daysAfter).getDays();

		String [ ] dateRange = new String[3];
    		dateRange[0] = daysBefore.toString();
    		dateRange[1] = returnValue.toString() ;
    		dateRange[2] = daysAfter.toString();

    		return dateRange;
	}

	public static int calculateFertiity() {
		LocalDate  daysBefore = calculateOvulation.returnValue.minusDays(2);
		LocalDate  fertileDayStart = dayBefore.minusDays(5);
		LocalDate  daysAfter = returnValue.plusDays(2); 
		return Period.between(daysBefore, fertileDayStart).getDays();
	}

	public static int calculatePeriodDate(String startDateTwo){
		LocalDate menstrualCycleStartDate = LocalDate.parse(startDate);
        	LocalDate currentDate = LocalDate.parse(startDateTwo);
       		LocalDate days = Period.between(menstrualCycleStartDate, currentDate).getDays();
		LocalDate nextPeriodDate = 


	}
	public static int calculateSafePeriod()
}
