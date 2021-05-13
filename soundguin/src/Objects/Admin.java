/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Database.DbHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmet
 */
public class Admin {
    
    DbHelper helper = new DbHelper();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet;
    
    public Admin() {
        try {
            connection = helper.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<User> getUserList() {
        ArrayList<User> users = new ArrayList<User>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from users");
            while(resultSet.next()) {
                users.add(new User(
                        resultSet.getInt("id"), 
                        resultSet.getString("name"), 
                        resultSet.getString("sname"), 
                        resultSet.getString("email"),
                        resultSet.getString("password"),
                        resultSet.getInt("subscription"),
                        resultSet.getString("country")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        return users;
    }
    
    public ArrayList<Artist> getArtistList() {
        ArrayList<Artist> artists = new ArrayList<Artist>();
        
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from artists");
            while(resultSet.next()) {
                artists.add(new Artist(
                        resultSet.getInt("id"), 
                        resultSet.getString("name"),
                        resultSet.getString("sname"),
                        resultSet.getString("country")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return artists;
    }
    
    public ArrayList<Song> getSongList() {
        ArrayList<Song> songs = new ArrayList<Song>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from songs");
            while(resultSet.next()) {
                songs.add(new Song(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("date"),
                        resultSet.getInt("artistID"),
                        resultSet.getInt("albumID"),
                        resultSet.getInt("genreID"),
                        resultSet.getString("duration"),
                        resultSet.getInt("plays")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return songs;
    }
    
    public ArrayList<Album> getAlbumList() {
        ArrayList<Album> albums = new ArrayList<Album>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from albums");
            while(resultSet.next()) {
                albums.add(new Album(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("date"),
                        resultSet.getInt("songID"),
                        resultSet.getInt("artistID"),
                        resultSet.getInt("genreID")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return albums;
    }
    
    public ArrayList<SubsType> getSubsTypeList() {
        ArrayList<SubsType> subsTypes = new ArrayList<SubsType>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from substype");
            while(resultSet.next()) {
                subsTypes.add(new SubsType(
                        resultSet.getInt("id"), 
                        resultSet.getString("type")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return subsTypes;
    }
    
    public boolean insertUser(String name, String sname, String email, String password, String subs, String country) {
        String query = "insert into users (name, sname, email, password, subscription, country) "
                + "values('"+name+"','"+sname+"','"+email+"','"+password+"','"+subs+"','"+country+"')";
        int key=0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key = 1;  
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(key==1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }
    
    public boolean deleteUser(int id) {
        String query = "delete from users where id ="+id; 
        int key = 0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key=1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        if(key==1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
        
    }
    
    public boolean insertArtist(String name, String sname, String country) {
        String query = "insert into artists (name, sname, country) "
                + "values('"+name+"','"+sname+"','"+country+"')";
        int key=0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key = 1;  
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(key==1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }
    
    public boolean deleteArtist(int id) {
        String query = "delete from artists where id ="+id; 
        int key = 0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key=1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        if(key==1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
        
    }
    
    public boolean insertSong(String name, String date, String artist, String album, String genre, String duration, String plays) {
        String query = "insert into songs (name, date, artistID, albumID, genreID, duration, plays) "
                + "values('"+name+"','"+date+"','"+artist+"','"+album+"','"+genre+"','"+duration+"','"+plays+"')";
        int key=0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key = 1;  
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(key==1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }
    
    public boolean deleteSong(int id) {
        String query = "delete from songs where id ="+id; 
        int key = 0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key=1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        if(key==1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
        
    }
    
    public boolean insertAlbum(String name, String date, String artist, String song, String genre) {
        String query = "insert into albums (name, date, artistID, songID, genreID) "
                + "values('"+name+"','"+date+"','"+artist+"','"+song+"','"+genre+"')";
        int key=0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key = 1;  
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(key==1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }
    
    public boolean deleteAlbum(int id) {
        String query = "delete from albums where id ="+id; 
        int key = 0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key=1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        if(key==1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
        
    }
    
}
