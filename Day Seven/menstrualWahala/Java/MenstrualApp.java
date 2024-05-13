import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MenstrualApp {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start date of your last menstrual cycle (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();

        int days = calculateMenstrualCycle(startDate);
        System.out.println("Days since last menstrual cycle: " + days);
    }

    public static int calculateMenstrualCycle(String startDate) {
        LocalDate menstrualCycleStartDate = LocalDate.parse(startDate);
        LocalDate currentDate = LocalDate.now();
        return Period.between(menstrualCycleStartDate, currentDate).getDays();
    }
}
