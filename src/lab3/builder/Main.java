package lab3.builder;

public class Main {
    public static void main(String[] args) {
    Helicopter.Builder builder=new Helicopter.Builder("H123");
    builder.setColor("Red");
    builder.setMaxHeight(22);
    builder.setMaxSpeed(33)
            .setType(HelicopterTypes.ATTACK)
            .setWeight(34);
    Helicopter hel=builder.build();
        System.out.println(hel);
        builder.setWeight(88);
        Helicopter hel2=builder.build();
        System.out.println(hel2);


    }
}
