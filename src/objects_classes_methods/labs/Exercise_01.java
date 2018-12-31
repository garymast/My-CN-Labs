package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

class run {
    public static void main(String[] args) {

Alcohol whiskey = new Alcohol(40, "Clear", "Ireland");
Beer heineken = new Beer(true, true, false);

        System.out.println(whiskey.toString());
        System.out.println(heineken.toString());

    }
}

class Alcohol{

    int percentage;
    String colour;
    String origin;

    //public Alcohol(int percentage, String colour, String origin){
       // this.percentage = percentage;
       // this.colour = colour;
       // this.origin = origin;


    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Alcohol(int percentage, String colour, String origin) {
        this.percentage = percentage;
        this.colour = colour;
        this.origin = origin;
    }

        @Override
    public String toString() {
        return "Alcohol{" +
                "percentage=" + percentage +
                ", colour='" + colour + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}

class Beer {

    Boolean malty;
    Boolean hoppy;
    Boolean carbonated;

    public Boolean getMalty() {
        return malty;
    }

    public void setMalty(Boolean malty) {
        this.malty = malty;
    }

    public Boolean getHoppy() {
        return hoppy;
    }

    public void setHoppy(Boolean hoppy) {
        this.hoppy = hoppy;
    }

    public Boolean getCarbonated() {
        return carbonated;
    }

    public void setCarbonated(Boolean carbonated) {
        this.carbonated = carbonated;
    }

    public Beer(boolean carbonated, Boolean hoppy, Boolean malty) {
        this.carbonated = carbonated;
        this.hoppy = hoppy;
        this.malty = malty;

    }

    @Override
    public String toString() {
        return "Beer{" +
                "malty=" + malty +
                ", hoppy=" + hoppy +
                ", carbonated=" + carbonated +
                '}';
    }
}



