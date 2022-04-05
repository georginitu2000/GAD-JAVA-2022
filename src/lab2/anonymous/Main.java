package lab2.anonymous;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.drive(new Engine());

        car.drive(new Engine()
        {
            public void drive()
            {
                System.out.println("Drive fast");
            }
        });
    }
}
