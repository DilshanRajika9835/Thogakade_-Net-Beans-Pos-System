/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.Supermarket.controller;

import java.sql.Connection;
import ik.ijse.Supermarket.db.DBConnection;
import ik.ijse.Supermarket.model.MonthlyIncome;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DilshanRajika
 */
public class MonthlyIncomeController {
   public static ArrayList<MonthlyIncome> findMonthlyIncome() throws ClassNotFoundException, SQLException{
       Connection connection = DBConnection.getinstance().getconnection();
       PreparedStatement stm=connection.prepareStatement("select  year(orderDate)as 'Year',monthname(orderDate)as'MonthName',sum(orderdetail.orderQty*item.unitprice)as income from orders,orderdetail,item,customer \n" +
"where orders.orderID=orderdetail.orderID&&item.itemcode=orderdetail.itemcode&&customer.custid=orders.custid  group by year(orderDate),monthname(orderDate) order by year(orderDate) asc;");
   ResultSet rst=stm.executeQuery();
   ArrayList monthlyincome=new ArrayList();
   while(rst.next()){
   MonthlyIncome income=new MonthlyIncome(rst.getString("Year"),rst.getString("MonthName"),rst.getDouble("Income"));
   monthlyincome.add(income);
   
   }
   return monthlyincome;
   } 
}
