import java.util.Scanner;

public class PalinCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine(); //avoids confusion

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();

        // Compare characters from start and end
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}