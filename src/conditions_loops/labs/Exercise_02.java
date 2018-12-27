package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner sc = new Scanner(System.in);
        // prompt user
        System.out.println("Enter a number between 1 and 7: ");
        // assign input to variable as int
        int num = sc.nextInt();
        String day;

        if (num == 1) {
            day = "Monday";
        } else if (num == 2) {
            day = "Tuesday";
        } else if (num == 3) {
            day = "Wednesday";
        } else if (num == 4) {
            day = "Thursday";
        } else if (num == 5) {
            day = "Friday";
        } else if (num == 6) {
            day = "Saturday";
        } else if (num == 7) {
            day = "Sunday";
        } else {
            day = "Other";
        }

        System.out.println(day);
        // write completed code here

    }
}
