/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.Supermarket.main;

import ik.ijse.Supermarket.controller.CustomerController;
import ik.ijse.Supermarket.controller.ItemController;
import ik.ijse.Supermarket.controller.OrderController;
import ik.ijse.Supermarket.controller.paymentController;
import ik.ijse.Supermarket.model.Customer;
import ik.ijse.Supermarket.model.Item;
import ik.ijse.Supermarket.model.Order;
import ik.ijse.Supermarket.model.OrderDetail;
import ik.ijse.Supermarket.model.Payment;
import ik.ijse.Supermarket.view.AddCustomerForm;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author DilshanRajika
 */
public class PlaceOrderForm extends javax.swing.JFrame {

    /**
     * Creates new form PlaceOrderForm
     */
    public PlaceOrderForm() {
        initComponents();
       LoadItemTable();
        loadDate();
        loadTime();
        GenarateOrderID();
        LoadCustID();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblcustname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbcustid = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lblqtyonhand = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemtable = new javax.swing.JTable();
        lblorderid = new javax.swing.JLabel();
        lbldescription = new javax.swing.JLabel();
        lblunitprice = new javax.swing.JLabel();
        lblitemcode = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblpacksize = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        qtytext = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectitemtable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        placeOrderButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        totaltext = new javax.swing.JLabel();
        RemoveButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lbldate = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cashpaymentbox = new javax.swing.JCheckBox();
        cardpaymentbox = new javax.swing.JCheckBox();
        AddnewCustomerButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Thibus29STru", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place Order Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -10, 340, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));

        lblcustname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblcustname.setForeground(new java.awt.Color(51, 255, 255));
        lblcustname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblcustname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 210, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Qty");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 80, 30));

        cmbcustid.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        cmbcustid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbcustidItemStateChanged(evt);
            }
        });
        cmbcustid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcustidActionPerformed(evt);
            }
        });
        jPanel1.add(cmbcustid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 160, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Customer Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 120, 20));

        lblqtyonhand.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblqtyonhand.setForeground(new java.awt.Color(51, 255, 255));
        lblqtyonhand.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblqtyonhand, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 110, 30));

        itemtable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        itemtable.setFont(new java.awt.Font("Schadow BT", 1, 12)); // NOI18N
        itemtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemCode", "Description", "PackSize", "UnitPrice", "Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        itemtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemtable);
        if (itemtable.getColumnModel().getColumnCount() > 0) {
            itemtable.getColumnModel().getColumn(0).setHeaderValue("ItemCode");
            itemtable.getColumnModel().getColumn(1).setHeaderValue("Description");
            itemtable.getColumnModel().getColumn(2).setHeaderValue("PackSize");
            itemtable.getColumnModel().getColumn(3).setHeaderValue("UnitPrice");
            itemtable.getColumnModel().getColumn(4).setHeaderValue("Qty");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 700, 100));

        lblorderid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblorderid.setForeground(new java.awt.Color(51, 255, 255));
        lblorderid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblorderid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 160, 30));

        lbldescription.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbldescription.setForeground(new java.awt.Color(51, 255, 255));
        lbldescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbldescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 160, 30));

        lblunitprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblunitprice.setForeground(new java.awt.Color(51, 255, 255));
        lblunitprice.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblunitprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 110, 30));

        lblitemcode.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblitemcode.setForeground(new java.awt.Color(51, 255, 255));
        lblitemcode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblitemcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Order ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Sub Total :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 80, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Select Item List");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 280, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Description");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 80, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("QtyOnHand");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 80, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Unite Price");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 80, 30));

        lblpacksize.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblpacksize.setForeground(new java.awt.Color(51, 255, 255));
        lblpacksize.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblpacksize, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 100, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 730, 10));

        qtytext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        qtytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtytextActionPerformed(evt);
            }
        });
        jPanel1.add(qtytext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 60, 30));

        selectitemtable.setBackground(new java.awt.Color(204, 255, 204));
        selectitemtable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        selectitemtable.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        selectitemtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemCode", "Description", "PackSize", "UnitPrice", "Qty", "Total"
            }
        ));
        selectitemtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectitemtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(selectitemtable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 700, 100));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Pack Size");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 80, 30));

        placeOrderButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        placeOrderButton.setText("Conform Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(placeOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Item Code");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, 30));

        totaltext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        totaltext.setForeground(new java.awt.Color(51, 255, 255));
        totaltext.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(totaltext, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 110, 30));

        RemoveButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RemoveButton.setText("Remove Item");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RemoveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 110, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 730, 10));

        lbldate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbldate.setForeground(new java.awt.Color(51, 255, 255));
        lbldate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 120, 30));

        lbltime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbltime.setForeground(new java.awt.Color(255, 255, 0));
        lbltime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 90, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Order Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 120, 30));

        cashpaymentbox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cashpaymentbox.setText("Cash payment");
        cashpaymentbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashpaymentboxActionPerformed(evt);
            }
        });
        jPanel1.add(cashpaymentbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 120, 30));

        cardpaymentbox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cardpaymentbox.setText("Card payment");
        cardpaymentbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardpaymentboxActionPerformed(evt);
            }
        });
        jPanel1.add(cardpaymentbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, 30));

        AddnewCustomerButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddnewCustomerButton.setText("AddCustomer");
        AddnewCustomerButton.setBorder(null);
        AddnewCustomerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddnewCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddnewCustomerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddnewCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ik/ijse/Supermarket/image/mainformsuper.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbcustidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbcustidItemStateChanged
        try {
            String custid=cmbcustid.getSelectedItem().toString();
            String custname=CustomerController.GetCustomerName(custid);
            if(custname!=null){
            lblcustname.setText(custname);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            String massage=ex.getMessage();
            JOptionPane.showMessageDialog(null, massage);
        }
    }//GEN-LAST:event_cmbcustidItemStateChanged

    private void itemtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemtableMouseClicked
        DefaultTableModel dtm=(DefaultTableModel) itemtable.getModel();
        qtytext.setText(null);
        int selectrow=itemtable.getSelectedRow();
        lblitemcode.setText(itemtable.getValueAt(selectrow,0).toString());
        lbldescription.setText(itemtable.getValueAt(selectrow,1).toString());
        lblpacksize.setText(itemtable.getValueAt(selectrow,2).toString());
        lblunitprice.setText(itemtable.getValueAt(selectrow,3).toString());
        lblqtyonhand.setText(itemtable.getValueAt(selectrow,4).toString());
        qtytext.requestFocus();
    }//GEN-LAST:event_itemtableMouseClicked

    private void selectitemtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectitemtableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_selectitemtableMouseClicked
    
    private  int  IsAllreadyExists(String itemcode){
    DefaultTableModel dtm=(DefaultTableModel) selectitemtable.getModel();
    for(int x=0;x<selectitemtable.getRowCount();x++){
        if(itemcode.equals(selectitemtable.getValueAt(x,0))){
        return x;
        }
    }
    return -1;
    }
    private void CalculateCost(){
        double total=0.0;
        DefaultTableModel dtm=(DefaultTableModel) selectitemtable.getModel();
        for(int x=0;x<dtm.getRowCount();x++){
        total+=Double.parseDouble(selectitemtable.getValueAt(x,5).toString());
     }
     totaltext.setText(Double.toString(total));
    }
    private void qtytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtytextActionPerformed
    
        try{
            int custqty=Integer.parseInt(qtytext.getText());
    int qtyonhand=Integer.parseInt(lblqtyonhand.getText());
    if(qtyonhand>=custqty&&custqty>0){
            DefaultTableModel dtm=(DefaultTableModel) selectitemtable.getModel();
            String itemcode=lblitemcode.getText();
            int exists= IsAllreadyExists(itemcode);
            String description=lbldescription.getText();
            String packSize=lblpacksize.getText();
            double unitprice=Double.parseDouble(lblunitprice.getText());
            int qty=Integer.parseInt(qtytext.getText());
            double total=unitprice*qty;
          
            if(exists<0){
                Object[]rowdata={itemcode,description,packSize,unitprice,qty,total};
            dtm.addRow(rowdata);
            qtytext.setText(null);
            CalculateCost();
            }else{
            qty+=Integer.parseInt(selectitemtable.getValueAt(exists,4).toString());
            total=unitprice*qty;
            selectitemtable.setValueAt(qty, exists, 4);
            selectitemtable.setValueAt(total, exists, 5);
            CalculateCost();
            }
        } else{
     JOptionPane.showMessageDialog(null,"Stock Qty Not Avaiable","",JOptionPane.WARNING_MESSAGE);
     qtytext.setText(null);
    }
        }catch(NumberFormatException ex){
         String massage=ex.getMessage();
            JOptionPane.showMessageDialog(null, massage,"Invalid Quntity",JOptionPane.WARNING_MESSAGE);
        }
   
    }//GEN-LAST:event_qtytextActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
   DefaultTableModel dtm=(DefaultTableModel) selectitemtable.getModel();
   int rowcount=selectitemtable.getSelectedRowCount();
   try{ 
    
   if(rowcount>0){
    if(selectitemtable.getRowCount()>0){
         int option=JOptionPane.showConfirmDialog(null,"Are you sure Remove This Item?");
       switch(option){
       case 0:{
         int x=selectitemtable.getSelectedRow();
         dtm.removeRow(x);
         CalculateCost();
       }
       
        }
    }
   }else{
   JOptionPane.showMessageDialog(null,"Please Select Remove Item!","",JOptionPane.WARNING_MESSAGE);
   }
   }catch(ArrayIndexOutOfBoundsException ex){
   
   }
 
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
       
        if(cashpaymentbox.isSelected()||cardpaymentbox.isSelected()){
        String orderid=lblorderid.getText();
        String orderdate=lbldate.getText();
        String ordertime=lbltime.getText();
        String custid=cmbcustid.getSelectedItem().toString();
        double total=Double.parseDouble(totaltext.getText());
         Payment payment=new Payment();
        try {
            String payid=paymentController.getPayID();
        if(cashpaymentbox.isSelected()){
         payment=new Payment(payid,orderid,"CashPayment",total);
        }if(cardpaymentbox.isSelected()){
          payment=new Payment(payid,orderid,"CardPayment",total);
        }
        } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   
        //orderdetails
       
   
        double discount=0;
        DefaultTableModel dtm=(DefaultTableModel) selectitemtable.getModel();
        ArrayList selectitemlist=new ArrayList();
        for (int i = 0; i <dtm.getRowCount() ; i++) {
            String itemcode=dtm.getValueAt(i,0).toString();
            int  orderqty=(int)dtm.getValueAt(i,4); 
            OrderDetail orderdetail=new OrderDetail(orderid,itemcode,orderqty,discount);
            selectitemlist.add(orderdetail);
        }
        Order order=new Order(orderid,orderdate,custid,ordertime,selectitemlist,payment);
        try {
            boolean isplaced=OrderController.placeOrder(order);
            if(isplaced){
            JOptionPane.showMessageDialog(null,"Order Placed Successfuly!");
                dtm.setRowCount(0);
                  tableloadagain();
            }else{
             JOptionPane.showMessageDialog(null,"Order Placed fail","",JOptionPane.WARNING_MESSAGE);
            }
           GenarateOrderID() ;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }else{
        JOptionPane.showMessageDialog(null,"Select Payment Option","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void cashpaymentboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashpaymentboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashpaymentboxActionPerformed

    private void cardpaymentboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardpaymentboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardpaymentboxActionPerformed

    private void AddnewCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddnewCustomerButtonActionPerformed
       new AddCustomerForm().setVisible(true);
       
    }//GEN-LAST:event_AddnewCustomerButtonActionPerformed

    private void cmbcustidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcustidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcustidActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddnewCustomerButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JCheckBox cardpaymentbox;
    private javax.swing.JCheckBox cashpaymentbox;
    private javax.swing.JComboBox<String> cmbcustid;
    public static javax.swing.JTable itemtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblcustname;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldescription;
    private javax.swing.JLabel lblitemcode;
    private javax.swing.JLabel lblorderid;
    private javax.swing.JLabel lblpacksize;
    private javax.swing.JLabel lblqtyonhand;
    private javax.swing.JLabel lbltime;
    private javax.swing.JLabel lblunitprice;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JTextField qtytext;
    private javax.swing.JTable selectitemtable;
    private javax.swing.JLabel totaltext;
    // End of variables declaration//GEN-END:variables

    public static void LoadItemTable() {
        try {
            DefaultTableModel dtm=(DefaultTableModel)itemtable.getModel();
            ArrayList<Item> itemlist= ItemController.LoadItem();
           for(Item item:itemlist){
                Object rowdata[]={item.getItemCode(),item.getDescription(),item.getPackSize(),item.getUnitPrice(),item.getQtyOnHand()};
                dtm.addRow(rowdata);
           }
        } catch (ClassNotFoundException | SQLException ex) {
            String massage=ex.getMessage();
            JOptionPane.showMessageDialog(null, massage);
        }
       
    }

    private void loadDate() {
        Date date=new Date();
        SimpleDateFormat stf=new SimpleDateFormat("yyyy-MM-dd");
         String curdate=stf.format(date);
         lbldate.setText(curdate);
     
    }

    private void GenarateOrderID()  {
        
        try {
            String orderid=OrderController.CreateOrderID();
                 
       if(orderid!=null){
            lblorderid.setText(orderid);
       }
        } catch (ClassNotFoundException | SQLException ex) {
        String massage=ex.getMessage();
            JOptionPane.showMessageDialog(null, massage);
        }
   
        
        }

    private void LoadCustID() {
        try {
            ArrayList<Customer>custidlist= CustomerController.LoadCustomerID();
            for(Customer customer:custidlist){
            cmbcustid.addItem(customer.getCustID());
            
            }
        } catch (ClassNotFoundException | SQLException ex) {
          String massage=ex.getMessage();
            JOptionPane.showMessageDialog(null, massage);
        }
    }

    private void loadTime() {
new Timer(0, (ActionEvent e) -> {
   Date date=new Date();
        SimpleDateFormat stf=new SimpleDateFormat("HH:mm:ss");
         String curdate=stf.format(date);
         lbltime.setText(curdate);
}).start();
    


}

    private void tableloadagain() {
  try {
            DefaultTableModel dtm=(DefaultTableModel)itemtable.getModel();
            ArrayList<Item> itemlist= ItemController.LoadItem();
           for(Item item:itemlist){
                Object rowdata[]={item.getItemCode(),item.getDescription(),item.getPackSize(),item.getUnitPrice(),item.getQtyOnHand()};
                dtm.addRow(rowdata);
           }
        } catch (ClassNotFoundException | SQLException ex) {
            String massage=ex.getMessage();
            JOptionPane.showMessageDialog(null, massage);
        }

    }
}



    

