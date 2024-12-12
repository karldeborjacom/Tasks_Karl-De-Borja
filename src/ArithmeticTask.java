public class ArithmeticTask {
    public static void main(String[] args) {
        // Initializing the variable 'result' with the sum of 1 and 2
        int result = 1 + 2; // result is now 3
        System.out.println(result);

        // Subtracting 1 from 'result'
        result = result - 1; // result is now 2
        System.out.println(result);

        // Multiplying 'result' by 2
        result = result * 2; // result is now 4
        System.out.println(result);

        // Dividing 'result' by 2
        result = result / 2; // result is now 2
        System.out.println(result);

        // Adding 8 to 'result' and then finding the remainder when divided by 7
        result = result + 8; // result is now 10
        result = result % 7; // result is now 3
        System.out.println(result);
    }
}
