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
public class Song {
    private int id;
    private String name;
    private String date;
    private int artistID;
    private int albumID;
    private int genreID;
    private String duration;
    private int plays;

    public Song(int id, String name, String date, int artistID, int albumID, int genreID, String duration, int plays) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.artistID = artistID;
        this.albumID = albumID;
        this.genreID = genreID;
        this.duration = duration;
        this.plays = plays;
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

    public int getAlbumID() {
        return albumID;
    }

    public int getGenreID() {
        return genreID;
    }

    public String getDuration() {
        return duration;
    }

    public int getPlays() {
        return plays;
    }
    
}
