package com.company.fruitfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What fruit is that? ");
        String name = scanner.nextLine();
        System.out.println(" what color is the fruit? ");
        String color = scanner.nextLine();
        System.out.println(" it has seeds? ");
        Boolean hasSeeds = scanner.nextBoolean();

        Fruit fruit = new Fruit(name, color, hasSeeds);
        System.out.println(fruit);
    }
}
