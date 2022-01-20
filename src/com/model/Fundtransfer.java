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
import javax.swing.JOptionPane;

/**
 *
 * @author Adon
 */
public class Fundtransfer extends javax.swing.JFrame {

    /**
     * Creates new form Fundtransfer
     */
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        transfer_amount = new javax.swing.JTextField();
        transfer_accno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jButton2.setText("Return to Dashboard");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Transfer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel1.setText("Enter existing user's account number");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setText("Amount");

        transfer_amount.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N

        transfer_accno.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(394, 394, 394))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transfer_accno, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transfer_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfer_accno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfer_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        int desired_acc = Integer.parseInt(transfer_accno.getText());

        if (transfer_amount.getText().isEmpty() || transfer_amount.getText().equals(0)) {

            JOptionPane.showMessageDialog(null, "Enter a valid amount");
        }else if(desired_acc == myaccNumbr){
            JOptionPane.showMessageDialog(this , "You can not transfer money in your own account");
        } 
        
        
        else if (oldBl < Integer.valueOf(transfer_amount.getText())) {
            JOptionPane.showMessageDialog(this, "Fund Transfer failed! Insufficient Balance ");

        } else {

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField transfer_accno;
    private javax.swing.JTextField transfer_amount;
    // End of variables declaration//GEN-END:variables
}
