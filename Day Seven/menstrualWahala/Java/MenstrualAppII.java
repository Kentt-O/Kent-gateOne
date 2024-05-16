import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MenstrualAppII {
    	public static void main(String... args) {
        	Scanner scanner = new Scanner(System.in);

		System.out.println("=".repeat(26));
		System.out.println("  Avoid Belle Calculator");
		System.out.println("=".repeat(26));


        	System.out.println("Enter the start date of your last menstrual cycle (DD-MM-YYYY): ");
        	String startDate = scanner.nextLine();
        	
		System.out.println("\nEnter the start date of your current menstrual cycle (DD-MM-YYYY): ");
		String startDateTwo = scanner.nextLine();

		long days = calculateMenstrualCycle(startDate, startDateTwo);
			if (days < 21 || days >35){
				System.out.println("\nCycle Length (Days): " + days + " you have an abnormal cycle length, please see a doctor");
			}else{
				System.out.println("\nCycle Length (Days): " + days);
			}

		String [ ] ovulationRange = calculateOvulation(startDateTwo);
				System.out.println("Ovulation period: " + ovulationRange[0] + " to " + ovulationRange[2]);
				System.out.println("\nYou are fertile from: "+ ovulationRange[3] + " to " + ovulationRange[4] + "\nYou have a high chance of getting pregnant");

		
		System.out.println("\nHow many days does your period last for");
		int periodDays = scanner.nextInt();
		

    	}

    	public static long calculateMenstrualCycle(String startDate, String startDateTwo) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    		LocalDate menstrualCycleStartDate = LocalDate.parse(startDate, formatter);
    		LocalDate currentDate = LocalDate.parse(startDateTwo, formatter);
    		//return Period.between(menstrualCycleStartDate, currentDate).getDays();
		return ChronoUnit.DAYS.between(menstrualCycleStartDate, currentDate);

    	}

	public static String [ ]  calculateOvulation(String startDateTwo) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    		LocalDate date = LocalDate.parse(startDateTwo, formatter);
    		LocalDate returnValue  = date.minusDays(14); 
    		LocalDate  daysBefore = returnValue.minusDays(2); 
    		LocalDate  daysAfter = returnValue.plusDays(2); 
    		LocalDate  fertileDayStart = daysBefore.minusDays(5);
    		LocalDate  fertileDayStop = daysAfter.plusDays(2);

    		String [ ] dateRange = new String[5];
    		dateRange[0] = daysBefore.format(formatter);
    		dateRange[1] = returnValue.format(formatter);
    		dateRange[2] = daysAfter.format(formatter);
    		dateRange[3] = fertileDayStart.format(formatter);
    		dateRange[4] = fertileDayStop.format(formatter);

		return dateRange;
	}

	public static String[] calculateSafeDays(String startDateTwo, int periodDays, int cycleLength) {
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    		LocalDate date = LocalDate.parse(startDateTwo, formatter);
    		LocalDate returnValue  = date.plusDays(cycleLength).minusDays(14); 
    		LocalDate  daysBefore = returnValue.minusDays(2); 
    		LocalDate  daysAfter = returnValue.plusDays(2); 
    		LocalDate  fertileDayStart = daysBefore.minusDays(5);
    		LocalDate  fertileDayStop = daysAfter.plusDays(2);

    		LocalDate safeDayStart = date.plusDays(periodDays);
    		LocalDate safeDayStop = fertileDayStart.minusDays(1);
    		LocalDate safeDayStartAfterOvulation = fertileDayStop.plusDays(1);
    		LocalDate endOfCycle = date.plusDays(cycleLength);

    		String [ ] dateRange = new String[4];
    		dateRange[0] = safeDayStart.format(formatter);
    		dateRange[1] = safeDayStop.format(formatter);
    		dateRange[2] = safeDayStartAfterOvulation.format(formatter);
    		dateRange[3] = endOfCycle.format(formatter);

    		return dateRange;
	}

	

}
