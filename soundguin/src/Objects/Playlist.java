/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author ahmet
 */
public class Playlist {
    private int userID;
    private int songID;

    public Playlist(int userID, int songID) {
        this.userID = userID;
        this.songID = songID;
    }

    public int getUserID() {
        return userID;
    }

    public int getSongID() {
        return songID;
    }
    
    
}
