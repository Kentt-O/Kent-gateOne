import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;
import java.util.Scanner;

public class MenstrualApp {
    	public static void main(String... args) {
        	Scanner scanner = new Scanner(System.in);

		String userInput = "";
		while (!userInput.equals("6")) {

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
		"6" -> Quit
		""";

		System.out.println(prompt);
		userInput = scanner.nextLine();

		switch(userInput){
			case "1": {
				System.out.print("MENSTRUATION TIPs\n");
				System.out.print(menstrationTips());
				break;
			}
			case "2":{

				System.out.println("Hey Beautiful ! whats your name: ");
				String userName = scanner.nextLine();

				System.out.println("Enter the start date of your last menstrual cycle (YYYY-MM-DD): ");
        			String startDate = scanner.nextLine();
        	
				System.out.println("\nEnter the start date of your current menstrual cycle (YYYY-MM-DD): ");
				String startDateTwo = scanner.nextLine();

				System.out.println("\nHow many days does your period last for");
				int periodDays = scanner.nextInt();

				long days = calculateMenstrualCycle(startDate, startDateTwo);
					if (days < 21 || days >35){
						System.out.println("\nHey " + userName + " your Cycle Length is: " + days + " days "+ "\nyou have an abnormal cycle length, please see a doctor");
					}else{
						System.out.println("\nHey " + userName + " your Cycle Length is: " + days + " days ");
					}
				int cycleLength = (int) days;

				String [ ] ovulationRange = calculateOvulation(startDateTwo);
				System.out.println("\n" + userName + " your ovulation period if from: " + ovulationRange[0] + " to " + ovulationRange[2]);
				System.out.println("\nYou are fertile from: "+ ovulationRange[3] + " to " + ovulationRange[4] + "\nYou have a high chance of getting pregnant");


				String [] safeDaysResult = calculateSafeDays(startDateTwo, periodDays, cycleLength);
    				System.out.println("\nSafe days are from " + safeDaysResult[0] + " to " + safeDaysResult[1] + " and from " + safeDaysResult[2] + " to " + safeDaysResult[3]);
				System.out.println("\n" + userName + " your next period flow is : " + safeDaysResult[4]);

				break;
			}
			case "3":{
				System.out.print("PREGNANCY TIPs\n");
				System.out.print(pregnancyTips());
				break;
			}
			case "4":{
				System.out.print("OVULATION TIPs\n");
				System.out.print(ovulationTips());
				break;
			}
			case "5":{
				System.out.print("General Female Health\n");
				System.out.print(ovulationTips());
				break;
			}
			case "6":{
				System.out.println("Thank you for using the Avoid Belle Calculator. Enjoy Sex Responsibly!");
				break;
			}
			default: {
        			System.out.println("Invalid input. Please enter a number between 1 and 5.");
      				 break;
			}
		}	
    	}

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
	
	public static String[] calculateSafeDays(String startDateTwo, int periodDays, int cycleLength) {
    		LocalDate date = LocalDate.parse(startDateTwo);
    		LocalDate returnValue  = date.plusDays(cycleLength).minusDays(14); 
    		LocalDate  daysBefore = returnValue.minusDays(2); 
    		LocalDate  daysAfter = returnValue.plusDays(2); 
    		LocalDate  fertileDayStart = daysBefore.minusDays(5);
    		LocalDate  fertileDayStop = daysAfter.plusDays(2);

		LocalDate nextFlow  = date.plusDays(cycleLength);
		LocalDate nextFlowStop  = nextFlow.plusDays(periodDays);

    		LocalDate safeDayStart = date.plusDays(periodDays);
    		LocalDate safeDayStop = fertileDayStart.minusDays(1);
    		LocalDate safeDayStartAfterOvulation = fertileDayStop.plusDays(1);
    		LocalDate endOfCycle = date.plusDays(cycleLength);

    		String [ ] dateRange = new String[6];
    		dateRange[0] = safeDayStart.toString();
    		dateRange[1] = safeDayStop.toString();
    		dateRange[2] = safeDayStartAfterOvulation.toString();
    		dateRange[3] = endOfCycle.toString();
		dateRange[4] = nextFlow.toString();
		dateRange[5] = nextFlowStop.toString();

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
	
	public static String pregnancyTips(){
	
	String pTips = """
	PREGNANCY DOs\n
	1. Do take a multivitamin
	Eating a balanced diet that’s rich in vitamins and minerals 
	is the best way to provide your body with all of the healthy nutrients it needs to support a growing baby. 
	A healthy diet alone, however, may not be enough for pregnancy.\n

	Prenatal vitamins contain higher levels of certain nutrients 
	that expectant mothers require at higher doses, such as:\n

	1. folic acid
	2. calcium
	3. iron
	These vitamins assist with proper development of the fetus and help prevent birth defects.
	 Your doctor can help you find a multivitamin or a series of vitamins that are best for you.\n

	A multivitamin will usually include DHA, EPA, or both. 
	These are omega-3 fats that are important for your baby’s proper brain development.\n

	Don’t take more than one dose of multivitamins, though. 
	Some vitamins in higher amounts can be harmful to the baby.\n

	Shop for multivitamins online.\n\n

	PREGNANCY DONT\n
	1. Don’t smoke
	Babies born to women who smoke during pregnancy are more likely
	to have a lower birth weight and are at a greater risk for learning disabilities 
	than children born to nonsmoking mothers.\n

	Additionally, children born to women who smoke are more likely 
	to try smoking at a younger age and become regular smokers earlier, due to physiologic nicotine addiction.\n

	2. Don’t drink alcohol
	Alcohol may greatly impact your baby’s development. 
	People who drink alcohol while pregnant couldTrusted Source deliver a baby with fetal alcohol syndrome (FAS).\n

	Symptoms of FAS include:\n

	low birth weight
	learning disabilities
	behavior problems
	lagging patterns in terms of growth and development milestones
	Even small amounts of alcohol can be a problem. There appears to be no safe level of alcohol intake in pregnancy.\n

	If you need help stopping drinking while you’re pregnant, talk with your doctor as soon as possible. 
	The sooner you get help, the healthier your baby is likely to be.

	""";
	return pTips;
	}
	public static String ovulationTips(){
	String oTips = """
	NO GO KNACK IF YOU NO WAN GET BELLE O!!!!!
	""";
	return oTips;
	}
}

