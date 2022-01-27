package com.company.Songfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats the title? ");
        String title = scanner.nextLine();
        System.out.println("Name of Artist? ");
        String artist = scanner.nextLine();
        System.out.println("What genre? ");
        String genre = scanner.nextLine();
        System.out.println("How long is it in seconds? ");
        Integer seconds = scanner.nextInt();


        Song song = new Song(title , artist , genre , seconds);
        System.out.println(song);
    }
}
