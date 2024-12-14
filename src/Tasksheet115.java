public class Tasksheet115 {
    public static void main(String[] args) {
        // Modify variables so that the conditions become true
        String a = "Wow";    // a points to the string literal
        String b = "Wow";    // b points to the string literal, same as a
        String c = new String("Wow"); // c is a new object with same value
        String d = "Wow!";   // d equals b + "!"

        // Check conditions
        boolean b1 = a == b;          // a and b should refer to the same object (true)
        boolean b2 = d.equals(b + "!"); // d equals b + "!" (true)
        boolean b3 = !c.equals(a);     // c is a new object, so it is not equal to a (true)

        if (b1 && b2 && b3) {
            System.out.println("Success!"); // This will print if all conditions are true
        }
    }
}
