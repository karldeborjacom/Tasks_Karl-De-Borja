class Point {
    private double x;
    private double y;
   
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    // Method to scale the point closer to (0, 0) by half
    public void scale() {
        x /= 2;  // Scale x-coordinate
        y /= 2;  // Scale y-coordinate
    }
}

public class Tasksheet124 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);  // Initial point at (32, 32)
        for (int i = 0; i < 5; i++) {
            p.scale();  // Scale the point by half
            p.print();  // Print the scaled point
        }
    }
}
