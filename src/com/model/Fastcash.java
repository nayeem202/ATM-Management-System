/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.util.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Adon
 */
public class Fastcash extends javax.swing.JFrame {

    /**
     * Creates new form Fastcash
     */
    public Fastcash() {
        initComponents();

    }

    int myaccNumbr;

    public Fastcash(int accNu) {
        initComponents();
        setLocationRelativeTo(null);
        myaccNumbr = accNu;
        //showAccnumber.setText("" + myaccNumbr);
        getBalance();
    }

    int oldBl;

    private void getBalance() {
        try {
            Connection conn = DatabaseConnector.connect();
            String sql = "SELECT * FROM account_table WHERE account_num= '" + myaccNumbr + "'";
            PreparedStatement pst1 = conn.prepareStatement(sql);
            ResultSet rs1 = pst1.executeQuery(sql);
            if (rs1.next()) {
                oldBl = rs1.getInt(8);
                amount.setText(" BDT " + oldBl);
            } else {
            }

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        amount = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        jPanel2.setBackground(new java.awt.Color(64, 27, 79));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/model/image/bank3.png"))); // NOI18N
        jLabel4.setText("First State National Bank Limited");

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Fast Cash");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(392, 392, 392))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton2.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button2/newBackbutton.png"))); // NOI18N
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/model/image/exit40.png"))); // NOI18N
        jButton3.setText("Exit card");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        amount.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        amount.setForeground(new java.awt.Color(255, 51, 51));
        amount.setText("Amount");

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("BDT 500");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 51, 51));
        jButton9.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("BDT 2000");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 51, 51));
        jButton10.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("BDT 3000");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 51, 51));
        jButton11.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("BDT 4000");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 51, 51));
        jButton12.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("BDT 10000");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 51, 51));
        jButton13.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("BDT 1000");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setText("Available Balance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(amount)))))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(221, 221, 221))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            Connection conn = DatabaseConnector.connect();
            String sql = "SELECT * FROM account_table WHERE account_num= '" + myaccNumbr + "'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                setVisible(false);
                new Atm_Management_System(rs.getInt(1), rs.getString(2)).setVisible(true);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Login failed");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        if (oldBl < 500) {
            JOptionPane.showMessageDialog(this, "Insufficient Balance");

        } else {

            try {
                Connection conn = DatabaseConnector.connect();

                String sql = "update account_table set balance=?  where account_num = ?";

                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, oldBl - 500);
                pst.setInt(2, myaccNumbr);

                int rs = pst.executeUpdate();
                if (rs == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Balance Withdraw successfully");
                    getBalance();
                    withdrawMoney1();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Balance withdraw failed");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }


    }//GEN-LAST:event_jButton7MouseClicked
    }


    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        if (oldBl < 3000) {
            JOptionPane.showMessageDialog(this, "Insufficient Balance");

        } else {

            try {
                Connection conn = DatabaseConnector.connect();

                String sql = "update account_table set balance=?  where account_num = ?";

                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, oldBl - 3000);
                pst.setInt(2, myaccNumbr);

                int rs = pst.executeUpdate();
                if (rs == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Balance Withdraw successfully");
                    getBalance();
                    withdrawMoney4();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Balance withdraw failed");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
    }//GEN-LAST:event_jButton10MouseClicked
    }


    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        if (oldBl < 1000) {
            JOptionPane.showMessageDialog(this, "Insufficient Balance");

        } else {

            try {
                Connection conn = DatabaseConnector.connect();

                String sql = "update account_table set balance=?  where account_num = ?";

                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, oldBl - 1000);
                pst.setInt(2, myaccNumbr);

                int rs = pst.executeUpdate();
                if (rs == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Balance Withdraw successfully");
                    getBalance();
                    withdrawMoney2();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Balance withdraw failed");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        if (oldBl < 2000) {
            JOptionPane.showMessageDialog(this, "Insufficient Balance");

        }else{

            try {
                Connection conn = DatabaseConnector.connect();

                String sql = "update account_table set balance=?  where account_num = ?";

                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, oldBl - 2000);
                pst.setInt(2, myaccNumbr);

                int rs = pst.executeUpdate();
                if (rs == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Balance Withdraw successfully");
                    getBalance();
                   withdrawMoney3();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Balance withdraw failed");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
    }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        if (oldBl < 4000) {
            JOptionPane.showMessageDialog(this, "Insufficient Balance");

        }else{

            try {
                Connection conn = DatabaseConnector.connect();

                String sql = "update account_table set balance=?  where account_num = ?";

                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, oldBl - 4000);
                pst.setInt(2, myaccNumbr);

                int rs = pst.executeUpdate();
                if (rs == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Balance Withdraw successfully");
                    getBalance();
                    withdrawMoney5();
                   
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Balance withdraw failed");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
    }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
     if (oldBl < 10000) {
            JOptionPane.showMessageDialog(this, "Insufficient Balance");

        }else{

            try {
                Connection conn = DatabaseConnector.connect();

                String sql = "update account_table set balance=?  where account_num = ?";

                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, oldBl - 10000);
                pst.setInt(2, myaccNumbr);

                int rs = pst.executeUpdate();
                if (rs == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Balance Withdraw successfully");
                    getBalance();
                   withdrawMoney6();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Balance withdraw failed");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
    }
    }//GEN-LAST:event_jButton12MouseClicked

    
    
    String mydate;
    private void getDate(){
    Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
        mydate = s.format(d);
    }
    
    
    
    
    
    private void withdrawMoney1(){
           getDate();

            Connection conn = DatabaseConnector.connect();
            String sql = "insert into transaction_tbl2 (Account_Number,Transaction_Type,Amount,Date) values (?,?,?,?)";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
               // pst.setInt(1, WIDTH);
                pst.setInt(1, myaccNumbr);
                pst.setString(2, "withdraw By Fast cash");
                pst.setInt(3, 500);
                pst.setString (4, mydate);
               
                int rs = pst.executeUpdate();
                if (rs > 0) {
                    System.out.println("Connection Succedded");
                    //JOptionPane.showMessageDialog(rootPane, "Account Save Successfully");
                    //reset();

                } else {
                    
                }

            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
    }
     private void withdrawMoney2(){
           getDate();

            Connection conn = DatabaseConnector.connect();
            String sql = "insert into transaction_tbl2 (Account_Number,Transaction_Type,Amount,Date) values (?,?,?,?)";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
               // pst.setInt(1, WIDTH);
                pst.setInt(1, myaccNumbr);
                pst.setString(2, "withdraw By Fast cash");
                pst.setInt(3, 1000);
                pst.setString (4, mydate);
               
                int rs = pst.executeUpdate();
                if (rs > 0) {
                    System.out.println("Connection Succedded");
                    //JOptionPane.showMessageDialog(rootPane, "Account Save Successfully");
                    //reset();

                } else {
                    
                }

            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
    }
     
      private void withdrawMoney3(){
           getDate();

            Connection conn = DatabaseConnector.connect();
            String sql = "insert into transaction_tbl2 (Account_Number,Transaction_Type,Amount,Date) values (?,?,?,?)";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
               // pst.setInt(1, WIDTH);
                pst.setInt(1, myaccNumbr);
                pst.setString(2, "withdraw By Fast cash");
                 pst.setInt(3, 2000);
                pst.setString (4, mydate);
               
                int rs = pst.executeUpdate();
                if (rs > 0) {
                    System.out.println("Connection Succedded");
                    //JOptionPane.showMessageDialog(rootPane, "Account Save Successfully");
                    //reset();

                } else {
                    
                }

            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
    }
     
      
      private void withdrawMoney4(){
           getDate();

            Connection conn = DatabaseConnector.connect();
            String sql = "insert into transaction_tbl2 (Account_Number,Transaction_Type,Amount,Date) values (?,?,?,?)";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
               // pst.setInt(1, WIDTH);
                pst.setInt(1, myaccNumbr);
                pst.setString(2, "withdraw By Fast cash");
                 pst.setInt(3, 3000);
                pst.setString (4, mydate);
               
                int rs = pst.executeUpdate();
                if (rs > 0) {
                    System.out.println("Connection Succedded");
                    //JOptionPane.showMessageDialog(rootPane, "Account Save Successfully");
                    //reset();

                } else {
                    
                }

            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
    }
      
      
           private void withdrawMoney5(){
           getDate();

            Connection conn = DatabaseConnector.connect();
            String sql = "insert into transaction_tbl2 (Account_Number,Transaction_Type,Amount,Date) values (?,?,?,?)";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
               // pst.setInt(1, WIDTH);
                pst.setInt(1, myaccNumbr);
                pst.setString(2, "withdraw By Fast cash");
                 pst.setInt(3, 4000);
                pst.setString (4, mydate);
               
                int rs = pst.executeUpdate();
                if (rs > 0) {
                    System.out.println("Connection Succedded");
                    //JOptionPane.showMessageDialog(rootPane, "Account Save Successfully");
                    //reset();

                } else {
                    
                }

            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
    }
      
           
            private void withdrawMoney6(){
           getDate();

            Connection conn = DatabaseConnector.connect();
            String sql = "insert into transaction_tbl2 (Account_Number,Transaction_Type,Amount,Date) values (?,?,?,?)";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
               // pst.setInt(1, WIDTH);
                pst.setInt(1, myaccNumbr);
                pst.setString(2, "withdraw By Fast cash");
                 pst.setInt(3, 10000);
                pst.setString (4, mydate);
               
                int rs = pst.executeUpdate();
                if (rs > 0) {
                    System.out.println("Connection Succedded");
                    //JOptionPane.showMessageDialog(rootPane, "Account Save Successfully");
                    //reset();

                } else {
                    
                }

            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
    }
      
      
      
    
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
            java.util.logging.Logger.getLogger(Fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fastcash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
