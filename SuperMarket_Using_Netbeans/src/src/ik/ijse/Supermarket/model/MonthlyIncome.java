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
public class MonthlyIncome {
    private String Year;
    private String Monthname;
    private double Income;

    public MonthlyIncome(String Year, String Monthname, double Income) {
        this.Year = Year;
        this.Monthname = Monthname;
        this.Income = Income;
    }

    public MonthlyIncome() {
    }

    /**
     * @return the Year
     */
    public String getYear() {
        return Year;
    }

    /**
     * @param Year the Year to set
     */
    public void setYear(String Year) {
        this.Year = Year;
    }

    /**
     * @return the Monthname
     */
    public String getMonthname() {
        return Monthname;
    }

    /**
     * @param Monthname the Monthname to set
     */
    public void setMonthname(String Monthname) {
        this.Monthname = Monthname;
    }

    /**
     * @return the Income
     */
    public double getIncome() {
        return Income;
    }

    /**
     * @param Income the Income to set
     */
    public void setIncome(double Income) {
        this.Income = Income;
    }
}
