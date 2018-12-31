package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */

class static_Ex{
    int x, y, z;
    public static void main(String[] args) {
        System.out.println(multiplyInt(5,4));
        static_Ex unicorn = new static_Ex(5, 4, 7);
        static2(unicorn);
    }

    public static int multiplyInt(int x, int y){
        return x * y;
    }


    public static_Ex(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }




    public static void static2 (static_Ex temp){
        int x = temp.getX();
        int y = temp.getY();

        System.out.println(multiplyInt(x,y));
    }

}
