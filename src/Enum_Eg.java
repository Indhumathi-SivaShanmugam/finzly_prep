import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Enum_Eg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Day (e.g., MONDAY): ");
        String input = scanner.nextLine().toUpperCase();

        try {
            Day today = Day.valueOf(input);

            switch (today) {
                case MONDAY -> System.out.println("Start of the work week.");
                case FRIDAY -> System.out.println("Weekend is near!");
                case SUNDAY -> System.out.println("Rest day.");
                default -> System.out.println("Midweek day.");
            }

            // Loop through all enum values
            System.out.println("\nAll Days:");
            for (Day d : Day.values()) {
                System.out.println(d);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered. Please enter a valid day in all caps (e.g., MONDAY).");
        }

        scanner.close();
    }
}
