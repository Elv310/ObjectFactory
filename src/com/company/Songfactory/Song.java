package com.company.Songfactory;

import java.util.Scanner;

public class Song {


    public String title;
        public String artist;
        public String genre;
        public int seconds;



    public Song(String title, String artist, String genre, int seconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }



    @Override
    public String toString() {
        return
                "title:" + title +
                ", artist:" + artist +
                ", genre :" + genre +
                ", seconds: " + seconds +
                '}';
    }
}
