/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import main.Users;
import main.DBConnector;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.awt.event.KeyEvent;
/**
 *
 * @author leand
 */
public class login extends javax.swing.JFrame {
    Users users;
    private String srcode;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtsrcode = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();
        signupBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        loginTxt1 = new javax.swing.JLabel();
        batstateuTXT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel1.setText("Password:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel2.setText("SR-Code:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtsrcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsrcodeActionPerformed(evt);
            }
        });
        txtsrcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsrcodeKeyPressed(evt);
            }
        });
        jPanel2.add(txtsrcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 330, -1));

        loginBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel2.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        check.setText("Show Password");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel2.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 140, 20));

        signupBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(204, 0, 0));
        signupBtn.setText("Sign up");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        jPanel2.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel3.setText("I don't have an account?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 140, 30));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 330, -1));

        loginTxt1.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        loginTxt1.setText("Please Login");
        jPanel2.add(loginTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 450, 560));

        batstateuTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        batstateuTXT.setForeground(new java.awt.Color(255, 255, 255));
        batstateuTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batstateuTXT.setText("BATANGAS STATE UNIVERSITY");
        getContentPane().add(batstateuTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 42, 250, 20));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("The National Engineering University");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 230, -1));

        jPanel1.setBackground(new java.awt.Color(124, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/logo bsu.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mary Jhezl\\Pictures\\batstateu-redspartan-e1602756308679.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsrcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsrcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcodeActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
         if(check.isSelected()){
            txtPassword.setEchoChar((char)0);
        }else{
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupBtnActionPerformed

    private void txtsrcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsrcodeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtsrcodeKeyPressed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
         String srcode = txtsrcode.getText();
    String password = new String(txtPassword.getPassword());

    DBConnector db = new DBConnector();
   
    boolean isValid = db.validateLogin(srcode, password);
    
    if (isValid) {
    int userId = db.getUserId(srcode);
    String fullname = db.getFullname(srcode);
    String usertype = db.getUserType(srcode); 
    
    LoginSession.setUserId(userId);
    LoginSession.setSrcode(srcode);
    LoginSession.setFullname(fullname);
    LoginSession.setUsertype(usertype); 
    
    new mainui(LoginSession.getSrcode(), LoginSession.getUserId(), LoginSession.getFullname(), LoginSession.getUsertype()).setVisible(true);
    this.dispose();

    } else {
        JOptionPane.showMessageDialog(this, "Invalid username or password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_loginBtnActionPerformed
    public class LoginSession {
    private static int userId;
    private static String srcode;
    private static String fullname;
    private static String usertype;

    public static void setUserId(int id) { userId = id; }
    public static int getUserId() { return userId; }

    public static void setSrcode(String code) { srcode = code; }
    public static String getSrcode() { return srcode; }

    public static void setFullname(String name) { fullname = name; }
    public static String getFullname() { return fullname; }

    public static void setUsertype(String type) { usertype = type; }
    public static String getUsertype() { return usertype; }
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batstateuTXT;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginTxt1;
    private javax.swing.JButton signupBtn;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtsrcode;
    // End of variables declaration//GEN-END:variables
}
