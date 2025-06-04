import java.io.*;
import java.util.*;

public class Excep_Hand {

    public static void main(String[] args) {
        // ===== 1. BASIC TRY-CATCH =====
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("1. Caught ArithmeticException: " + e.getMessage());
        }

        // ===== 2. MULTIPLE CATCH BLOCKS =====
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. Caught ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("2. Caught generic Exception");
        }

        // ===== 3. FINALLY BLOCK =====
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("nonexistent.txt")); // FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("3. Caught FileNotFoundException");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("3. Finally block executed regardless of exception");
        }

        // ===== 4. TRY-WITH-RESOURCES =====
        try (BufferedReader br = new BufferedReader(new FileReader("nonexistent.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("4. Caught IOException with try-with-resources");
        }

        // ===== 5. THROWING EXCEPTIONS =====
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("5. " + e.getMessage());
        }

        // ===== 6. CUSTOM EXCEPTIONS =====
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("6. Caught: " + e.getMessage());
        }

        // ===== 7. EXCEPTION PROPAGATION =====
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("7. Exception caught in main: " + e.getMessage());
        }

        // ===== 8. PRINT STACK TRACE =====
        try {
            Integer.parseInt("abc"); // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("8. Printing stack trace:");
            e.printStackTrace();
        }
    }

    // ===== Helper Methods =====

    // Method that throws checked exception
    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }
    }

    // Demonstrating exception propagation
    private static void methodA() {
        methodB();
    }

    private static void methodB() {
        throw new RuntimeException("Exception thrown in methodB");
    }

    // ===== Custom Exception Classes =====
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    static class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }
}