public class PalindromeCheckerApp {

    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String input = "refer";

        System.out.println("PalindromeChecker App - Version 1.0");
        System.out.println("-------------------------------------");
        System.out.println("Input String: " + input);

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("-------------------------------------");
        System.out.println("Program completed.");
    }

    public static boolean checkPalindrome(String str, int start, int end) {

        // Base Condition
        if (start >= end) {
            return true;
        }

        // If characters mismatch
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call
        return checkPalindrome(str, start + 1, end - 1);
    }
}