package pl.fejral.firstapp;

import java.util.Scanner;

public class piramida {
    public static void main(String[] args) {


        int len = 5; //ilość lini
        for(int i=1; i<= len; i++){ //petla tworzy nam linie na ktorych rysowane bedą gwiazdki
            for(int j =0; j < i; j++) //ta pętla natomiast rysuje nam gwiazdki
                System.out.print("*");
            System.out.println();
        }
    }
}
