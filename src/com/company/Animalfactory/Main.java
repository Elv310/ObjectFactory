package com.company.Animalfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What species is it? ");
        String species = scanner.nextLine();
        System.out.println("how many legs? ");
        short legs = scanner.nextShort();
        System.out.println("It's Terrestrial?");
        boolean livesOnLand = scanner.nextBoolean();

        Animal animal = new Animal(species , legs, livesOnLand);
        System.out.println(animal);
    }
}
