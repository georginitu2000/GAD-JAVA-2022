package lab3.factory;

public class NYpizzaStore extends PizzaStore {
    protected Pizza createPizza(String type)
    {
        switch(type)
        {
            case "Cheese": return new NYstyleCheesePizza();
            case "Pepperoni": return new NYstylePepperoniPizza();
            default: return null;
        }

    }
}
