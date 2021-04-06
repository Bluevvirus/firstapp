package pl.fejral.firstapp;

import java.util.Scanner;

public class temperatury {
    public static void main(String[] args) {

        System.out.println("temperatura jeden :");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        System.out.println("temperatura dwa :");
        int b= scan.nextInt();
        System.out.println("");
        if (a < 100 || b < 100) {
            System.out.println("Prawda");
        } else {
            System.out.println("falsz");
        }
    }
}

