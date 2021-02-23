/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.Supermarket.controller;

import java.sql.Connection;
import ik.ijse.Supermarket.db.DBConnection;
import ik.ijse.Supermarket.model.DailyIncome;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DilshanRajika
 */
public class DailyIncomeController {
    public static ArrayList<DailyIncome> findDailyIncome() throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getinstance().getconnection();
        PreparedStatement stm=connection.prepareStatement("select distinct orderDate,ordertime,sum(orderQty*unitprice)as income from item,orders,orderdetail,customer\n" +
" where orders.orderID=orderdetail.orderID&&item.itemcode=orderdetail.itemcode&&customer.custid=orders.custid group by date(orderDate) asc;");
        ResultSet srt=stm.executeQuery();
        ArrayList dailyincome=new ArrayList();
        while(srt.next()){
        DailyIncome income=new DailyIncome(srt.getString("orderdate"),srt.getString("ordertime"),srt.getDouble("income"));
        dailyincome.add(income);
        }
        return dailyincome;
    }
}
