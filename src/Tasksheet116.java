import java.util.Scanner;

public class Tasksheet116 {

    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.println("Enter a string to check if it's a palindrome:");
        String inputString = scanner.nextLine();

        // Use StringBuilder to reverse the input string
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString.reverse();

        // Check if the original string is equal to the reversed string
        if (inputString.equals(reversedString.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}
