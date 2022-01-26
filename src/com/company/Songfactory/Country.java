package com.company.Songfactory;

import java.util.Scanner;

public class Country {
     public String name;
     public Long population;
     public String capital;


     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("What country are you in?? ");
          String name = scanner.nextLine();
          System.out.println("How many people live there? ");
          Long population = scanner.nextLong();
          System.out.println("what is the capital? ");
          String capital = scanner.nextLine();
          System.out.println(capital);

//          public static Country(String name , Long population, String capital){
//
//          }



     }

     @Override
     public String toString() {
          return "Country{" +
                  "name='" + name + '\'' +
                  ", population=" + population +
                  ", capital='" + capital + '\'' +
                  '}';
     }

     public Country(String name, Long population, String capital) {
          this.name = name;
          this.population = population;
          this.capital = capital;
     }
}
