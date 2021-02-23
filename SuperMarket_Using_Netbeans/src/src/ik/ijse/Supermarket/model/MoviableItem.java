/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.Supermarket.model;

/**
 *
 * @author DilshanRajika
 */
public class MoviableItem {
 private String itemcode;
 private String description;
 private int salse;

    public MoviableItem(String itemcode, String description, int salse) {
        this.itemcode = itemcode;
        this.description = description;
        this.salse = salse;
    }

    public MoviableItem() {
    }

    /**
     * @return the itemcode
     */
    public String getItemcode() {
        return itemcode;
    }

    /**
     * @param itemcode the itemcode to set
     */
    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the salse
     */
    public int getSalse() {
        return salse;
    }

    /**
     * @param salse the salse to set
     */
    public void setSalse(int salse) {
        this.salse = salse;
    }

   
}
