import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Array Declaration & Initialization
        int[] numbers = {5, 2, 9, 1, 5, 6};
        String[] names = new String[3]; // Uninitialized (null by default)

        // 2. Manual Initialization (User Input)
        System.out.println("Enter 3 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        // 3. Array Traversal (for loop & for-each)
        System.out.println("\nNumbers Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nNames Array (for-each):");
        for (String name : names) {
            System.out.print(name + " ");
        }

        // 4. Sorting Arrays
        java.util.Arrays.sort(numbers);
        System.out.println("\n\nSorted Numbers: " + java.util.Arrays.toString(numbers));

        // 5. Searching in Arrays (Binary Search - Must be sorted first!)
        int key = 5;
        int index = java.util.Arrays.binarySearch(numbers, key);
        System.out.println(key + " found at index: " + index);

        // 6. Comparing Arrays
        int[] numbersCopy = java.util.Arrays.copyOf(numbers, numbers.length);
        System.out.println("Are arrays equal? " + java.util.Arrays.equals(numbers, numbersCopy));

        // 7. Filling Arrays with Default Values
        int[] emptyArray = new int[5];
        java.util.Arrays.fill(emptyArray, -1); // Fills all elements with -1
        System.out.println("Filled Array: " + java.util.Arrays.toString(emptyArray));

        // 8. Copying Arrays (Partial Copy)
        int[] partialCopy = java.util.Arrays.copyOfRange(numbers, 1, 4); // Copies indices 1 to 3
        System.out.println("Partial Copy: " + java.util.Arrays.toString(partialCopy));

        // 9. Multidimensional Arrays
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("\n2D Matrix:");
        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // 10. Array to String Conversion
        System.out.println("\nNumbers as String: " + java.util.Arrays.toString(numbers));

        scanner.close();
    }
}