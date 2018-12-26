package fundamentals.labs;
import java.lang.Math.*;
/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        double h, r, volume, SurfArea;

        r = 3.14;
        h = 5;

        SurfArea = 2*Math.PI*r*h + 2*Math.PI*r*r;
        volume = Math.PI*r*r*h;
        System.out.println("Surface Area = " + SurfArea);
        System.out.println("Volume = " + volume);

    }
}
