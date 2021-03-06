package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int[][] twoDArray = new int[5][5];
        int count = 3;

        for(int i = 0; i<twoDArray.length; i++) {
            for (int x = 0; x < twoDArray[i].length; x++) {
                twoDArray[i][x] = count;
                count += 3;
            }
        }


        for(int i = 0; i<twoDArray.length; i++) {
            for(int x = 0; x < twoDArray[i].length; x++) {
                System.out.print(twoDArray[i][x] + " | ");

            }
            System.out.println();
        }
    }
}
