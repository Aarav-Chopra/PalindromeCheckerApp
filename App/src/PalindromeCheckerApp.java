/*
 * Application Name : PalindromeChecker App
 * Version          : 1.0
 * Use Case 13      : Performance Comparison
 */

import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: String Reverse
    public static boolean reverseMethod(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        return input.equals(reversed);
    }

    // Method 2: Stack Method
    public static boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Two Pointer Method
    public static boolean twoPointerMethod(String input) {

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

    public static void main(String[] args) {

        String input = "racecar";

        System.out.println("PalindromeChecker App - Version 1.0");
        System.out.println("-------------------------------------");
        System.out.println("Input String: " + input);

        // Reverse Method Timing
        long startTime = System.nanoTime();
        boolean r1 = reverseMethod(input);
        long endTime = System.nanoTime();
        System.out.println("Reverse Method Result: " + r1);
        System.out.println("Execution Time: " + (endTime - startTime) + " ns");

        System.out.println();

        // Stack Method Timing
        startTime = System.nanoTime();
        boolean r2 = stackMethod(input);
        endTime = System.nanoTime();
        System.out.println("Stack Method Result: " + r2);
        System.out.println("Execution Time: " + (endTime - startTime) + " ns");

        System.out.println();

        // Two Pointer Method Timing
        startTime = System.nanoTime();
        boolean r3 = twoPointerMethod(input);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Method Result: " + r3);
        System.out.println("Execution Time: " + (endTime - startTime) + " ns");

        System.out.println("-------------------------------------");
        System.out.println("Performance comparison completed.");
    }
}