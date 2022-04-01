package lab2.ch3;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs)
    {
        this.legs=legs;
    }
    abstract void eat();

    public void walk()
    {
        System.out.println("Animalul merge pe "+this.legs+" picioare");
    }






}
