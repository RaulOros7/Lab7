package com.company;
import java.util.ArrayList;

public class Studenti {
    public static void main (String args[]){
        ArrayList<String> studenti = new ArrayList<String>();
        studenti.add ("Calculatoare");
        studenti.add ("AIA");
        studenti.add ("TI");
        System.out.println(studenti);
        for (int i = 0; i < studenti.size(); i++) {
            System.out.println(studenti.get(i));
        }
    }
}
