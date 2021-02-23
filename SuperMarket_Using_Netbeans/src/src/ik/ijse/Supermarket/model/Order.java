/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.Supermarket.model;

import java.util.ArrayList;

/**
 *
 * @author DilshanRajika
 */
public class Order { 
private String orderid;
private String orderdate;
private String custid;
private String ordertime;
private ArrayList<OrderDetail>orderdetailslist;
private Payment payment;

    public Order(String orderid, String orderdate, String custid, String ordertime, ArrayList<OrderDetail> orderdetailslist, Payment payment) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.custid = custid;
        this.ordertime = ordertime;
        this.orderdetailslist = orderdetailslist;
        this.payment = payment;
    }

    public Order() {
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
     * @return the orderdate
     */
    public String getOrderdate() {
        return orderdate;
    }

    /**
     * @param orderdate the orderdate to set
     */
    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    /**
     * @return the custid
     */
    public String getCustid() {
        return custid;
    }

    /**
     * @param custid the custid to set
     */
    public void setCustid(String custid) {
        this.custid = custid;
    }

    /**
     * @return the ordertime
     */
    public String getOrdertime() {
        return ordertime;
    }

    /**
     * @param ordertime the ordertime to set
     */
    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * @return the orderdetailslist
     */
    public ArrayList<OrderDetail> getOrderdetailslist() {
        return orderdetailslist;
    }

    /**
     * @param orderdetailslist the orderdetailslist to set
     */
    public void setOrderdetailslist(ArrayList<OrderDetail> orderdetailslist) {
        this.orderdetailslist = orderdetailslist;
    }

    /**
     * @return the payment
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    

   
}
