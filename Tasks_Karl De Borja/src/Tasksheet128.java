
// Step 1: Define the Shape interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Step 2: Define the AbstractShape class implementing the Shape interface
abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    // Constructor to initialize attributes
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Methods inherited from Shape interface, but abstract so they can be implemented in concrete classes
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Step 3: Implement the Circle class extending AbstractShape
class Circle extends AbstractShape {
    private double radius;

    // Constructor to initialize the attributes for Circle
    public Circle(String color, double radius) {
        super(color, 0, 0);  // Circle does not need length and width
        this.radius = radius;
    }

    // Implement the calculateArea method for Circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement the calculatePerimeter method for Circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Step 4: Implement the Rectangle class extending AbstractShape
class Rectangle extends AbstractShape {

    // Constructor to initialize the attributes for Rectangle
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    // Implement the calculateArea method for Rectangle
    public double calculateArea() {
        return length * width;
    }

    // Implement the calculatePerimeter method for Rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Step 5: Main class to create instances and display the results
public class Main {
    public static void main(String[] args) {
        // Create a Circle instance
        Circle circle = new Circle("Red", 5);
        System.out.println("Circle - Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Create a Rectangle instance
        Rectangle rectangle = new Rectangle("Blue", 4, 6);
        System.out.println("\nRectangle - Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
