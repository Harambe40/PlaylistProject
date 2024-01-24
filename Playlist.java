import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;
    private int duration;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist()
    {    
        playlist = new ArrayList<Song>(); 
    }

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

    /**
    * the 'add' method adds a new song to the playlist
    * @param newSong the song to be added
    */
    public void add(Song newSong)
    {
        playlist.add(newSong);
    }

    public void add(String title, String artist, String duration)
    {
        playlist.add(new Song(title, artist, duration));
    }

    public void like(Song likeSong)
    {
        likeSong.like();
    }

    public void remove(Song exSong)
    {
        playlist.remove(exSong);
    }
    public ArrayList<Song> allSongs()
    {
        return playlist;
    }

    public void displayAllSongs()
    {
        for (Song song : playlist)
        {
            System.out.println("'" + song.getName() + "'" + " by " + song.getArtist() + 
            " (" + song.getTime() + ")");
        }
    }

    public ArrayList<Song> getLikedSongs()
    {
        ArrayList<Song> likedPlaylist = new ArrayList<Song>();
        for (int i = 0; i < playlist.size(); i++)
            {
                if (playlist.get(i).isLiked() == true)
                {
                    likedPlaylist.add(playlist.get(i));
                }
            }
        return likedPlaylist;
    }

    public void getPlaylistDuration()
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            duration += playlist.get(i).getDurationInSeconds();
        }
        int mins = duration / 60;
        int secs = duration - (mins * 60);
        String time = (mins + ":" + secs);
        return time;
    }
    public void trim()
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).isLiked() == false)
            {
                playlist.remove(i);
            }
        }
    }
}
