package lab6.ch4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>(Arrays.asList(4,3,7,8,6,2,1));

        for(int i = 0; i < lista.size(); i++) {
            for(int j = i+1; j < lista.size(); j++) {
                if(i % 2 == 0) {
                    if (lista.get(i) > lista.get(j)) {
                        Collections.swap(lista, i, j);
                    }
                }else{
                    if (lista.get(i) < lista.get(j)) {

                        Collections.swap(lista,i, j);
                    }
                }
                break;
            }
        }
        System.out.println(lista);
    }
}
