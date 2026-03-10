/*
 * Application Name : PalindromeChecker App
 * Version          : 1.0
 * Use Case 10      : Case-Insensitive & Space-Ignored Palindrome
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string with spaces and mixed case
        String input = "A man a plan a canal Panama";

        System.out.println("PalindromeChecker App - Version 1.0");
        System.out.println("-------------------------------------");
        System.out.println("Original Input: " + input);

        // Step 1: Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("Normalized Input: " + normalized);

        // Step 2: Reverse the normalized string
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Step 3: Compare strings
        if (normalized.equals(reversed)) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("-------------------------------------");
        System.out.println("Program completed.");
    }
}