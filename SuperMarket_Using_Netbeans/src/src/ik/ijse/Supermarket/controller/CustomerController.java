/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.Supermarket.controller;

import ik.ijse.Supermarket.db.DBConnection;
import ik.ijse.Supermarket.model.Customer;
import ik.ijse.Supermarket.model.CustomerIncome;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DilshanRajika
 */
public class CustomerController {
  public static ArrayList<Customer>  LoadCustomerID() throws ClassNotFoundException, SQLException{
      Connection con=DBConnection.getinstance().getconnection();
      Statement stm=con.createStatement();
      ResultSet rst=stm.executeQuery("Select * from customer");
      ArrayList customeridlist=new ArrayList();
      while(rst.next()){
      Customer customer=new Customer(rst.getString("CustID"));
      customeridlist.add(customer);
      }
  
  
  return customeridlist;
  } 
  public static String GetCustomerName(String custid) throws ClassNotFoundException, SQLException{
    Connection con= DBConnection.getinstance().getconnection();
    Statement stm=con.createStatement();
    ResultSet srt=stm.executeQuery("Select * from customer where custid='"+custid+"'");
    if(srt.next()){
    String custname=srt.getString("CustName");
    return custname;
            
    }
    return null;
  }
  public static ArrayList<CustomerIncome> findCustomerIncome() throws ClassNotFoundException, SQLException{
  Connection con= DBConnection.getinstance().getconnection();
  ArrayList custincomelist=new  ArrayList();
  PreparedStatement stm=con.prepareStatement("select  distinct c.custID,c.custName,sum(d.orderqty*i.unitprice)as Income from customer c, orders o,orderdetail d,Item i where o.orderid=d.orderid && c.custID=o.custID group by c.custID order by income desc;");
  ResultSet rst=stm.executeQuery();
  while(rst.next()){
  CustomerIncome custincome=new CustomerIncome(rst.getString("CustID"),rst.getString("CustName"),rst.getDouble("Income"));
  custincomelist.add(custincome);
  }
  return custincomelist;
  }
  public static boolean AddnewCustomer(Customer customer) throws ClassNotFoundException, SQLException{
      Connection connection = DBConnection.getinstance().getconnection();
      PreparedStatement stm=connection.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
      stm.setObject(1,customer.getCustID());
      stm.setObject(2, customer.getCustTitle());
      stm.setObject(3, customer.getCustName());
      stm.setObject(4, customer.getCustAddress());
      stm.setObject(5, customer.getCity());
      stm.setObject(6, customer.getProvince());
      stm.setObject(7,customer.getPostalCode());
      return stm.executeUpdate()>0;
      
      
  
  }
}
