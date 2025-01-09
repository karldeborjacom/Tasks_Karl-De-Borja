abstract class abstractClass {
    // Abstract method, must be implemented by subclasses
    abstract void abstractMethod();

    // Concrete method
    void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
}

class B extends abstractClass {
    // Implementing the abstract method in class B
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

class C extends abstractClass {
    // Implementing the abstract method in class C
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class Tasksheet126 {
    public static void main(String args[]) {
        // Creating an instance of class B
        B b = new B();
        b.abstractMethod();  // B's implementation
        b.concreteMethod();  // Concrete method from abstractClass

        // Creating an instance of class C
        C c = new C();
        c.abstractMethod();  // C's implementation
        c.concreteMethod();  // Concrete method from abstractClass
    }
}
