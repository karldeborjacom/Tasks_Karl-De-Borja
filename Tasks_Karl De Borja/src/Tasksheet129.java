// Animal Interface
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// Gorilla Class implementing Animal interface
class Gorilla implements Animal {

    // Feed method with comment for putting food in cage
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Putting gorilla food into cage...");
            return true;  // Gorilla is fed
        } else {
            System.out.println("Gorilla is not hungry right now.");
            return false;  // Gorilla is not hungry
        }
    }

    // Groom method with the "lather, rinse, repeat" comment
    @Override
    public void groom() {
        System.out.println("Grooming the gorilla...");  // Start grooming process
        System.out.println("lather, rinse, repeat");
    }

    // Pet method with the "pet at your own risk" comment
    @Override
    public void pet() {
        System.out.println("Petting the gorilla...");  // Begin petting
        System.out.println("pet at your own risk");  // Risky action!
    }
}

// Main class to test the Gorilla class
public class Main {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        // Test feeding
        gorilla.feed(true);  // Feed the gorilla
        gorilla.feed(false); // Try feeding when it's not hungry
        
        // Test grooming
        gorilla.groom();
        
        // Test petting
        gorilla.pet();
    }
}

