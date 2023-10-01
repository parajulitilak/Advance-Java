/*
 * 7. Write a program to demonstrate encapsulation.
 * 
 * Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP) that involves wrapping
 * the data (attributes or fields) and methods (functions) that operate on the data into a single unit known as a class.
 * 
 *  In Java, encapsulation is achieved by using private access modifiers for fields and providing public methods 
 *  (getters and setters) to access and modify those fields. 
 *  
 *  In this program:

We define a Student class with private fields (name and age) to represent a student's information.

We provide getter methods (getName() and getAge()) to access the private fields.

We provide setter methods (setName() and setAge()) to modify the private fields.

These methods enforce data encapsulation by allowing controlled access to the fields and performing validation 
(e.g., checking for non-negative age).

When you run the EncapsulationDemo class, it demonstrates how to create a Student object, access and modify its private fields
using getter and setter methods while encapsulating the data and ensuring proper validation.
 */

package Unit1ProgrammingwithJava;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student = new Student("John Doe", 20);

        // Access and modify the student's properties using getter and setter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        student.setName("Alice Smith");
        student.setAge(22);

        System.out.println("Updated Student Name: " + student.getName());
        System.out.println("Updated Student Age: " + student.getAge());
    }
}

class Student {
    // Private fields (encapsulated)
    private String name;
    private int age;

    // Constructor to initialize the fields
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to access the name field (encapsulation)
    public String getName() {
        return name;
    }

    // Setter method to modify the name field (encapsulation)
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to access the age field (encapsulation)
    public int getAge() {
        return age;
    }

    // Setter method to modify the age field (encapsulation)
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}
