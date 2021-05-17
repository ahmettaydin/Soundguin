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
public class Followers {
    private int userID1;
    private int userID2;

    public Followers(int userID1, int userID2) {
        this.userID1 = userID1;
        this.userID2 = userID2;
    }

    public int getUserID1() {
        return userID1;
    }

    public int getUserID2() {
        return userID2;
    }
}
