/*
 * 4. Write a program to input principle, time and rate, then calculate simple interest using static methods
 */

package Unit1ProgrammingwithJava;

import java.util.Scanner;

public class CalculateSimpleInterest {

    public static void main(String[] args) {
        // Declare variables to store the principle, time, rate, and simple interest.
        double principle, time, rate, simpleInterest;

        // Get the principle, time, and rate from the user.
        principle = inputNumber("Enter the principle: ");
        time = inputNumber("Enter the time in years: ");
        rate = inputNumber("Enter the rate in percentage: ");

        // Calculate the simple interest.
        simpleInterest = calculateSimpleInterest(principle, time, rate);

        // Print the simple interest to the console.
        System.out.println("The simple interest is: " + simpleInterest);
    }

    /**
     * A static method to calculate the simple interest.
     *
     * @param principle The principle amount.
     * @param time The time in years.
     * @param rate The interest rate in percentage.
     * @return The simple interest.
     */
    private static double calculateSimpleInterest(double principle, double time, double rate) {
        return (principle * time * rate) / 100;
    }

    /**
     * A private method to input a number from the user.
     *
     * @param prompt The prompt to display to the user.
     * @return The number entered by the user.
     */
    private static double inputNumber(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
