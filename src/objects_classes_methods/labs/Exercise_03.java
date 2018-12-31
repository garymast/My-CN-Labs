package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 * <p>
 * Create at least three example classes (class1, class2, class3) that demonstrate comfort
 * in creating multiple classes with multiple methods, and then call between those methods across classes.
 * These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 * 1) Class1 should have the main method.
 * 2) The main method then needs to create an object of class1, class2, class3.
 * 3) The main method should then  call one or more non-static methods in class2 and class3.
 */

class class1 {

    public static void main(String[] args) {

        class1 c1 = new class1();

        class2 mexico = new class2("Mexico", 129000000, 1973000);
        System.out.println(mexico.retList(mexico));

        class3 Alan = new class3(75, 1.75, "Alan");
        System.out.println(Alan.retBMI(Alan));
    }
}

class class2 {
    String country;
    int population;
    int areaSqKm;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getAreaSqKm() {
        return areaSqKm;
    }

    public void setAreaSqKm(int areaSqKm) {
        this.areaSqKm = areaSqKm;
    }

    public class2(String country, int population, int areaSqKm) {
        this.country = country;
        this.population = population;
        this.areaSqKm = areaSqKm;
    }

    String retList(class2 country) {

        return country.getCountry() + " is a country of " + country.getPopulation() + " people with a land area of " + country.getAreaSqKm() + " square kilometres";
    }
}

class class3 {


    double weight;
    double height;
    String name;


    public class3(double weight, double height, String name) {

        this.weight = weight;
        this.height = height;
        this.name = name;

    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    String retBMI(class3 human){

        double bmi = human.getWeight()/Math.pow(human.getHeight(),2);
        return human.getName() + " has a body mass index of: " + bmi;
    }
}
