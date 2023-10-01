package Unit1ProgrammingwithJava;
import java.util.Scanner;

// Define a Shape interface with methods for area and perimeter calculation
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Create an abstract class Shape2D that implements the Shape interface
abstract class Shape2D implements Shape {
    // Common fields for 2D shapes
    protected double length;
    protected double width;

    // Constructor for 2D shapes
    public Shape2D(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

// Define a Rectangle class that extends Shape2D
class Rectangle extends Shape2D {
    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        super(length, width);
    }

    // Implement area calculation for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implement perimeter calculation for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class OOPRectangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the rectangle:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(length, width);

        // Calculate and display area and perimeter
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());

        scanner.close();
    }
}
/*
 * the keywords and concepts used in the provided Java program:

1. `package`: It's used to organize classes into packages or namespaces. In this case, the 
	package `Unit1ProgrammingwithJava` contains the program's classes.

2. `import`: It's used to include other Java classes or packages in your program. In this program,
 	`import java.util.Scanner;` is used to import the Scanner class for user input.

3. `interface`: An interface defines a contract for classes. It contains method declarations 
	(without method bodies) that any class implementing the interface must provide. In this program,
	 the `Shape` interface defines `calculateArea()` and `calculatePerimeter()` methods that any shape
	 must implement.

4. `abstract class`: An abstract class is a class that cannot be instantiated on its own but can be
 	used as a base for other classes. It may contain abstract methods (methods without implementations)
  	that derived classes must implement. In this program, `Shape2D` is an abstract class that implements
  	the `Shape` interface and provides common fields and constructor for 2D shapes.

5. `implements`: It's used to indicate that a class is implementing an interface. Classes implementing
 an interface must provide implementations for all methods declared in the interface. In this program,
  `Shape2D` implements the `Shape` interface, which means it must provide implementations for `calculateArea()`
   and `calculatePerimeter()`.

6. `extends`: It's used to establish an inheritance relationship between classes. A class that extends
 	another class (called a superclass) inherits its fields and methods. In this program, the `Rectangle`
  	class extends `Shape2D`, which means it inherits the fields and methods of `Shape2D` and must provide
   	its own implementations for `calculateArea()` and `calculatePerimeter()`.

7. `super`: It's used to call a superclass constructor or method from a subclass. In the `Rectangle`
	class constructor, `super(length, width);` is used to call the constructor of the superclass (`Shape2D`)
 	and initialize the inherited fields.

8. `this`: It's a reference to the current instance of a class. In the constructor of `Shape2D`, 
	`this.length` and `this.width` are used to access and set the fields of the current instance 
	based on constructor parameters.

9. `public`: An access modifier that specifies the visibility of a class, field, or method. `public`
 	means that the class, field, or method can be accessed from anywhere.

10. `private`: An access modifier that specifies that a field or method can only be accessed within
 	the same class. In this program, `length` and `width` in `Shape2D` are declared as `protected`,
 	 which allows subclasses like `Rectangle` to access them.

11. `@Override`: An annotation used to indicate that a method in a subclass is intended to override a
 	method in its superclass. This helps ensure that you are correctly overriding a method from an interface
 	 or superclass.

12. `System.out.println()`: Used to print output to the console.

*/
