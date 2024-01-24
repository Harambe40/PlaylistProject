/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author gPierre3 and Harambe40
 * @version 2023-01-18
 */

import java.util.ArrayList;

public class PlaylistTester 
{
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist Bangers = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         * 
         * p.addSong(Under Control, The Strokes, 3:08)
         * p.addSong(3 Peat, Lil Wayne, 3:21)
         * 
         */
        Bangers.add(new Song("3 Peat", "Lil Wayne", "3:20"));
        Bangers.add(new Song(...);
        Bangers.add(new Song(...);
        Bangers.add(new Song(...);
        Bangers.add(new Song(...);
        Bangers.add(new Song(...);
        Bangers.add(new Song(...);

        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        Bangers.displayAllSongs();
        System.out.println;

        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        Bangers.like((Song) Bangers.allSongs().get(1));
        Bangers.like((Song) Bangers.allSongs().get(2));
        Bangers.like((Song) Bangers.allSongs().get(4));

        System.out.println("Printing the songs...\n");
        Bangers.displayAllSongs();

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        System.out.println();
        Bangers.remove((Song) Bangers.allSongs().get(3));

        System.out.println("Printing the songs...\n");
        Bangers.displayAllSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        Bangers.getLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(Bangers.getPlaylistDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        Bangers.trim()

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        Bangers.displayAllSongs();
    }
}
