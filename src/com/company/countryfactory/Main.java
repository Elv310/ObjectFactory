package com.company.countryfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What country are you in?? ");
        String name = scanner.nextLine();
        System.out.println("How many people live there? ");
        Long population = scanner.nextLong();
        System.out.println("it has a capital? ");
        String capital = scanner.nextLine();


        Country country = new Country(name , population , capital);
        System.out.println(country);
    }
}
