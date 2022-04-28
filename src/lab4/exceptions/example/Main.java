package lab4.exceptions.example;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

public class Main {
    public static void excMethod(int i) throws IOException
    {
        if(i==1)
            throw new IOException();
    }







    public static int test(){
        try{System.out.println("-1");
            excMethod(1);
           // throw new IOException();
           System.out.println("0");
        } catch(IOException e){
            System.out.println("1");
            return 1;
        }finally {
            System.out.println("2");
            return 2;
        }
    }


    public static void main(String[] args) {
        System.out.println("result= "+test());
    }
}
