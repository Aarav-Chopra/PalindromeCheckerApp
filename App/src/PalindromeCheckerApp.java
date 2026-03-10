/*
 * Application Name : PalindromeChecker App
 * Version          : 1.0
 * Use Case 11      : Object-Oriented Palindrome Service
 */

// Service class that encapsulates palindrome logic
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

// Main Application class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        System.out.println("PalindromeChecker App - Version 1.0");
        System.out.println("-------------------------------------");
        System.out.println("Input String: " + input);

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call service method
        boolean result = checker.checkPalindrome(input);

        // Display result
        if (result) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("-------------------------------------");
        System.out.println("Program completed.");
    }
}