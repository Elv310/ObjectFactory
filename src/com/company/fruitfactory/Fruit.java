package com.company.fruitfactory;

import java.util.Scanner;

public class Fruit {

    public String name;
    public String color;
    public boolean hasSeeds;



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
