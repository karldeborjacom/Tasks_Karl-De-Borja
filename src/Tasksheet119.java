import java.util.Scanner;

public class Tasksheet119 {

    // Methods for the four operations
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return (b != 0) ? a / b : Double.NaN; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Perform and print operations
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + (num2 != 0 ? divide(num1, num2) : "undefined"));

        scanner.close();
    }
}
