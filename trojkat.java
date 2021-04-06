package pl.fejral.firstapp;

import java.util.Scanner;

public class trojkat {
    public static void main(String[] args) {
        System.out.println("bok a :");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        System.out.println("bok b :");
        int b= scan.nextInt();
        System.out.println("");
        System.out.println("bok c :");
        int c= scan.nextInt();
        boolean prostokatny = false;
        String odpowiedz;
        if(a*a + b*b == c*c){

            odpowiedz ="jest prostokatny";
        }
        else{
            odpowiedz = "nie jest prostokatny";
        }
        System.out.println("Trojkat abc " +odpowiedz);

    }
}
