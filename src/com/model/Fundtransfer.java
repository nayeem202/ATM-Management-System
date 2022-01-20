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
public class Fundtransfer extends javax.swing.JFrame {

   
    public Fundtransfer() {
        initComponents();

    }

    int myaccNumbr;

    public Fundtransfer(int accNu) {
        initComponents();
        setLocationRelativeTo(null);
        myaccNumbr = accNu;
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
            } else {
            }

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        transfer_amount = new javax.swing.JTextField();
        transfer_accno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl0 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(64, 27, 79));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/model/image/bank3.png"))); // NOI18N
        jLabel4.setText("First State National Bank Limited");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Fund Transfer");

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

        jButton3.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/model/image/exit40.png"))); // NOI18N
        jButton3.setText("Exit card");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button2/newBackbutton.png"))); // NOI18N
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(127, 71, 30), 5, true), "Fund Transfer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 1, 32), new java.awt.Color(127, 71, 30))); // NOI18N

        transfer_amount.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N

        transfer_accno.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel1.setText("Enter account number");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setText("Amount");

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(1).png"))); // NOI18N
        lbl1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lbl1ComponentAdded(evt);
            }
        });
        lbl1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl1MousePressed(evt);
            }
        });
        lbl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl1KeyPressed(evt);
            }
        });

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(2).png"))); // NOI18N
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2MouseClicked(evt);
            }
        });

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(3).png"))); // NOI18N
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
        });

        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(4).png"))); // NOI18N
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl4MouseClicked(evt);
            }
        });

        lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(5).png"))); // NOI18N
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl5MouseClicked(evt);
            }
        });

        lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(6).png"))); // NOI18N
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl6MouseClicked(evt);
            }
        });

        lbl7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(7).png"))); // NOI18N
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl7MouseClicked(evt);
            }
        });

        lbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(8).png"))); // NOI18N
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl8MouseClicked(evt);
            }
        });

        lbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(9).png"))); // NOI18N
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl9MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(11).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        lbl0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60.png"))); // NOI18N
        lbl0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl0MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(10).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button2/icons8-initiate-money-transfer-34.png"))); // NOI18N
        jButton1.setText("Transfer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transfer_accno, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfer_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl1)
                                .addGap(30, 30, 30)
                                .addComponent(lbl2)
                                .addGap(30, 30, 30)
                                .addComponent(lbl3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl4)
                                .addGap(30, 30, 30)
                                .addComponent(lbl5)
                                .addGap(30, 30, 30)
                                .addComponent(lbl6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl7)
                                .addGap(30, 30, 30)
                                .addComponent(lbl8)
                                .addGap(30, 30, 30)
                                .addComponent(lbl9))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(lbl0)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6)))))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(366, 366, 366))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(transfer_accno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transfer_amount)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1)
                            .addComponent(lbl2)
                            .addComponent(lbl3))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl4)
                            .addComponent(lbl5)
                            .addComponent(lbl6))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl7)
                            .addComponent(lbl8)
                            .addComponent(lbl9))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lbl0)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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

    int oldBl2;

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        /*
        int desired_acc = Integer.parseInt(transfer_accno.getText());

        if (transfer_amount.getText().isEmpty() || transfer_amount.getText().equals(0)) {

            JOptionPane.showMessageDialog(null, "Enter a valid amount");
        }
        else if (oldBl < Integer.valueOf(transfer_amount.getText())) {
            JOptionPane.showMessageDialog(this, "Fund Transfer failed! Insufficient Balance ");

        } else {

            try {

                int transfer_bl = Integer.parseInt(transfer_amount.getText());

                Connection conn = DatabaseConnector.connect();

                String sql = "update account_table set balance=?  where account_num =  '" + myaccNumbr + "'";;

                PreparedStatement pst = conn.prepareStatement(sql);
                oldBl = oldBl - transfer_bl;
                pst.setInt(1, oldBl);
                
              
                int rs = pst.executeUpdate();
                if (rs == 1) {
                    try {

                        String sq = "SELECT * FROM account_table WHERE account_num= '" + desired_acc + "'";
                        PreparedStatement pst1 = conn.prepareStatement(sq);
                        ResultSet rs1 = pst1.executeQuery(sq);
                        if (rs1.next()) {
                            oldBl2 = rs1.getInt(8);

                            String sql2 = "update account_table set balance=?  where account_num = ?";

                            PreparedStatement pst2 = conn.prepareStatement(sql2);
                            
                            oldBl2= oldBl2+transfer_bl;
                            pst2.setInt(1, oldBl2);
                            pst2.setInt(2, desired_acc);

                            int rs2 = pst2.executeUpdate();
                            JOptionPane.showMessageDialog(rootPane, "Balance Transferd Successfully");
                            
                            
                            
                            
                        } else {
                           JOptionPane.showMessageDialog(rootPane, "Account not found. Trasnsfered failed"); 
                        }

                    } catch (SQLException ex) {
                        System.out.println(ex.getLocalizedMessage());
                    }
                   // JOptionPane.showMessageDialog(rootPane, "Balance Transferd Successfully");

                } else {
                    //JOptionPane.showMessageDialog(rootPane, "Account not found. Trasnsfered failed");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }

        }
         */
        if (transfer_accno.getText().isEmpty() || transfer_amount.getText().equals(0) || transfer_accno.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Enter a valid user account number and Amount");
        } 
       
        

        int desired_acc = Integer.parseInt(transfer_accno.getText());
        

        if(desired_acc == myaccNumbr){
            JOptionPane.showMessageDialog(this , "You can not transfer money in your own account");
        } 
        
        
        else if (oldBl < Integer.valueOf(transfer_amount.getText())) {
            JOptionPane.showMessageDialog(this, "Fund Transfer failed! Insufficient Balance ");

        }
        
        else {

            try {
                Connection conn = DatabaseConnector.connect();
                String sq = "SELECT * FROM account_table WHERE account_num= '" + desired_acc + "'";
                PreparedStatement pst1 = conn.prepareStatement(sq);
                ResultSet rs1 = pst1.executeQuery(sq);
                if (rs1.next()) {
                    oldBl2 = rs1.getInt(8);

                    String sql2 = "update account_table set balance=?  where account_num = ?";

                    PreparedStatement pst2 = conn.prepareStatement(sql2);
                    int transfer_bl = Integer.parseInt(transfer_amount.getText());
                    oldBl2 = oldBl2 + transfer_bl;
                    pst2.setInt(1, oldBl2);
                    pst2.setInt(2, desired_acc);

                    int rs2 = pst2.executeUpdate();
                    JOptionPane.showMessageDialog(rootPane, "Balance Transferd Successfully");
                    fundTransfer();
                    fundReceive();

                    if (rs2 == 1) {

                        try {

                            String sql = "update account_table set balance=?  where account_num =  '" + myaccNumbr + "'";;

                            PreparedStatement pst = conn.prepareStatement(sql);
                            oldBl = oldBl - transfer_bl;
                            pst.setInt(1, oldBl);

                            int rs = pst.executeUpdate();

                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(this, ex);
                        }

                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Account not found. Trasnsfered failed");
                }

            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
            // JOptionPane.showMessageDialog(rootPane, "Balance Transferd Successfully");

        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void lbl1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lbl1ComponentAdded

    }//GEN-LAST:event_lbl1ComponentAdded

    private void lbl1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl1AncestorAdded

    }//GEN-LAST:event_lbl1AncestorAdded

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
       if (transfer_accno.hasFocus()) {
            transfer_accno.setText(transfer_accno.getText() + "1");
        }

        if (transfer_amount.hasFocus()) {

            transfer_amount.setText(transfer_amount.getText() + "1");
        }
    }//GEN-LAST:event_lbl1MouseClicked

    private void lbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MousePressed

    }//GEN-LAST:event_lbl1MousePressed

    private void lbl1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl1KeyPressed

    private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
        if (transfer_accno.hasFocus()) {
            transfer_accno.setText(transfer_accno.getText() + "2");
        }

        if (transfer_amount.hasFocus()) {

            transfer_amount.setText(transfer_amount.getText() + "2");
        }
    }//GEN-LAST:event_lbl2MouseClicked

    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
       if (transfer_accno.hasFocus()) {
            transfer_accno.setText(transfer_accno.getText() + "3");
        }

        if (transfer_amount.hasFocus()) {

            transfer_amount.setText(transfer_amount.getText() + "3");
        }
    }//GEN-LAST:event_lbl3MouseClicked

    private void lbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseClicked
       if (transfer_accno.hasFocus()) {
            transfer_accno.setText(transfer_accno.getText() + "4");
        }

        if (transfer_amount.hasFocus()) {

            transfer_amount.setText(transfer_amount.getText() + "4");
        }
    }//GEN-LAST:event_lbl4MouseClicked

    private void lbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseClicked
       if (transfer_accno.hasFocus()) {
            transfer_accno.setText(transfer_accno.getText() + "5");
        }

        if (transfer_amount.hasFocus()) {

            transfer_amount.setText(transfer_amount.getText() + "5");
        }
    }//GEN-LAST:event_lbl5MouseClicked

    private void lbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseClicked
       if (transfer_accno.hasFocus()) {
            transfer_accno.setText(transfer_accno.getText() + "6");
        }

        if (transfer_amount.hasFocus()) {

            transfer_amount.setText(transfer_amount.getText() + "6");
        }
    }//GEN-LAST:event_lbl6MouseClicked

    private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
        if (transfer_accno.hasFocus()) {
            transfer_accno.setText(transfer_accno.getText() + "7");
        }

        if (transfer_amount.hasFocus()) {

            transfer_amount.setText(transfer_amount.getText() + "7");
        }
    }//GEN-LAST:event_lbl7MouseClicked

    private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
        if (transfer_accno.hasFocus()) {
            transfer_accno.setText(transfer_accno.getText() + "8");
        }

        if (transfer_amount.hasFocus()) {

            transfer_amount.setText(transfer_amount.getText() + "8");
        }
    }//GEN-LAST:event_lbl8MouseClicked

    private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
        if (transfer_accno.hasFocus()) {
            transfer_accno.setText(transfer_accno.getText() + "9");
        }

        if (transfer_amount.hasFocus()) {

            transfer_amount.setText(transfer_amount.getText() + "9");
        }
    }//GEN-LAST:event_lbl9MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
 if (transfer_accno.hasFocus()) {
            int length = transfer_accno.getText().length();
            int number = transfer_accno.getText().length() - 1;
            String store;
            if (length > 0) {
                StringBuilder back = new StringBuilder(transfer_accno.getText());
                back.deleteCharAt(number);
                store = back.toString();
                transfer_accno.setText(store);

            }
        }

        if (transfer_amount.hasFocus()) {
            int length = transfer_amount.getText().length();
            int number = transfer_amount.getText().length() - 1;
            String store;
            if (length > 0) {
                StringBuilder back = new StringBuilder(transfer_amount.getText());
                back.deleteCharAt(number);
                store = back.toString();
                transfer_amount.setText(store);

            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void lbl0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl0MouseClicked
        if (transfer_accno.hasFocus()) {
            transfer_accno.setText(transfer_accno.getText() + "0");
        }

        if (transfer_amount.hasFocus()) {

            transfer_amount.setText(transfer_amount.getText() + "0");
        }
    }//GEN-LAST:event_lbl0MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        
       if (transfer_accno.hasFocus()) {
             transfer_accno.setText("");
        }

        if (transfer_amount.hasFocus()) {
               transfer_amount.setText("");
           
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    
    
    
      String mydate;
    private void getDate(){
    Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
        mydate = s.format(d);
    }
    
    
    private void fundTransfer(){
           getDate();

            Connection conn = DatabaseConnector.connect();
            String sql = "insert into transaction_tbl2 (Account_Number,Transaction_Type,Amount,Date) values (?,?,?,?)";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
               // pst.setInt(1, WIDTH);
                pst.setInt(1, myaccNumbr);
                pst.setString(2, "Fund Transferred");
                pst.setString(3, transfer_amount.getText());
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
    
    
    
   
    
    
    private void fundReceive(){
           getDate();

            Connection conn = DatabaseConnector.connect();
            String sql = "insert into transaction_tbl2 (Account_Number,Transaction_Type,Amount,Date) values (?,?,?,?)";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
               // pst.setInt(1, WIDTH);
               int desired_acc = Integer.parseInt(transfer_accno.getText());
                pst.setInt(1, desired_acc);
                pst.setString(2, "Fund Received");
                pst.setString(3, transfer_amount.getText());
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
            java.util.logging.Logger.getLogger(Fundtransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fundtransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fundtransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fundtransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fundtransfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JTextField transfer_accno;
    private javax.swing.JTextField transfer_amount;
    // End of variables declaration//GEN-END:variables
}
