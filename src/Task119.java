import static java.lang.Math.*;

public class Task119 { //Tasksheet121

    // Method for addition using Math.addExact
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Method for subtraction using Math.subtractExact
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Method for multiplication using Math.multiplyExact
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Method for division using Math.floorDiv (integer division)
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        // Demonstrating the math operations with example values

        int num1 = 10;
        int num2 = 5;

        // Performing addition
        int additionResult = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + additionResult);

        // Performing subtraction
        int subtractionResult = subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + subtractionResult);

        // Performing multiplication
        int multiplicationResult = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + multiplicationResult);

        // Performing division
        try {
            int divisionResult = divide(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + divisionResult);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Additional example with negative numbers
        num1 = -15;
        num2 = 4;

        // Performing operations with negative numbers
        System.out.println("\nAdditional operations with negative numbers:");
        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
        try {
            System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
