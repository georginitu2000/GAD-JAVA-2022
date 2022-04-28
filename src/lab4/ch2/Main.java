package lab4.ch2;

import java.io.*;
import java.util.Scanner;


public class Main {

    private static void afisare(String word) {
        for (char c : word.toCharArray())
            if (Character.isUpperCase(c)) {
                if (c != 'X')
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
    }
    public static void main(String[] args) {
        Scanner s=null;
        try{
            s= new Scanner(new BufferedReader(new FileReader("src/lab4/ch2/input.txt")));
            while(s.hasNext()){
                afisare(s.next());
            }
        }catch(IOException ex){

        }finally{
            if(s!=null)
                s.close();
        }
    }
}
