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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adon
 */
public class Changepin extends javax.swing.JFrame {

    /**
     * Creates new form Changepin
     */
    public Changepin() {
        initComponents();

    }

    int myaccNumbr;

    public Changepin(int accNu) {
        initComponents();
        setLocationRelativeTo(null);
        myaccNumbr = accNu;

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
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        confirmnew_pin = new javax.swing.JTextField();
        new_pin = new javax.swing.JTextField();
        old_pin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl0 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button2/newBackbutton.png"))); // NOI18N
        jButton2.setText("Return ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(127, 71, 30), 5, true), "Change Pin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 1, 32), new java.awt.Color(127, 71, 30))); // NOI18N

        jButton4.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button2/icons8-password-reset-32.png"))); // NOI18N
        jButton4.setText("Change pin");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        confirmnew_pin.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N

        new_pin.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N

        old_pin.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setText("Old pin");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setText("New pin");

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel1.setText("Confirm Pin");

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(11).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        lbl0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60.png"))); // NOI18N
        lbl0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl0MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/Square44x44Logo.targetsize-60(10).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
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
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(lbl0)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7))))
                    .addComponent(confirmnew_pin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(new_pin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(old_pin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(187, 187, 187))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(old_pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(new_pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmnew_pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(jLabel6)
                    .addComponent(lbl0)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(64, 27, 79));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/model/image/bank3.png"))); // NOI18N
        jLabel4.setText("First State National Bank Limited");

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Change your Pin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

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

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        /*if(new_pin.getText().isEmpty() || confirmnew_pin.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Any of your pin field can't be empty");
        }else if(!new_pin.getText().equals(confirmnew_pin.getText())){
            JOptionPane.showMessageDialog(this, "new pin and confirm pin number is not match");       
        }else{
        
            try {
            Connection conn = DatabaseConnector.connect();
            String sql = "update account_table set pin=?  where account_num = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,Integer.valueOf(new_pin.getText()));
            pst.setInt(2, myaccNumbr);
            
           
            int rs = pst.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(rootPane, "Pin updated successfully");
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Pin updated failed");
            }

        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex);
        }
        
        }
         */
        
         if (old_pin.getText().isEmpty() || new_pin.getText().isEmpty() || confirmnew_pin.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please input your old pin , new pin & confirm pin");
                }
        
         else{
        int pin0 = Integer.parseInt(old_pin.getText());
        int pin1 = Integer.parseInt(new_pin.getText());
        int pin2 = Integer.parseInt(confirmnew_pin.getText());
        if (pin1 == pin2) {
            try {

                Connection conn = DatabaseConnector.connect();

                String oldp = "SELECT * FROM account_table WHERE account_num= '" + myaccNumbr + "' and pin='" + pin0 + "'";
                PreparedStatement pst = conn.prepareStatement(oldp);
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    String sql = "update account_table set pin='" + pin1 + "'  where account_num = '" + myaccNumbr + "'";
                    PreparedStatement k = conn.prepareStatement(sql);
                    int newrs = k.executeUpdate();
                    if (newrs > 0) {
                        JOptionPane.showMessageDialog(this, "Pin updated Successfully");
                    } else {
                        JOptionPane.showMessageDialog(this, "Pin updated failed");
                    }
                } else {

                    JOptionPane.showMessageDialog(this, "Old Pin is not correct");
                }

            }
            
            catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "new pin and confirm pin is not match");
        }
         }
        /*
        try {
            Connection conn = DatabaseConnector.connect();
            String sql = "update account_table set pin=?  where account_num = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, pin1);
            pst.setInt(2, myaccNumbr);
            
           
            int rs = pst.executeUpdate();
            if (rs == 1) {
                
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Pin updated failed");
            }

        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex);
        }
        
         */

    }//GEN-LAST:event_jButton4MouseClicked

    private void lbl1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lbl1ComponentAdded

    }//GEN-LAST:event_lbl1ComponentAdded

    private void lbl1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl1AncestorAdded

    }//GEN-LAST:event_lbl1AncestorAdded

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
        if (old_pin.hasFocus()) {
            old_pin.setText(old_pin.getText() + "1");
        }

        if (new_pin.hasFocus()) {

            new_pin.setText(new_pin.getText() + "1");
        }

        if (confirmnew_pin.hasFocus()) {

            confirmnew_pin.setText(confirmnew_pin.getText() + "1");
        }

    }//GEN-LAST:event_lbl1MouseClicked

    private void lbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MousePressed

    }//GEN-LAST:event_lbl1MousePressed

    private void lbl1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl1KeyPressed

    private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
        if (old_pin.hasFocus()) {
            old_pin.setText(old_pin.getText() + "2");
        }

        if (new_pin.hasFocus()) {

            new_pin.setText(new_pin.getText() + "2");
        }

        if (confirmnew_pin.hasFocus()) {

            confirmnew_pin.setText(confirmnew_pin.getText() + "2");
        }

    }//GEN-LAST:event_lbl2MouseClicked

    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
        if (old_pin.hasFocus()) {
            old_pin.setText(old_pin.getText() + "3");
        }

        if (new_pin.hasFocus()) {

            new_pin.setText(new_pin.getText() + "3");
        }

        if (confirmnew_pin.hasFocus()) {

            confirmnew_pin.setText(confirmnew_pin.getText() + "3");
        }
    }//GEN-LAST:event_lbl3MouseClicked

    private void lbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseClicked
        if (old_pin.hasFocus()) {
            old_pin.setText(old_pin.getText() + "4");
        }

        if (new_pin.hasFocus()) {

            new_pin.setText(new_pin.getText() + "4");
        }

        if (confirmnew_pin.hasFocus()) {

            confirmnew_pin.setText(confirmnew_pin.getText() + "4");
        }
    }//GEN-LAST:event_lbl4MouseClicked

    private void lbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseClicked
        if (old_pin.hasFocus()) {
            old_pin.setText(old_pin.getText() + "5");
        }

        if (new_pin.hasFocus()) {

            new_pin.setText(new_pin.getText() + "5");
        }

        if (confirmnew_pin.hasFocus()) {

            confirmnew_pin.setText(confirmnew_pin.getText() + "5");
        }
    }//GEN-LAST:event_lbl5MouseClicked

    private void lbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseClicked
        if (old_pin.hasFocus()) {
            old_pin.setText(old_pin.getText() + "6");
        }

        if (new_pin.hasFocus()) {

            new_pin.setText(new_pin.getText() + "6");
        }

        if (confirmnew_pin.hasFocus()) {

            confirmnew_pin.setText(confirmnew_pin.getText() + "6");
        }
    }//GEN-LAST:event_lbl6MouseClicked

    private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
        if (old_pin.hasFocus()) {
            old_pin.setText(old_pin.getText() + "7");
        }

        if (new_pin.hasFocus()) {

            new_pin.setText(new_pin.getText() + "7");
        }

        if (confirmnew_pin.hasFocus()) {

            confirmnew_pin.setText(confirmnew_pin.getText() + "7");
        }
    }//GEN-LAST:event_lbl7MouseClicked

    private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
        if (old_pin.hasFocus()) {
            old_pin.setText(old_pin.getText() + "8");
        }

        if (new_pin.hasFocus()) {

            new_pin.setText(new_pin.getText() + "8");
        }

        if (confirmnew_pin.hasFocus()) {

            confirmnew_pin.setText(confirmnew_pin.getText() + "8");
        }
    }//GEN-LAST:event_lbl8MouseClicked

    private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
        if (old_pin.hasFocus()) {
            old_pin.setText(old_pin.getText() + "9");
        }

        if (new_pin.hasFocus()) {

            new_pin.setText(new_pin.getText() + "9");
        }

        if (confirmnew_pin.hasFocus()) {

            confirmnew_pin.setText(confirmnew_pin.getText() + "9");
        }
    }//GEN-LAST:event_lbl9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (old_pin.hasFocus()) {
            int length = old_pin.getText().length();
            int number = old_pin.getText().length() - 1;
            String store;
            if (length > 0) {
                StringBuilder back = new StringBuilder(old_pin.getText());
                back.deleteCharAt(number);
                store = back.toString();
                old_pin.setText(store);

            }
        }

        if (new_pin.hasFocus()) {
            int length = new_pin.getText().length();
            int number = new_pin.getText().length() - 1;
            String store;
            if (length > 0) {
                StringBuilder back = new StringBuilder(new_pin.getText());
                back.deleteCharAt(number);
                store = back.toString();
                new_pin.setText(store);

            }
        }

        if (confirmnew_pin.hasFocus()) {
            int length = confirmnew_pin.getText().length();
            int number = confirmnew_pin.getText().length() - 1;
            String store;
            if (length > 0) {
                StringBuilder back = new StringBuilder(confirmnew_pin.getText());
                back.deleteCharAt(number);
                store = back.toString();
                confirmnew_pin.setText(store);

            }
        }


    }//GEN-LAST:event_jLabel6MouseClicked

    private void lbl0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl0MouseClicked
        if (old_pin.hasFocus()) {
            old_pin.setText(old_pin.getText() + "0");
        }

        if (new_pin.hasFocus()) {

            new_pin.setText(new_pin.getText() + "0");
        }

        if (confirmnew_pin.hasFocus()) {
            confirmnew_pin.setText(confirmnew_pin.getText() + "0");
        }
    }//GEN-LAST:event_lbl0MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        if (old_pin.hasFocus()) {
            old_pin.setText("");
        }

        if (new_pin.hasFocus()) {
            new_pin.setText("");

        }

        if (confirmnew_pin.hasFocus()) {
            confirmnew_pin.setText("");

        }
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Changepin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Changepin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Changepin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Changepin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Changepin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmnew_pin;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JTextField new_pin;
    private javax.swing.JTextField old_pin;
    // End of variables declaration//GEN-END:variables
}
