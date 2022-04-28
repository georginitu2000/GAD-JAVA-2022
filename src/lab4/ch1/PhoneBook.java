package lab4.ch1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneBook {
    Contact[] contacts=new Contact[5000];
    int count=0;
    public PhoneBook(String inputFile){
        Scanner s=null;
        String name;
        String number;
        try{
            s=new Scanner(new BufferedReader(new FileReader(inputFile)));
            while(s.hasNext())
            {
                name=s.next();
                number=s.next();
                contacts[count++]=new Contact(name,number);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(s!=null) s.close();
        }

    }
    public String toString() {
        String toReturn = "";

        for(int i=0;i<count;i++){
            toReturn += "\n"+contacts[i];
        }

        return toReturn;
    }

    public String getNumberByName(String name){
        for(int i=0;i<count;i++){
            if(contacts[i].getName().equals(name)){
                return contacts[i].getPhoneNumber();
            }
        }
        return null;
    }

}
