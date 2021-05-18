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
    PreparedStatement preparedStatement = null;

    public Admin() {
        try {
            connection = helper.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User getUser(int id) {
        User user = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from users where id=" + id);
            while (resultSet.next()) {
                user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("sname"),
                        resultSet.getString("email"),
                        resultSet.getString("password"),
                        resultSet.getInt("subscription"),
                        resultSet.getString("country")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    public Song getSong(int id) {
        Song song = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from songs where id =" + id);
            while (resultSet.next()) {
                song = new Song(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("date"),
                        resultSet.getInt("artistID"),
                        resultSet.getInt("albumID"),
                        resultSet.getInt("genreID"),
                        resultSet.getString("duration"),
                        resultSet.getInt("plays")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return song;
    }

    public Album getAlbum(int id) {
        Album album = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from albums where id=" + id);
            while (resultSet.next()) {
                album = new Album(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("date"),
                        resultSet.getInt("artistID"),
                        resultSet.getInt("genreID")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return album;
    }

    public Artist getArtist(int id) {
        Artist artist = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from artists where id=" + id);
            while (resultSet.next()) {
                artist = new Artist(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("sname"),
                        resultSet.getString("country")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return artist;
    }

    public SubsType getSubsType(int id) {
        SubsType subsType = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from substype where id =" + id);
            while (resultSet.next()) {
                subsType = new SubsType(
                        resultSet.getInt("id"),
                        resultSet.getString("type"),
                        resultSet.getInt("paid")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return subsType;
    }

    public SongGenre getGenre(int id) {
        SongGenre genre = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from genres where id=" + id);
            while (resultSet.next()) {
                genre = new SongGenre(
                        resultSet.getInt("id"),
                        resultSet.getString("name")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return genre;
    }

    public ArrayList<User> getUserList() {
        ArrayList<User> users = new ArrayList<User>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()) {
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

    public ArrayList<User> getFollowList(int id) {
        ArrayList<User> users = new ArrayList<User>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from users where id in (select userID2 from follow where userID1 =" + id + ")");
            while (resultSet.next()) {
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
            while (resultSet.next()) {
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
            while (resultSet.next()) {
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

    public ArrayList<Song> getPopList(int id) {
        ArrayList<Song> pops = new ArrayList<Song>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from songs where id in (select songID from pop where userID=" + id + ")");
            while (resultSet.next()) {
                pops.add(new Song(
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

        return pops;
    }

    public ArrayList<Song> getJazzList(int id) {
        ArrayList<Song> jazzes = new ArrayList<Song>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from songs where id in (select songID from jazz where userID=" + id + ")");
            while (resultSet.next()) {
                jazzes.add(new Song(
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

        return jazzes;
    }

    public ArrayList<Song> getClassicList(int id) {
        ArrayList<Song> classics = new ArrayList<Song>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from songs where id in (select songID from classic where userID=" + id + ")");
            while (resultSet.next()) {
                classics.add(new Song(
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

        return classics;
    }

    public ArrayList<Album> getAlbumList() {
        ArrayList<Album> albums = new ArrayList<Album>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from albums");
            while (resultSet.next()) {
                albums.add(new Album(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("date"),
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
            while (resultSet.next()) {
                subsTypes.add(new SubsType(
                        resultSet.getInt("id"),
                        resultSet.getString("type"),
                        resultSet.getInt("paid")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return subsTypes;
    }

    public ArrayList<SongGenre> getGenreList() {
        ArrayList<SongGenre> genres = new ArrayList<SongGenre>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from genres");
            while (resultSet.next()) {
                genres.add(new SongGenre(
                        resultSet.getInt("id"),
                        resultSet.getString("name")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return genres;
    }
    
    public ArrayList<Playlist> getAdminPopList() {
        ArrayList<Playlist> pops = new ArrayList<Playlist>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from pop");
            while (resultSet.next()) {
                pops.add(new Playlist(
                        resultSet.getInt("userID"),
                        resultSet.getInt("songID")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pops;
    }
    
    public ArrayList<Playlist> getAdminJazzList() {
        ArrayList<Playlist> jazzes = new ArrayList<Playlist>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from jazz");
            while (resultSet.next()) {
                jazzes.add(new Playlist(
                        resultSet.getInt("userID"),
                        resultSet.getInt("songID")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return jazzes;
    }
    
    public ArrayList<Playlist> getAdminClassicList() {
        ArrayList<Playlist> classics = new ArrayList<Playlist>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from classic");
            while (resultSet.next()) {
                classics.add(new Playlist(
                        resultSet.getInt("userID"),
                        resultSet.getInt("songID")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return classics;
    }
    
    public ArrayList<Song> getTop10List(String country) {
        ArrayList<Song> songs = new ArrayList<Song>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from songs where artistID in (select id from artists where country='"+country+"') order by plays desc");
            while (resultSet.next()) {
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
    
    public ArrayList<Song> getTop10PopList() {
        ArrayList<Song> songs = new ArrayList<Song>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from songs where genreID = 1 order by plays desc");
            while (resultSet.next()) {
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
    
    public ArrayList<Song> getTop10JazzList() {
        ArrayList<Song> songs = new ArrayList<Song>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from songs where genreID = 2 order by plays desc");
            while (resultSet.next()) {
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
    
    public ArrayList<Song> getTop10ClassicList() {
        ArrayList<Song> songs = new ArrayList<Song>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from songs where genreID = 3 order by plays desc");
            while (resultSet.next()) {
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
    
    public ArrayList<Song> getTop10AllList() {
        ArrayList<Song> songs = new ArrayList<Song>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from songs order by plays desc");
            while (resultSet.next()) {
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
    
    public ArrayList<Followers> getAdminFollowList() {
        ArrayList<Followers> followers = new ArrayList<Followers>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from follow");
            while (resultSet.next()) {
                followers.add(new Followers(
                        resultSet.getInt("userID1"),
                        resultSet.getInt("userID2")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return followers;
    }
 
    public boolean insertUser(String name, String sname, String email, String password, int subs, String country) {
        String query = "insert into users (name, sname, email, password, subscription, country) values(?,?,?,?,?,?)";
        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, sname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            preparedStatement.setInt(5, subs);
            preparedStatement.setString(6, country);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean updateUser(int id, String name, String sname, String email, String password, int subs, String country) {
        String query = "update users set name=?, sname=?, email=?, password=?, subscription=?, country=? where id=?";
        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, sname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            preparedStatement.setInt(5, subs);
            preparedStatement.setString(6, country);
            preparedStatement.setInt(7, id);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean deleteUser(int id) {
        String query = "delete from users where id =" + id;
        int key = 0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }

    }

    public boolean insertArtist(String name, String sname, String country) {
        String query = "insert into artists (name, sname, country) values(?,?,?)";
        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, sname);
            preparedStatement.setString(3, country);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean updateArtist(int id, String name, String sname, String country) {
        String query = "update artists set name = ?, sname = ?, country = ? where id = ?";
        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, sname);
            preparedStatement.setString(3, country);
            preparedStatement.setInt(4, id);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean deleteArtist(int id) {
        String query = "delete from artists where id =" + id;
        int key = 0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }

    }

    public boolean insertSong(String name, String date, int artist, int album, int genre, String duration, int plays) {
        String query = "insert into songs (name, date, artistID, albumID, genreID, duration, plays) values(?,?,?,?,?,?,?)";
        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, date);
            preparedStatement.setInt(3, artist);
            preparedStatement.setInt(4, album);
            preparedStatement.setInt(5, genre);
            preparedStatement.setString(6, duration);
            preparedStatement.setInt(7, plays);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean updateSong(int id, String name, String date, int artist, int album, int genre, String duration, int plays) {
        String query = "update songs set name=?, date=?, artistID=?, albumID=?, genreID=?, duration=?, plays=? where id=?";
        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, date);
            preparedStatement.setInt(3, artist);
            preparedStatement.setInt(4, album);
            preparedStatement.setInt(5, genre);
            preparedStatement.setString(6, duration);
            preparedStatement.setInt(7, plays);
            preparedStatement.setInt(8, id);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean deleteSong(int id) {
        String query = "delete from songs where id =" + id;
        int key = 0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }

    }

    public boolean insertAlbum(String name, String date, int artist, int genre) {
        String query = "insert into albums (name, date, artistID, genreID) values(?,?,?,?)";
        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, date);
            preparedStatement.setInt(3, artist);
            preparedStatement.setInt(4, genre);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean updateAlbum(int id, String name, String date, int artist, int genre) {
        String query = "update albums set name = ?, date = ?, artistID = ?, genreID  = ? where id = ?";
        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, date);
            preparedStatement.setInt(3, artist);
            preparedStatement.setInt(4, genre);
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean deleteAlbum(int id) {
        String query = "delete from albums where id =" + id;
        int key = 0;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }

    }

    public boolean insertFollow(int id1, int id2) {
        String query = "insert into follow (userID1, userID2) values(?,?)";

        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id1);
            preparedStatement.setInt(2, id2);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }
    
    public boolean deleteFollow(int id1, int id2) {
        String query = "delete from follow where userID1 = ? and userID2 = ?";

        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id1);
            preparedStatement.setInt(2, id2);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean insertPop(int id1, int id2) {
        String query = "insert into pop (userID, songID) values(?,?)";

        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id1);
            preparedStatement.setInt(2, id2);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }
    
    public boolean deletePop(int id1, int id2) {
        String query = "delete from pop where userID = ? and songID = ?";

        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id1);
            preparedStatement.setInt(2, id2);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean insertJazz(int id1, int id2) {
        String query = "insert into jazz (userID, songID) values(?,?)";

        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id1);
            preparedStatement.setInt(2, id2);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }
    
    public boolean deleteJazz(int id1, int id2) {
        String query = "delete from jazz where userID = ? and songID = ?";

        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id1);
            preparedStatement.setInt(2, id2);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean insertClassic(int id1, int id2) {
        String query = "insert into classic (userID, songID) values(?,?)";

        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id1);
            preparedStatement.setInt(2, id2);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }
    
    public boolean deleteClassic(int id1, int id2) {
        String query = "delete from classic where userID = ? and songID = ?";

        int key = 0;
        try {
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id1);
            preparedStatement.setInt(2, id2);
            preparedStatement.executeUpdate();
            key = 1;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean insertAllPop(int id1, int id2) {
        ArrayList<Song> pop1 = getPopList(id1);
        ArrayList<Song> pop2 = getPopList(id2);

        String query = "insert into pop (userID, songID) values(?,?)";

        int key = 0;
        for (int i = 0; i < pop2.size(); i++) {
            int key2 = 0;
            for (int j = 0; j < pop1.size(); j++) {
                if (pop2.get(i).getId() != pop1.get(j).getId()) {
                    key2 = 1;
                }
            }
            if (key2 == 0) {
                try {
                    statement = connection.createStatement();
                    preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setInt(1, id1);
                    preparedStatement.setInt(2, pop2.get(i).getId());
                    preparedStatement.executeUpdate();
                    key = 1;
                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean insertAllJazz(int id1, int id2) {
        ArrayList<Song> jazz1 = getJazzList(id1);
        ArrayList<Song> jazz2 = getJazzList(id2);

        String query = "insert into jazz (userID, songID) values(?,?)";

        int key = 0;
        for (int i = 0; i < jazz2.size(); i++) {
            int key2 = 0;
            for (int j = 0; j < jazz1.size(); j++) {
                if (jazz2.get(i).getId() != jazz1.get(j).getId()) {
                    key2 = 1;
                }
            }
            if (key2 == 0) {
                try {
                    statement = connection.createStatement();
                    preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setInt(1, id1);
                    preparedStatement.setInt(2, jazz2.get(i).getId());
                    preparedStatement.executeUpdate();
                    key = 1;
                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

    public boolean insertAllClassic(int id1, int id2) {
        ArrayList<Song> classic1 = getClassicList(id1);
        ArrayList<Song> classic2 = getClassicList(id2);

        String query = "insert into classic (userID, songID) values(?,?)";

        int key = 0;
        for (int i = 0; i < classic2.size(); i++) {
            int key2 = 0;
            for (int j = 0; j < classic1.size(); j++) {
                if (classic2.get(i).getId() == classic1.get(j).getId()) {
                    key2 = 1;
                }
            }
            if (key2 == 0) {
                try {
                    statement = connection.createStatement();
                    preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setInt(1, id1);
                    preparedStatement.setInt(2, classic2.get(i).getId());
                    preparedStatement.executeUpdate();
                    key = 1;
                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (key == 1) {
            JOptionPane.showMessageDialog(null, "Başarılı");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Başarısız");
            return false;
        }
    }

}
