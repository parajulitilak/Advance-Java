/*
 * 9. Write a program to demonstrate polymorphism using interface as parent.
 * */

package Unit1ProgrammingwithJava;

// Define an interface
interface Shapes {
    void draw(); // A method for drawing a shape
}

// Implement the interface in two classes
class Circlee implements Shapes {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Squaree implements Shapes {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}

public class polymorphism_using_interface_as_parents {
    public static void main(String[] args) {
        // Create instances of Shape objects
        Shapes shape1 = new Circlee();
        Shapes shape2 = new Squaree();

        // Demonstrate polymorphism by calling the draw method on each shape
        shape1.draw();
        shape2.draw();
    }
}
