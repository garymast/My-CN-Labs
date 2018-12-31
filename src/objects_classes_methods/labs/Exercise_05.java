package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

class controller {
    public static void main(String[] args) {
        dog fido = new dog("fido", "terrier", 12);
        System.out.println(dog.numRun);
        dog max = new dog("max", "collie", 1);
        dog bandit = new dog("bandit", "bulldog", 3);
        System.out.println(dog.numRun);

    }
}

class dog {
    static int numRun;

    String name;
    String Breed;
    int age;

    public dog(String name, String breed, int age) {
        this.name = name;
        Breed = breed;
        this.age = age;

        numRun++;
    }

}