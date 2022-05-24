package Proiect01;

public class Main {
    public static void main(String[] args) {
        TshirtDIY.Builder builder= new TshirtDIY.Builder("T123");
        builder.setSize("S")
                .setType(TshirtTypes.ShortSleeve)
                .setColor("White")
                .setText("Bridesmaid");
        TshirtDIY tee1= builder.build();
        System.out.println(tee1);
        builder.setSize("L")
                .setColor("Black")
                .setText("Groomsman");
        TshirtDIY tee2= builder.build();
        System.out.println(tee2);


    }
}
