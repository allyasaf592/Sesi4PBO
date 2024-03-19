/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author allya saffira
 */

//Overloading

public class Song {
    public void play(String songTitle) {
        System.out.println("Playing song: " + songTitle);
    }

    public void play(String songTitle, String artistName) {
        System.out.println("Playing song: " + songTitle + " by " + artistName);
    }

    public void play(String songTitle, String artistName, int duration) {
        System.out
                .println("Playing song: " + songTitle + " by " + artistName + " (Duration: " + duration + " seconds)");
    }

    public static void main(String[] args) {
        Song song = new Song();

        song.play("Lemonade");
        song.play("Shape of You", "Ed Sheeran");
        song.play("Dance Monkey", "Tones and I", 210);
    }
}