/*
 * 
 * 3. Write a program to input and add two numbers using static methods (procedural programming).
 * 
 * A static method is a method that belongs to a class rather than an instance of a class. This means that a static method
 * can be called without creating an instance of the class.
 * 
 * Static methods are often used to implement utility functions that are not specific to any particular instance of a class.
 * For example, a static method could be used to calculate the square root of a number, or to convert a string to uppercase.
 * 
 * Procedural programming is a programming paradigm that focuses on breaking down a program into a sequence of steps, or procedures.
 * Each procedure performs a specific task and returns a result.
 * 
 * Procedural programming languages, such as C and Java, provide features for defining and calling procedures. 
 * For example, in Java, procedures are defined using the method keyword.
 * 
 * Static methods can be used in procedural programming to implement utility functions that can be used by any part of the program.
 * For example, a static method could be used to calculate the length of a string, or to print a message to the console.
 * 
 */

package Unit1ProgrammingwithJava;

import java.util.Scanner;

public class static_method_procedural {

    /**
     * A static method to input a number from the user.
     *
     * @param prompt The prompt to display to the user.
     * @return The number entered by the user.
     */
    private static int inputNumber(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * A static method to add two numbers.
     *
     * @param num1 The first number to add.
     * @param num2 The second number to add.
     * @return The sum of the two numbers.
     */
    private static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Declare two variables to store the two numbers.
        int num1, num2;

        // Get the first number from the user.
        num1 = inputNumber("Enter the first number: ");

        // Get the second number from the user.
        num2 = inputNumber("Enter the second number: ");

        // Add the two numbers and store the sum in a variable.
        int sum = addNumbers(num1, num2);

        // Print the sum of the two numbers to the console.
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}

