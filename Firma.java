package pl.fejral.firstapp;

import java.util.Scanner;

public class Firma {
   public static void main(String[] args) {
      Worker user0 = new Worker();
      Worker user1 = new Worker();

      user0.fname = "Jacek";
      user0.lname = "Stasic";
      user0.age = 56;

      user1.fname = "Jakub";
      user1.lname = "Podlaski";
      user1.age = 35;


      System.out.println("Jaiego pracownika pokazac?");
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();

      if (a == 1) { //pracownik 1
         System.out.println("*imię: " + user0.fname);
         System.out.println("*nazwisko: " + user0.lname);
         System.out.println("*Wiek: " + user0.age);
      }
      if (a == 2) { //pracownik 2
         System.out.println("*imię: " + user1.fname);
         System.out.println("*nazwisko: " + user1.lname);
         System.out.println("*Wiek: " + user1.age);
      } if(a == 3) {  //wszyscy pracownicy
         System.out.println("*imię: " + user0.fname);
         System.out.println("*nazwisko: " + user0.lname);
         System.out.println("*Wiek: " + user0.age);
         System.out.println("**********************************");
         System.out.println("*imię: " + user1.fname);
         System.out.println("*nazwisko: " + user1.lname);
         System.out.println("*Wiek: " + user1.age);

      }
   }
}

