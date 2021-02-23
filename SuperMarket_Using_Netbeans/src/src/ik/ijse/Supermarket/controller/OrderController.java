/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.Supermarket.controller;

import java.sql.PreparedStatement;
import ik.ijse.Supermarket.db.DBConnection;
import ik.ijse.Supermarket.model.Order;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author DilshanRajika
 */
public class OrderController {
    public static String  CreateOrderID() throws ClassNotFoundException, SQLException{
       Connection con= DBConnection.getinstance().getconnection();
        Statement stm=con.createStatement();
        ResultSet srt=stm.executeQuery("select orderid from orders order by orderid  desc limit 1");
        String orderid="D001";
        if(srt.next()){
            orderid=srt.getString(1);
            orderid=orderid.split("[A-Z]")[1];
            orderid="D00"+(Integer.parseInt(orderid)+1);
        }
    return  orderid;
    }
    public static boolean placeOrder(Order order) throws ClassNotFoundException, SQLException{
       Connection connection = DBConnection.getinstance().getconnection();
         boolean detaileadded=false;
        try{ 
        
        connection.setAutoCommit(false);
      PreparedStatement stm=(PreparedStatement) connection.prepareStatement("Insert into orders values(?,?,?)");
        stm.setObject(1, order.getOrderid());
        stm.setObject(2, order.getOrderdate());
        stm.setObject(3, order.getCustid());
        boolean added=stm.executeUpdate()>0;
        if(added){
           boolean ispayed=paymentController.Addpayment(order.getPayment());
           if(ispayed){
           detaileadded=OrderdetailController.AddOrderDetail(order.getOrderdetailslist());
           }
        if(detaileadded){
            boolean updated=ItemController.UpdateStock(order.getOrderdetailslist());
            if(updated){
            connection.commit();
            return true;
            }
        }
        }
       connection.rollback();
       return  false;
       }finally{
       connection.setAutoCommit(true);
       }
    }
}
