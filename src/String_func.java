import java.util.Arrays;

public class String_func {
    public static void main(String[] args) {
        // ===== 1. String Creation =====
        String str1 = "Hello";  // String literal (stored in string pool)
        String str2 = new String("World");  // String object (heap memory)
        char[] chars = {'J', 'a', 'v', 'a'};
        String str3 = new String(chars);  // From char array

        System.out.println("1. Created Strings:");
        System.out.println(str1 + " " + str2 + " " + str3);

        // ===== 2. Basic String Operations =====
        System.out.println("\n2. Basic Operations:");
        System.out.println("Length of '" + str1 + "': " + str1.length());
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());
        System.out.println("Concatenation: " + str1.concat(" ").concat(str2));
        System.out.println("Character at index 1 in 'Java': " + str3.charAt(1));

        // ===== 3. String Comparison =====
        System.out.println("\n3. String Comparison:");
        String s1 = "hello";
        String s2 = "HELLO";
        System.out.println("Equals (case-sensitive): " + s1.equals(s2));
        System.out.println("EqualsIgnoreCase: " + s1.equalsIgnoreCase(s2));
        System.out.println("CompareTo (lexicographical): " + s1.compareTo(s2));

        // ===== 4. Searching in Strings =====
        System.out.println("\n4. Searching Operations:");
        String text = "Java is fun to learn and Java is powerful";
        System.out.println("Index of 'fun': " + text.indexOf("fun"));
        System.out.println("Last index of 'Java': " + text.lastIndexOf("Java"));
        System.out.println("Contains 'learn'? " + text.contains("learn"));
        System.out.println("Starts with 'Java'? " + text.startsWith("Java"));
        System.out.println("Ends with 'ful'? " + text.endsWith("ful"));

        // ===== 5. String Manipulation =====
        System.out.println("\n5. String Manipulation:");
        System.out.println("Substring (7-12): " + text.substring(7, 12));
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
        System.out.println("Trim whitespace: '" + "  Hello World  ".trim() + "'");

        // ===== 6. Splitting & Joining =====
        System.out.println("\n6. Splitting & Joining:");
        String csv = "apple,orange,banana,mango";
        String[] fruits = csv.split(",");
        System.out.println("Split fruits: " + Arrays.toString(fruits));
        System.out.println("Joined with - : " + String.join("-", fruits));

        // ===== 7. String Conversion =====
        System.out.println("\n7. Conversion Operations:");
        int num = 123;
        System.out.println("Int to String: " + String.valueOf(num));
        System.out.println("String to char array: " + Arrays.toString(str3.toCharArray()));

        // ===== 8. StringBuilder (Mutable Strings) =====
        System.out.println("\n8. StringBuilder (Mutable):");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ").append("World");  // Modifies original
        sb.insert(5, " Java ");
        sb.reverse();
        System.out.println("Modified String: " + sb.toString());
    }
}