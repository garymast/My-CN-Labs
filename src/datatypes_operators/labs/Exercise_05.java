package datatypes_operators.labs;
import java.util.Scanner;
/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_05{

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10: ");
        int n = sc.nextInt();

        for(int i = 0; i<array.length; i++) {
            if (n == array[i]) {
                System.out.println(n + " is at index: " + i + " in the array");
            }
        }
        // write code here


    }
}