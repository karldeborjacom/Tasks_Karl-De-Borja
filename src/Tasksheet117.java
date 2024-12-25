import java.util.Scanner;

public class Tasksheet117 {

    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for three numbers
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        // Compare the three numbers
        if (num1 == num2 && num2 == num3) {
            // If all numbers are equal
            System.out.println("All numbers are equal.");
        } else {
            // Find the largest number
            int largest = num1;  // Assume num1 is the largest

            if (num2 > largest) {
                largest = num2;  // Update largest if num2 is greater
            }

            if (num3 > largest) {
                largest = num3;  // Update largest if num3 is greater
            }

            // Output the largest number
            System.out.println("The largest number is: " + largest);
        }

        // Close the scanner
        scanner.close();
    }
}
