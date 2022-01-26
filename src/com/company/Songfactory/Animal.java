package com.company.Songfactory;

import java.util.Scanner;

public class Animal {
    public String species;
    public Short legs;
    public Boolean isTerrestrial;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What species is it? ");
        String species = scanner.nextLine();
        System.out.println(" how many legs? ");
        Short legs = scanner.nextShort();
        System.out.println(" is it Terrestrial?");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", legs=" + legs +
                ", isTerrestrial=" + isTerrestrial +
                '}';
    }

    public Animal(String species, Short legs, Boolean isTerrestrial) {
        this.species = species;
        this.legs = legs;
        this.isTerrestrial = isTerrestrial;
    }
}
