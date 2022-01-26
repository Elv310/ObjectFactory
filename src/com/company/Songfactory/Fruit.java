package com.company.Songfactory;

import java.util.Scanner;

public class Fruit {

    public String name;
    public String color;
    public boolean hasSeeds;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What fruit is that? ");
        String name = scanner.nextLine();
        System.out.println(" what color is the fruit? ");
        String color = scanner.nextLine();
        System.out.println("does it have seeds? ");
        Boolean hasSeeds = scanner.nextBoolean();
        System.out.println(hasSeeds);


    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", hasSeeds=" + hasSeeds +
                '}';
    }

    public Fruit(String name, String color, boolean hasSeeds) {
        this.name = name;
        this.color = color;
        this.hasSeeds = hasSeeds;
    }
}
