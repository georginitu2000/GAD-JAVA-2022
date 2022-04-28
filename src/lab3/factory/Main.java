package lab3.factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore myPizzaStore=new NYpizzaStore();
        Pizza myCheesePizza=myPizzaStore.orderPizza("Cheese");
        Pizza myPepPizza=myPizzaStore.orderPizza("Pepperoni");

    }

}
