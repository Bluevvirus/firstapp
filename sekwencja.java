package pl.fejral.firstapp;

import java.util.Scanner;

public class sekwencja {
    public static void main(String[] args){

        Scanner tablica = new Scanner(System.in);
        System.out.println("Podaj 6 licz");


        int licz1 = tablica.nextInt();
        int licz2 = tablica.nextInt();
        int licz3 = tablica.nextInt();
        int licz4 = tablica.nextInt();
        int licz5 = tablica.nextInt();
        int licz6 = tablica.nextInt();


        if (licz1 == 1){
            if (licz2 == 2){
                if (licz3 == 3){
                    System.out.println("Sekwencja jest w liczbach jeden, dwa i trzy");
                }
            }
        } else if (licz2 == 1){
            if (licz3 == 2){
                if (licz4 == 3){
                    System.out.println("Sekwencja jest w liczbach dwa, trzy i cztery");
                }
            }
        } else if (licz3 == 1){
            if (licz4 == 2){
                if (licz5 == 3){
                    System.out.println("Sekwencja jest w liczbach trzy, cztery i pięć");
                }
            }
        } else if (licz4 == 1){
            if (licz5 == 2){

                if (licz6 == 3){
                    System.out.println("Sekwencja jest w liczbach cztery, pięć i sześć");
                }
            }
        } else if (licz1 != 1 || licz2 != 1 || licz3 != 1 || licz4 != 1){
            System.out.println("Brak Sekwencji");
        }

    }
}
