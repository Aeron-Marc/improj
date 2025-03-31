/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

/**
 *
 * @author leand
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
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

        signupPanel = new javax.swing.JPanel();
        loginTxt = new javax.swing.JLabel();
        confirmTXT = new javax.swing.JLabel();
        srcodeTXT = new javax.swing.JLabel();
        confirmTXTFLD = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        txtLbl = new javax.swing.JLabel();
        nameTXT = new javax.swing.JLabel();
        emailTXT = new javax.swing.JLabel();
        nameTXTFLD = new javax.swing.JTextField();
        srcodeTXTFLD = new javax.swing.JTextField();
        emailTXTFLD = new javax.swing.JTextField();
        passwordTXTFLD = new javax.swing.JTextField();
        passwordTXT = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        logoLbl = new javax.swing.JLabel();
        batstateuTXT = new javax.swing.JLabel();
        tneuTXT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signupPanel.setBackground(new java.awt.Color(204, 204, 204));
        signupPanel.setPreferredSize(new java.awt.Dimension(412, 450));
        signupPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginTxt.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        loginTxt.setText("Sign Up");
        signupPanel.add(loginTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, -1));

        confirmTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        confirmTXT.setText("Confirm Password:");
        signupPanel.add(confirmTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        srcodeTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        srcodeTXT.setText("SR-Code:");
        signupPanel.add(srcodeTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        confirmTXTFLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTXTFLDActionPerformed(evt);
            }
        });
        signupPanel.add(confirmTXTFLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 250, 30));

        loginBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(204, 0, 51));
        loginBtn.setText("Login");
        signupPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, -1, -1));

        signupBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        signupBtn.setText("Sign up");
        signupPanel.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        txtLbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtLbl.setText("Already have an account?");
        signupPanel.add(txtLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 140, 30));

        nameTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        nameTXT.setText("Name:");
        signupPanel.add(nameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        emailTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        emailTXT.setText("Email:");
        signupPanel.add(emailTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        nameTXTFLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTXTFLDActionPerformed(evt);
            }
        });
        signupPanel.add(nameTXTFLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 210, 30));

        srcodeTXTFLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcodeTXTFLDActionPerformed(evt);
            }
        });
        signupPanel.add(srcodeTXTFLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 150, 30));

        emailTXTFLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTXTFLDActionPerformed(evt);
            }
        });
        signupPanel.add(emailTXTFLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 250, 30));

        passwordTXTFLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTXTFLDActionPerformed(evt);
            }
        });
        signupPanel.add(passwordTXTFLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 250, 30));

        passwordTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        passwordTXT.setText("Password:");
        signupPanel.add(passwordTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        getContentPane().add(signupPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 520, 640));

        background.setBackground(new java.awt.Color(204, 0, 0));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/logo 2.png"))); // NOI18N
        background.add(logoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        batstateuTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        batstateuTXT.setForeground(new java.awt.Color(255, 255, 255));
        batstateuTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batstateuTXT.setText("BATANGAS STATE UNIVERSITY");
        background.add(batstateuTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, -1));

        tneuTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        tneuTXT.setForeground(new java.awt.Color(255, 255, 255));
        tneuTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tneuTXT.setText("The National Engineering University");
        background.add(tneuTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 250, 20));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmTXTFLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTXTFLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmTXTFLDActionPerformed

    private void nameTXTFLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTXTFLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTXTFLDActionPerformed

    private void srcodeTXTFLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcodeTXTFLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srcodeTXTFLDActionPerformed

    private void emailTXTFLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTXTFLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTXTFLDActionPerformed

    private void passwordTXTFLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTXTFLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTXTFLDActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel batstateuTXT;
    private javax.swing.JLabel confirmTXT;
    private javax.swing.JTextField confirmTXTFLD;
    private javax.swing.JLabel emailTXT;
    private javax.swing.JTextField emailTXTFLD;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginTxt;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JLabel nameTXT;
    private javax.swing.JTextField nameTXTFLD;
    private javax.swing.JLabel passwordTXT;
    private javax.swing.JTextField passwordTXTFLD;
    private javax.swing.JButton signupBtn;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JLabel srcodeTXT;
    private javax.swing.JTextField srcodeTXTFLD;
    private javax.swing.JLabel tneuTXT;
    private javax.swing.JLabel txtLbl;
    // End of variables declaration//GEN-END:variables
}
