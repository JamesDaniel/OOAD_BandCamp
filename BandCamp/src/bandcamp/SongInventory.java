/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandcamp;

import java.util.List;
import java.util.Set;

/**
 *
 * @author SoftwareDev
 */
public class SongInventory {
    private List<Song> Songs;
    
    public SongInventory(){
        
    }
    public void addSong(String title, Member member, Set<Genre> genre)
    {
        // int id = this.getNewId();
        // need code to add a song to inventory list
    }
    public Song getSong(int id)
    {
        // need code to get a song from inventory list
        return null;
    }
    public Song SearchForSong(String title, Genre genre)
    {
        // need code to search for and return a song from inventory list
        return null;
    }
    public int getNewId(){
        // need code to get the new id for a new song
        return 0;
    }
}
