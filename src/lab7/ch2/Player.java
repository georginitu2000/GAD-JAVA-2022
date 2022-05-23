package lab7.ch2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Player extends Thread {
    private String nume;
    private String opt;
    private ArrayList<String> opts = new ArrayList<>(Arrays.asList("rock","paper","scissors"));

    public Player(String nume) {
        this.nume = nume;
    }


    @Override
    public void run() {
        opt = opts.get(new Random().nextInt(2));
    }

    @Override
    public String toString() {
        return "Player{" +
                "nume='" + nume + '\'' +
                ", opt='" + opt + '\'' +
                '}';
    }

    public String getOpt() {
        return opt;
    }
}