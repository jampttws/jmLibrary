/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author narissingngam
 * @author Tanasorn Tritawisup
 */
public class sign extends javax.swing.JFrame {

    /**
     * Creates new form sign
     */
    public sign() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        repass = new javax.swing.JPasswordField();
        exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Zapfino", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JM Library");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 520, 130));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, 40));

        username.setText("\n");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 470, 40));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 470, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        repass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repassActionPerformed(evt);
            }
        });
        getContentPane().add(repass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 470, 40));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/pic/xx.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/pic/login new.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

            
            
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = username.getText();
        String pass1 = new String(pass.getPassword());
        String rep = new String(repass.getPassword());
        String pass = "";
        if(pass1.equals(rep)){
            pass = pass1;
            try {
                signup.write(user, pass);
                new login().setVisible(true);
                this.dispose();
                
            } catch (IOException ex) {
                Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed

    }//GEN-LAST:event_passActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
  
    }//GEN-LAST:event_usernameActionPerformed

    private void repassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repassActionPerformed

        
    }//GEN-LAST:event_repassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        
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
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField repass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
