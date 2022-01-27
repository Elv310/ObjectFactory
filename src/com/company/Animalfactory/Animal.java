package com.company.Animalfactory;

import java.util.Scanner;

public class Animal {
    public String species;
    public Short legs;
    public Boolean isTerrestrial;





    public Animal(String species, Short legs, Boolean isTerrestrial) {
        this.species = species;
        this.legs = legs;
        this.isTerrestrial = isTerrestrial;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", legs=" + legs +
                ", isTerrestrial=" + isTerrestrial +
                '}';
    }
}
