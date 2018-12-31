package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */

class methodOver {

    public static void main(String[] args) {

        System.out.println(multiplies(2,4));
        System.out.println(multiplies(2,4, 6));
        System.out.println(multiplies(2,4, 6, 8.1));


    }

    static double multiplies(double a, double b){
        return a*b;
    }

    static double multiplies(double a, double b, double c){
        return a*b*c;
    }

    static double multiplies(double a, double b, double c, double d){
        return a*b*c*d;
    }
}

