/*
 * Application Name : PalindromeChecker App
 * Version          : 1.0
 * Use Case 2       : Print Hardcoded Palindrome Result
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        // Display the word being checked
        System.out.println("PalindromeChecker App - Version 1.0");
        System.out.println("-------------------------------------");
        System.out.println("Checking word: " + word);

        // Reverse the string
        String reversedWord = "";
        
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        // Conditional check using if-else
        if (word.equals(reversedWord)) {
            System.out.println("Result: \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("-------------------------------------");
        System.out.println("Program completed.");
    }
}