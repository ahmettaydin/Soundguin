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
public class Artist {
    private int id;
    private String name;
    private String sname;
    private String country;

    public Artist(int id, String name, String sname, String country) {
        this.id = id;
        this.name = name;
        this.sname = sname;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSname() {
        return sname;
    }

    public String getCountry() {
        return country;
    }

    

    
}
