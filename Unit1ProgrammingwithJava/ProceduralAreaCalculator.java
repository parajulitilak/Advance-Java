/*
 * 5. Write both procedural and object oriented programs to calculate the area of a
	a) Circle
	b) Square
	c) Rectangle
	d) Sphere

*/
//procedural
package Unit1ProgrammingwithJava;

import java.util.Scanner;

public class ProceduralAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Sphere");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = calculateCircleArea(radius);
                System.out.println("Area of the circle: " + circleArea);
                break;
            case 2:
                System.out.print("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();
                double squareArea = calculateSquareArea(sideLength);
                System.out.println("Area of the square: " + squareArea);
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = calculateRectangleArea(length, width);
                System.out.println("Area of the rectangle: " + rectangleArea);
                break;
            case 4:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = scanner.nextDouble();
                double sphereArea = calculateSphereArea(sphereRadius);
                System.out.println("Surface area of the sphere: " + sphereArea);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateSquareArea(double sideLength) {
        return Math.pow(sideLength, 2);
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateSphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

