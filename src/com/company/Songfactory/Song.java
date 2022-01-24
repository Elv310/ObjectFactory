package com.company.Songfactory;

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

    public Song(String title, String artist, String genre, int seconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }
}
