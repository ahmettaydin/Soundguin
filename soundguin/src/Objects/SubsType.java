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
public class SubsType {
    private int id;
    private String name;
    private int isPaid;

    public SubsType(int id, String name, int isPaid) {
        this.id = id;
        this.name = name;
        this.isPaid = isPaid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public int getIsPaid() {
        return isPaid;
    }
}
