/*
 * 1.An array is called balanced if its even number elements (a[0],a[2]) etc are even and
 *  its odd number elements (a[1],a[3]) are odd. Write a function named balanced that accepts an
 *  array of integer which returns 1. If the array is balanced return 0 otherwise.
 */
package Unit1ProgrammingwithJava;
import java.util.Scanner;

public class BalancedArray {

    public static int balanced(int[] arr) {
    	
        for (int i = 0; i < arr.length; i++) {
        	
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                return 0;
                
            } else if (i % 2 != 0 && arr[i] % 2 == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int isBalanced = balanced(arr);

        if (isBalanced == 1) {
            System.out.println("The array is balanced.");
        } else {
            System.out.println("The array is not balanced.");
        }

        scanner.close();
    }
}
