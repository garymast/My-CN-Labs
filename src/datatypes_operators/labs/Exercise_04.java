package datatypes_operators.labs;
import java.util.Scanner;
/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_04{

    public static void main(String[] args) {

        int[] numArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int i=0; i<10; i++) {
            System.out.print("Enter a whole number: ");
            numArray[i] = scanner.nextInt();
        }

        for(int z: numArray) {
            sum += z;
        }

        System.out.println("The sum of the entered numbers is: " + sum);
        System.out.println("The average of the entered numbers is: " + ((double)sum)/10);

    }


}