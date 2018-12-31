package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        int[][] irreg_array = {
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9}
        };

        for (int i = 0; i < irreg_array.length; i++) {
            for (int z : irreg_array[i]) {
                System.out.println(z);
            }
        }
    }
}
