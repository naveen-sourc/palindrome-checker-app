import java.util.Scanner;

/*
================================================
MAIN CLASS - UseCase12PalindromeCheckerApp
================================================

Use Case 12: Strategy Pattern for Palindrome Algorithms
*/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}

/*
================================================
INTERFACE - PalindromeStrategy
================================================
*/

interface PalindromeStrategy {

    boolean check(String input);
}

/*
================================================
CLASS - StackStrategy
================================================
*/

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters onto stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}