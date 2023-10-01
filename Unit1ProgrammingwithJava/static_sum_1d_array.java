/*
 * 6. Write a static method to calculate the sum of a one dimensional array
*/

package Unit1ProgrammingwithJava;

public class static_sum_1d_array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.print("initial array : {" + " ");
        
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        System.out.println(" }");
        
        
        
        int sum = calculateSum(numbers);
        System.out.println("\n\nSum of the array: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}