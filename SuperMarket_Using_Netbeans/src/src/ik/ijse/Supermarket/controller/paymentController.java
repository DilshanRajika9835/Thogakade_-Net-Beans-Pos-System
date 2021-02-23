/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.Supermarket.controller;

import java.sql.Connection;
import ik.ijse.Supermarket.db.DBConnection;
import ik.ijse.Supermarket.model.Payment;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DilshanRajika
 */
public class paymentController {
  public static boolean Addpayment(Payment payment) throws ClassNotFoundException, SQLException{
      Connection connection = DBConnection.getinstance ().getconnection(); 
      PreparedStatement stm=connection.prepareStatement("insert into payment values(?,?,?,?)");
      stm.setObject(1,payment.getPayid());
      stm.setObject(2,payment.getOrderid());
      stm.setObject(3,payment.getPaymenttype());
      stm.setObject(4,payment.getCost());
      return  stm.executeUpdate()>0;
  
  }  
  public static String  getPayID() throws ClassNotFoundException, SQLException{
     java.sql.Connection con= DBConnection.getinstance().getconnection();
        Statement stm=con.createStatement();
        ResultSet srt=stm.executeQuery("select payid from payment order by payid  desc limit 1");
        String payid="P01";
        if(srt.next()){
            payid=srt.getString(1);
            payid=payid.split("[A-Z]")[1];
            payid="P0"+(Integer.parseInt(payid)+1);
        }
    return  payid;
  
  
  }
}
