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
public class Payment {
   private String payid;
   private String orderid;
   private String paymenttype;
   private double cost;

    public Payment(String payid, String orderid, String paymenttype, double cost) {
        this.payid = payid;
        this.orderid = orderid;
        this.paymenttype = paymenttype;
        this.cost = cost;
    }

    public Payment() {
    }

    /**
     * @return the payid
     */
    public String getPayid() {
        return payid;
    }

    /**
     * @param payid the payid to set
     */
    public void setPayid(String payid) {
        this.payid = payid;
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
     * @return the paymenttype
     */
    public String getPaymenttype() {
        return paymenttype;
    }

    /**
     * @param paymenttype the paymenttype to set
     */
    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }


    

    
}
