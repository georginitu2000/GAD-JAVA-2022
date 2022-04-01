package lab2.staticex;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex static");
        Bicycle b1= new Bicycle("B1",2);
        System.out.println("nrbic "+ Bicycle.getNrOfBics());
        Bicycle b2= new Bicycle("B2",3);
        System.out.println("nrbic "+ Bicycle.getNrOfBics());
        Bicycle b3= new Bicycle("B3",4);
        System.out.println("nrbic "+ Bicycle.getNrOfBics());
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }
}
