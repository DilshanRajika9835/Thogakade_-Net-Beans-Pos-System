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
public class DailyIncome {
  private String orderdate;
  private String ordertime;
  private double income;

    public DailyIncome(String orderdate, String ordertime, double income) {
        this.orderdate = orderdate;
        this.ordertime = ordertime;
        this.income = income;
    }

    public DailyIncome() {
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
     * @return the income
     */
    public double getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(double income) {
        this.income = income;
    }

}
