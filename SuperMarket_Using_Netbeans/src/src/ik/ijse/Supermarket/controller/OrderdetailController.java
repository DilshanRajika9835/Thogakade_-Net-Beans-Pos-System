/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.Supermarket.controller;

import java.sql.Connection;
import ik.ijse.Supermarket.db.DBConnection;
import ik.ijse.Supermarket.model.OrderDetail;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DilshanRajika
 */
public class OrderdetailController {
   public static boolean  AddOrderDetail(ArrayList<OrderDetail>orderlist) throws ClassNotFoundException, SQLException{
       for (OrderDetail orderDetail : orderlist) {
           boolean isadded=AddOrderDetail(orderDetail);
           if(! isadded){
               return false;
           }
       }
            return  true;
   }
   public static boolean AddOrderDetail(OrderDetail orderDetail) throws ClassNotFoundException, SQLException{
       Connection connection = DBConnection.getinstance().getconnection();
       PreparedStatement stm=connection.prepareStatement("insert into orderdetail values(?,?,?,?)");
       stm.setObject(1,orderDetail.getOrderid());
       stm.setObject(2,orderDetail.getItemcode());
       stm.setObject(3,orderDetail.getOrderqty());
       stm.setObject(4,orderDetail.getDescount());
       return stm.executeUpdate()>0;
   }
}
