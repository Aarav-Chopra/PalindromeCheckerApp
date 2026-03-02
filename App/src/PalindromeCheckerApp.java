/*
 * Application Name : PalindromeChecker App
 * Version          : 1.0
 * Use Case 3       : Palindrome Check Using String Reverse
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string (can be changed for testing)
        String original = "level";

        System.out.println("PalindromeChecker App - Version 1.0");
        System.out.println("-------------------------------------");
        System.out.println("Original String: " + original);

        // Reverse the string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String concatenation
        }

        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("-------------------------------------");
        System.out.println("Program completed.");
    }
}