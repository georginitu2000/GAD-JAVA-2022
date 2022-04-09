package lab3.ch6;

public class Main {
    public static void main(String[] args) {
    Person p1=new Person.Builder("Ana").setJob("doctor").setUniversity("medicine").setMarried(false).build();
    System.out.println(p1);


       /* Person.Builder builder=new Person.Builder("Anne");
        builder.setJob("Doctor")
                .setUniversity("UMFCD")
                .setDrivingLicense(true)
                .setMarried(false);
        Person p1= builder.build();
        System.out.println(p1); */
    }
}
