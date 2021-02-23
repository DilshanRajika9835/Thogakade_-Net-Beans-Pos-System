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
public class OrderDetail {
  private  String orderid;
  private String itemcode;
  private int orderqty;
  private double descount;

    public OrderDetail(String orderid, String itemcode, int orderqty, double descount) {
        this.orderid = orderid;
        this.itemcode = itemcode;
        this.orderqty = orderqty;
        this.descount = descount;
    }

    public OrderDetail() {
    }

    /**
     * @return the orderid
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * @param orderid the orderid to set
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
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
     * @return the orderqty
     */
    public int getOrderqty() {
        return orderqty;
    }

    /**
     * @param orderqty the orderqty to set
     */
    public void setOrderqty(int orderqty) {
        this.orderqty = orderqty;
    }

    /**
     * @return the descount
     */
    public double getDescount() {
        return descount;
    }

    /**
     * @param descount the descount to set
     */
    public void setDescount(double descount) {
        this.descount = descount;
    }
}
