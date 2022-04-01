package lab2.ch3;

public class Fish extends Animal implements Pet{
    private String name;
    public Fish()
    {
        super(0);
    }

    @Override
    public void walk() {
        super.walk();
    }

    public void eat()
    {
        System.out.println("Eat method-fish");
    }

    @Override
    public void play() {
        System.out.println("Play method-fish");
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

}
