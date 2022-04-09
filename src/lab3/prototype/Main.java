package lab3.prototype;

public class Main {
    public static void main(String[] args) {
        Leash leash=new Leash("red",3);
        Dog dog=new Dog("Rex",leash);
        dog.setAge(7);
        try {
            System.out.println(dog);
            Dog dog2=dog.clone();
            dog2.getLeash().setColor("brown");
            dog2.getLeash().setSize(4);
            System.out.println(dog);
            System.out.println(dog2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
