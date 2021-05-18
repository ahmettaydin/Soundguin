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
public class Album {
    private int id;
    private String name;
    private String date;
    private int artistID;
    private int genreID;

    public Album(int id, String name, String date, int artistID, int genreID) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.artistID = artistID;
        this.genreID = genreID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getArtistID() {
        return artistID;
    }

    public int getGenreID() {
        return genreID;
    }
    
    
}
