public class Tasksheet114 {
    public static void main(String[] args) {
        // Initialize the check_number variable
        int check_number = 10;

        // Loop through numbers from 1 to check_number
        for (int i = 1; i <= check_number; i++) {
            // Using ternary operator to check even or odd
            String message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";

            // Print the message
            System.out.println(message);
        }
    }
}
