/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.Supermarket.controller;

import java.sql.Connection;
import ik.ijse.Supermarket.db.DBConnection;
import ik.ijse.Supermarket.model.MoviableItem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DilshanRajika
 */
public class MostMoviableItemController {
   public static ArrayList<MoviableItem> findmostmoviableitem() throws ClassNotFoundException, SQLException{
       Connection connection = DBConnection.getinstance().getconnection();
       PreparedStatement stm=connection.prepareStatement("select distinct i.itemCode,i.description,count(o.orderid)as Salse from Item i,orders o,orderdetail d where d.itemCode=i.itemCode&&o.orderid=d.orderid group by i.itemCode order by Salse desc");
       ResultSet rst=stm.executeQuery();
       ArrayList mosList=new ArrayList();
       while(rst.next()){
         MoviableItem item=new MoviableItem(rst.getString("itemcode"),rst.getString("description"),rst.getInt("salse"));
       mosList.add(item);
       
       }
       return mosList;
   } 
}
