package lab2.ch3;

public class Cat extends Animal implements Pet{
    private String name;
    public Cat(String name)
    {
        super(4);
        this.name=name;
    }

    public Cat()
    {
        this(" ");
    }
    public void eat()
    {
        System.out.println("Eat method-cat");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Play method-cat");
    }
}
