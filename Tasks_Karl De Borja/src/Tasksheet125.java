// Base class: Vehicle
class Vehicle
    protected String make;
    protected String model;
    protected int year;

    // Constructor to initialize the attributes
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

// Derived class: Car that extends Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor to initialize the attributes, including the inherited ones
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);  // Calling the constructor of the base class
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display the car's details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Car class and set values for its attributes
        Car car = new Car("Toyota", "Corolla", 2020, 4);

        // Call the displayDetails method to print the car's details
        car.displayDetails();
    }
}
