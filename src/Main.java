import java.util.LinkedList;

/**
 * ======================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ======================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This demonstrates how LinkedList supports double-ended
 * operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 */

public class Main {

    /**
     * Application entry point for UC8.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to the list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}