package com.company.Songfactory;

import java.util.Scanner;

public class Song {
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", seconds=" + seconds +
                '}';
    }

    public String title;
        public String artist;
        public String genre;
        public int seconds;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats the title? ");
        String title = scanner.nextLine();
        System.out.println("What kind of Artist? ");
        String artist = scanner.nextLine();
        System.out.println(" What genre? ");
        String genre = scanner.nextLine();
        System.out.println(" How long is it? ");
        Integer seconds = scanner.nextInt();

    }

    public Song(String title, String artist, String genre, int seconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }
}
