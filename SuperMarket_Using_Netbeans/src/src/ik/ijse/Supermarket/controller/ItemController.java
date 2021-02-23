/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.Supermarket.controller;

import ik.ijse.Supermarket.db.DBConnection;
import ik.ijse.Supermarket.model.Item;
import ik.ijse.Supermarket.model.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DilshanRajika
 */
public class ItemController {
    public static ArrayList<Item> LoadItem() throws ClassNotFoundException, SQLException {
       Connection con= DBConnection.getinstance().getconnection();
        PreparedStatement stm=con.prepareStatement("SELECT * FROM ITEM");
        ResultSet rst=stm.executeQuery();
        ArrayList itemlist=new ArrayList();
        while(rst.next()){
        Item item=new Item(rst.getString("ItemCode"),rst.getString("Description"),rst.getString("PackSize"),rst.getDouble("UnitPrice"),rst.getInt("QtyOnHand"));
        itemlist.add(item);
        
        }
        return itemlist;
    }
    public static boolean UpdateStock(ArrayList<OrderDetail>orderdetaillist) throws ClassNotFoundException, SQLException{
    Connection connection = DBConnection.getinstance().getconnection();
    int added=0;
     PreparedStatement stm=connection.prepareStatement("Update item set QtyOnHand=QtyOnHand-? where itemcode=? ");
        for (OrderDetail orderDetail : orderdetaillist) {
      stm.setObject(1,orderDetail.getOrderqty());
      stm.setObject(2, orderDetail.getItemcode());
      added=stm.executeUpdate();
        }
     return added>0;
    }
    public static boolean addItem(Item item) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getinstance().getconnection();
        PreparedStatement stm=connection.prepareStatement("insert into item values(?,?,?,?,?)");
        stm.setObject(1, item.getItemCode());
        stm.setObject(2, item.getDescription());
        stm.setObject(3, item.getPackSize());
        stm.setObject(4, item.getUnitPrice());
        stm.setObject(5, item.getQtyOnHand());
       return  stm.executeUpdate()>0;
        
    }
    public static boolean UpdateItem(Item item) throws ClassNotFoundException, SQLException{
         Connection connection = DBConnection.getinstance().getconnection();
        PreparedStatement stm=connection.prepareStatement("Update Item set Description=?,PackSize=?,UnitPrice=?,QtyOnHand=? where ItemCode=? ");
        stm.setObject(1, item.getDescription());
        stm.setObject(2, item.getPackSize());
        stm.setObject(3, item.getUnitPrice());
        stm.setObject(4, item.getQtyOnHand());
        stm.setObject(5, item.getItemCode());
       return  stm.executeUpdate()>0;
    
    }

    public static boolean DeleteItem(String itemcode) throws ClassNotFoundException, SQLException {
       Connection connection = DBConnection.getinstance().getconnection();
       PreparedStatement stm=connection.prepareStatement("Delete from item where itemcode=?");
       stm.setObject(1,itemcode );
      return stm.executeUpdate()>0;
    }
}
