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
public class User {
    private int id;
    private String name;
    private String sname;
    private String email;
    private String password;
    private int subscription;
    private String country;

    public User() {
        
    }
    
    public User(int id, String name, String sname, String email, String password, int subscription, String country) {
        this.id = id;
        this.name = name;
        this.sname = sname;
        this.email = email;
        this.password = password;
        this.subscription = subscription;
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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getSubscription() {
        return subscription;
    }

    public String getCountry() {
        return country;
    }
    
}
