/*
 * 8. Write a program to demonstrate inheritance.
 * 
 * Inheritance is a powerful feature in Java that allows you to reuse code and create hierarchies of classes. 
 * A class that inherits from another class is called a subclass. The class that is inherited from is called a superclass.
 * To inherit from a class, you use the extends keyword. For example, the following code shows how to create a subclass 
 * called Dog that inherits from the Animal class:
 * 
 * public class Dog extends Animal {
    // ...
	}

 * When a subclass inherits from a superclass, it inherits all of the public and protected fields and methods of the superclass.
 * The subclass can also override the methods of the superclass.
 */

package Unit1ProgrammingwithJava;

//Base class (superclass)
class Animal {
 String name;
 
 // Constructor
 public Animal(String name) {
     this.name = name;
 }

 // Method to make a sound
 public void makeSound() {
     System.out.println(name + " makes a sound.");
 }
}

//Subclass inheriting from Animal
class Dog extends Animal {
 // Constructor
 public Dog(String name) {
     super(name); // Call the superclass constructor
 }

 // Override the makeSound method to provide a specific implementation for Dog
 @Override
 public void makeSound() {
     System.out.println(name + " barks.");
 }

 // New method specific to Dog
 public void wagTail() {
     System.out.println(name + " wags its tail.");
 }
}

public class InheritanceDemo {
 public static void main(String[] args) {
     // Create an instance of the Animal class
     Animal genericAnimal = new Animal("Generic Animal");
     genericAnimal.makeSound(); // Calls the makeSound method of the Animal class

     // Create an instance of the Dog class
     Dog myDog = new Dog("Buddy");
     myDog.makeSound(); // Calls the overridden makeSound method of the Dog class
     myDog.wagTail(); // Calls the specific method of the Dog class
 }
}
