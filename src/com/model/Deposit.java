/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.util.DatabaseConnector;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adon
 */
public class Deposit extends javax.swing.JFrame {

    /**
     * Creates new form Deposit
     */
    public Deposit() {
        initComponents();
        
    }

    int myaccNumbr;

    public Deposit(int accNu) {
        initComponents();
        setLocationRelativeTo(null);
        myaccNumbr = accNu;
        getBalance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbl0 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        deposit_amount = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        deposit_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(64, 27, 79));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/model/image/bank3.png"))); // NOI18N
        jLabel4.setText("First State National Bank Limited");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Deposit Now");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(415, 415, 415))))
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

        jPanel3.setBackground(new java.awt.Color(248, 234, 223));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));
        jPanel1.setForeground(new java.awt.Color(51, 102, 0));

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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(127, 71, 30), 5, true), "Deposit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 1, 32))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60.png"))); // NOI18N
        lbl0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl0MouseClicked(evt);
            }
        });
        jPanel4.add(lbl0, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(4).png"))); // NOI18N
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl4MouseClicked(evt);
            }
        });
        jPanel4.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Amount:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 90, 47));

        lbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(8).png"))); // NOI18N
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl8MouseClicked(evt);
            }
        });
        jPanel4.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        lbl7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(7).png"))); // NOI18N
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl7MouseClicked(evt);
            }
        });
        jPanel4.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(5).png"))); // NOI18N
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl5MouseClicked(evt);
            }
        });
        jPanel4.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        deposit_amount.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jPanel4.add(deposit_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 240, 47));

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(2).png"))); // NOI18N
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2MouseClicked(evt);
            }
        });
        jPanel4.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

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
        jPanel4.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        lbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(9).png"))); // NOI18N
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl9MouseClicked(evt);
            }
        });
        jPanel4.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(6).png"))); // NOI18N
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl6MouseClicked(evt);
            }
        });
        jPanel4.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(3).png"))); // NOI18N
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
        });
        jPanel4.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        deposit_btn.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        deposit_btn.setForeground(new java.awt.Color(0, 153, 102));
        deposit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button2/deposit2.png"))); // NOI18N
        deposit_btn.setText("Deposit");
        deposit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deposit_btnMouseClicked(evt);
            }
        });
        jPanel4.add(deposit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(11).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(10).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*   
    String userName;
    Deposit(int accNu, String accNam) {
        initComponents();
        setLocationRelativeTo(null);
        myaccNumbr = accNu;
        userName = accNam;
    }
     */
    
    String mydate;
    private void getDate(){
    Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
        mydate = s.format(d);
    }
    
    
    private void depositMoney(){
           getDate();

            Connection conn = DatabaseConnector.connect();
            String sql = "insert into transaction_tbl2 (Account_Number,Transaction_Type,Amount,Date) values (?,?,?,?)";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
               // pst.setInt(1, WIDTH);
                pst.setInt(1, myaccNumbr);
                pst.setString(2, "Deposit");
                pst.setString(3, deposit_amount.getText());
                pst.setString (4, mydate);
               
                int rs = pst.executeUpdate();
                if (rs > 0) {
                    System.out.println("Connection Succedded");
                    //JOptionPane.showMessageDialog(rootPane, "Account Save Successfully");
                    //reset();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Save failed");
                }

            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
    }
    
    
    

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

        //setVisible(false);
        //new Atm_Management_System().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    private void deposit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deposit_btnMouseClicked
        
        //int deposit = Integer.parseInt(deposit_amount.getText());
        if (deposit_amount.getText().isEmpty() || deposit_amount.getText().equals(0)) {

            JOptionPane.showMessageDialog(null, "Enter a valid amount");
        }
        
        else {

            try {

                int userBalance = Integer.parseInt(deposit_amount.getText());
                
                 if (userBalance < 500) {
                    JOptionPane.showMessageDialog(null, "Minimum Deposited value BDT 500");
                }else{Connection conn = DatabaseConnector.connect();

                String sql = "update account_table set balance=?  where account_num = ?";

                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, oldBl + userBalance);
                pst.setInt(2, myaccNumbr);

                int rs = pst.executeUpdate();
                if (rs == 1) {
                   
                    JOptionPane.showMessageDialog(this, "Amount Successfully Deposited");
                    depositMoney();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Balance updated failed");
                }}

                
                

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }

        }


    }//GEN-LAST:event_deposit_btnMouseClicked

    private void lbl1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl1KeyPressed

    private void lbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MousePressed

    }//GEN-LAST:event_lbl1MousePressed

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
         deposit_amount.setText(deposit_amount.getText() + "1");
        
        
    }//GEN-LAST:event_lbl1MouseClicked

    private void lbl1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl1AncestorAdded

    }//GEN-LAST:event_lbl1AncestorAdded

    private void lbl1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lbl1ComponentAdded

    }//GEN-LAST:event_lbl1ComponentAdded

    private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
          deposit_amount.setText(deposit_amount.getText() + "2");
    }//GEN-LAST:event_lbl2MouseClicked

    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
          deposit_amount.setText(deposit_amount.getText() + "3");
    }//GEN-LAST:event_lbl3MouseClicked

    private void lbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseClicked
          deposit_amount.setText(deposit_amount.getText() + "4");
          
          
    }//GEN-LAST:event_lbl4MouseClicked

    private void lbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseClicked
       deposit_amount.setText(deposit_amount.getText() + "5");
    }//GEN-LAST:event_lbl5MouseClicked

    private void lbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseClicked
          deposit_amount.setText(deposit_amount.getText() + "6");
    }//GEN-LAST:event_lbl6MouseClicked

    private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
         deposit_amount.setText(deposit_amount.getText() + "7");
    }//GEN-LAST:event_lbl7MouseClicked

    private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
          deposit_amount.setText(deposit_amount.getText() + "8");
    }//GEN-LAST:event_lbl8MouseClicked

    private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
         deposit_amount.setText(deposit_amount.getText() + "9");
    }//GEN-LAST:event_lbl9MouseClicked

    private void lbl0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl0MouseClicked
          deposit_amount.setText(deposit_amount.getText() + "0");
    }//GEN-LAST:event_lbl0MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       
        int length = deposit_amount.getText().length();
            int number = deposit_amount.getText().length() - 1;
            String store;
            if (length > 0) {
                StringBuilder back = new StringBuilder(deposit_amount.getText());
                back.deleteCharAt(number);
                store = back.toString();
                deposit_amount.setText(store);
    }//GEN-LAST:event_jLabel1MouseClicked
    }
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      
         deposit_amount.setText("");
    }//GEN-LAST:event_jLabel3MouseClicked
    
    
    
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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deposit_amount;
    private javax.swing.JButton deposit_btn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
    // End of variables declaration//GEN-END:variables
}
