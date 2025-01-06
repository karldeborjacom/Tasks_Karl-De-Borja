public class Tasksheet120 {

    public static void main(String[] args) {
        // Example test case with integer arguments
        System.out.println("Total Sum and Cumulative Sums:");
        int[] numbers = {4, 5, 10};
        int totalSum = sumAndCumulative(numbers);
        System.out.println("Total sum of all parameters: " + totalSum);
    }

    // Method that takes variable arguments and returns the total sum
    public static int sumAndCumulative(int... nums) {
        int totalSum = 0;

        // Loop through each parameter in the nums array
        for (int num : nums) {
            int cumulativeSum = 0;

            // Calculate the cumulative sum for each parameter
            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }

            // Print the cumulative sum for the current parameter
            System.out.println("Cumulative sum for " + num + " = " + cumulativeSum);

            // Add the cumulative sum to the total sum
            totalSum += cumulativeSum;
        }

        return totalSum;
    }
}
