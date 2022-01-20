/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Splash {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        SplashForm sp = new SplashForm();
        sp.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {

                Thread.sleep(50);
                SplashForm.jLabel1.setText("" + i + " %");
                SplashForm.jProgressBar1.setValue(i);
                if (i == 100) {
                    Login login = new Login();
                    sp.setVisible(false);
                    login.setVisible(true);
                }
            }

        } catch (InterruptedException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

    }
}
