/*
 * 5. Write both procedural and object oriented programs to calculate the area of a
	a) Circle
	b) Square
	c) Rectangle
	d) Sphere

*/
//OOP

package Unit1ProgrammingwithJava;

import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        return Math.pow(sideLength, 2);
    }
}

class Rectanglee {
    private double length;
    private double width;

    public Rectanglee(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

public class OOPAreaCalculator {
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
                double circleRadius = scanner.nextDouble();
                Circle circle = new Circle(circleRadius);
                System.out.println("Area of the circle: " + circle.calculateArea());
                break;
            case 2:
                System.out.print("Enter the side length of the square: ");
                double squareSideLength = scanner.nextDouble();
                Square square = new Square(squareSideLength);
                System.out.println("Area of the square: " + square.calculateArea());
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double rectangleLength = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double rectangleWidth = scanner.nextDouble();
                Rectanglee rectangle = new Rectanglee(rectangleLength, rectangleWidth);
                System.out.println("Area of the rectangle: " + rectangle.calculateArea());
                break;
            case 4:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = scanner.nextDouble();
                Sphere sphere = new Sphere(sphereRadius);
                System.out.println("Surface area of the sphere: " + sphere.calculateSurfaceArea());
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
