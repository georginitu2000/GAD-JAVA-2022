package lab2.staticex;

public class Bicycle {
    private static int nrOfBics=0;
    private String name;
    private int size;
    public Bicycle(String name, int size)
    {
        this.name=name;
        this.size=size;
        nrOfBics++;
    }

    public static int getNrOfBics() {
        return nrOfBics;
    }

    public String toString()
    {
        return "Bicycle named " + name + "of size " + size;
    }
}
