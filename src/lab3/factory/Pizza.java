package lab3.factory;

public abstract class Pizza {


public void bake(){
    System.out.println("Bake for 25 min at 350");
}

public void cut()
{
    System.out.println("Cut pizza");
}

    public void box()
    {
        System.out.println("place pizza in a box");
    }
}
