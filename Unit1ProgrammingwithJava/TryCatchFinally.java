/*
 * Write a program to demonstrate try-catch-finally.
 */
package Unit1ProgrammingwithJava;

public class TryCatchFinally {

    public static void main(String[] args) {
        try {
            // Code that may throw an exception.
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            // Catch the exception and handle it here.
            System.out.println("Cannot divide by zero.");
        } finally {
            // Code that will always be executed, regardless of whether an exception is thrown or not.
            System.out.println("Finally block executed.");
        }
    }
}
