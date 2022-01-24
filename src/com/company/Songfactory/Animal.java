package com.company.Songfactory;

public class Animal {
    public String species;
    public Short legs;
    public Boolean isTerrestrial;

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
