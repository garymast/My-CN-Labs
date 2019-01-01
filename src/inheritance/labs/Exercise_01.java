package inheritance.labs;

/**
 * Inheritance Exercise 1:
 *
 *      1) Create one super class Class1 and two subclasses Class2 and Class3.
 *          -Class2 should extend Class1.
 *          -Class3 should extend Class2.
 *      2) Each class should have at least two instance variable, all private.
 *      3) Create getters and setters for all instance variables and demonstrate setting superclass
 *          variables from a subclass
 *      4) Demonstrate the use of (non getter and setter) methods in a superclass from a subclass.
 *      5) Add constructors to each class and demonstrate the use of a superclass constructor
 *          from a subclass.
 *      6) Demonstrate constructor overloading and the use of the "super" keyword.
 *      7) Demonstrate method overloading.
 *
 *      NOTE: We encourage you to be creative and try to think of an example of your own for this
 *       exercise but if you are stuck, some ideas include:
 *
 *       - A Vehicle superclass, with Truck and Motorcycle subclasses.
 *       - A Restaurant superclass, with Gourmet and FastFood subclasses.
 *
 *
 */

class Animals{
private double weight;
private int age;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animals(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public void move() {
        System.out.println("Animals use a variety of different methods to move");
    }
}


class Mammals extends Animals{
private String species;
private String hairColour;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public Mammals(double weight, int age, String species, String hairColour) {
        super(weight, age);
        this.species = species;
        this.hairColour = hairColour;
    }

    public void allMammals() {
        System.out.println("All mammals drink milk as babies");

    }
    }


class Human extends Mammals{
private String nationality;
private String name;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(double weight, int age, String species, String hairColour, String nationality, String name) {
        super(weight, age, species, hairColour);
        this.nationality = nationality;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Humans typically use their legs to walk around");
    }

    public static void main(String[] args) {
        Human gary = new Human(75, 30, "Human", "brown", "Irish", "Gary");
        gary.move();
        System.out.println(gary.getAge());

        gary.setNationality("American");
        System.out.println(gary.getNationality());

        gary.allMammals();
    }

}

