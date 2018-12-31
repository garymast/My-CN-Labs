package conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        int i = 0;
        char c;
        boolean tf;

        while(i < word.length()) {
            c = word.charAt(i);
            tf = chkVal(c);
            if (tf) {
                System.out.println("Word: " +word);
                System.out.println("First vowel: " + c);
                break;
            }

            i++;

            if (i == word.length())  {
                System.out.println("No vowel present in: " + word);
            }
        }
    }

    static boolean chkVal(char c) {
        boolean ret;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u') {
            ret = true;
        } else {
            ret = false;
        }
        return ret;
    }
}
