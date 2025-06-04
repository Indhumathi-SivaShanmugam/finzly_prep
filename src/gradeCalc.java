import java.util.Scanner;

public class gradeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks for 5 subjects
        int[] marks = new int[5];
        String[] subjects = {"Math", "Science", "English", "History", "Programming"};

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + " (out of 100): ");
            marks[i] = scanner.nextInt();
        }

        // Calculate total and average
        int total = calculateTotal(marks);
        double average = (double) total / marks.length;

        // Determine grade
        String grade = calculateGrade(average);

        // Output results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Grade: " + grade);
    }

    // Method to calculate total marks
    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to assign grade
    public static String calculateGrade(double average) {
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }
}