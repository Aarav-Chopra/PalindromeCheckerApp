/*
 * Application Name : PalindromeChecker App
 * Version          : 1.0
 * Use Case 5       : Stack-Based Palindrome Checker
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string (can be modified for testing)
        String input = "madam";

        System.out.println("PalindromeChecker App - Version 1.0");
        System.out.println("-------------------------------------");
        System.out.println("Input String: " + input);

        // Create Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("-------------------------------------");
        System.out.println("Program completed.");
    }
}