/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import com.mysql.cj.xdevapi.Statement;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import main.DBConnector;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.sql.Connection;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.RoundingMode;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mary Jhezl
 */
public class AddStudent extends javax.swing.JFrame {
    private byte[] selectedImageData = null;

      private byte[] profilePictureBytes;

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
        loadProgramsAndTracks();
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

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        profileTXT1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        programTXT = new javax.swing.JLabel();
        nameTXT = new javax.swing.JLabel();
        srcodeTXT = new javax.swing.JLabel();
        srcodeFld = new javax.swing.JTextField();
        nameFld = new javax.swing.JTextField();
        addressTXT = new javax.swing.JLabel();
        addressFld = new javax.swing.JTextField();
        lblProfilePic = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        programm = new javax.swing.JComboBox<>();
        imagelbl = new javax.swing.JLabel();
        imagechooserbtn = new javax.swing.JButton();
        emailTXT = new javax.swing.JLabel();
        emailFld = new javax.swing.JTextField();
        srcodeTXT1 = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox<>();
        srcodeTXT2 = new javax.swing.JLabel();
        cmbSex = new javax.swing.JComboBox<>();
        trackTXT = new javax.swing.JLabel();
        TRACK = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 850));
        setPreferredSize(new java.awt.Dimension(500, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(152, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        profileTXT1.setBackground(new java.awt.Color(255, 255, 255));
        profileTXT1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        profileTXT1.setForeground(new java.awt.Color(255, 255, 255));
        profileTXT1.setText("Add Student");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(profileTXT1)
                .addContainerGap(962, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileTXT1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1120, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 841));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        programTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        programTXT.setText("Program:");
        jPanel1.add(programTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 30));

        nameTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        nameTXT.setText("Name:");
        jPanel1.add(nameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        srcodeTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        srcodeTXT.setText("SR-Code:");
        jPanel1.add(srcodeTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        srcodeFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcodeFldActionPerformed(evt);
            }
        });
        jPanel1.add(srcodeFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 150, -1));
        jPanel1.add(nameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 250, -1));

        addressTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        addressTXT.setText("Address:");
        jPanel1.add(addressTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        addressFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFldActionPerformed(evt);
            }
        });
        jPanel1.add(addressFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, 370, -1));

        lblProfilePic.setPreferredSize(new java.awt.Dimension(190, 180));
        jPanel1.add(lblProfilePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        saveBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 790, 91, -1));

        cancelBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 790, 91, -1));

        programm.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        programm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", " ", " ", " ", " " }));
        jPanel1.add(programm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 370, 30));

        imagelbl.setBackground(new java.awt.Color(102, 102, 102));
        imagelbl.setForeground(new java.awt.Color(255, 255, 204));
        imagelbl.setOpaque(true);
        jPanel1.add(imagelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 190));

        imagechooserbtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        imagechooserbtn.setText("Choose Image");
        imagechooserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagechooserbtnActionPerformed(evt);
            }
        });
        jPanel1.add(imagechooserbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 140, 30));

        emailTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        emailTXT.setText("Email:");
        jPanel1.add(emailTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, -1, -1));
        jPanel1.add(emailFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 730, 370, -1));

        srcodeTXT1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        srcodeTXT1.setText("Sex:");
        jPanel1.add(srcodeTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, 20));

        cmbYear.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "First", "Second", "Third", "Fourth" }));
        jPanel1.add(cmbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 150, -1));

        srcodeTXT2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        srcodeTXT2.setText("Year:");
        jPanel1.add(srcodeTXT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, 30));

        cmbSex.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        cmbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(cmbSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, -1));

        trackTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        trackTXT.setText("Track:");
        jPanel1.add(trackTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 50, -1));

        TRACK.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jPanel1.add(TRACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 370, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 500, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
     String newSrcode = srcodeFld.getText();
    String newName = nameFld.getText();
    String newAddress = addressFld.getText();
    String newProgram = programm.getSelectedItem().toString();
    String newTrack = TRACK.getSelectedItem().toString();
    String newEmail = emailFld.getText();
    String newSex = cmbSex.getSelectedItem().toString();
    String newYear = cmbYear.getSelectedItem().toString();

    byte[] newProfilePic = selectedImageData; // Set this from the button or wherever you set the profile image.

    // Ensure that all required fields are filled
    if (newSrcode.isEmpty() || newName.isEmpty() || newAddress.isEmpty() || newEmail.isEmpty() ||
        newSex.isEmpty() || newYear.isEmpty() || newProfilePic == null) {  // Ensure profile picture is selected
        JOptionPane.showMessageDialog(this, "Please fill in all fields, including profile picture!");
        return;
    }

    // Prepare the confirmation dialog message
    StringBuilder details = new StringBuilder("Please confirm the following details to add:\n");
    details.append("SR Code: ").append(newSrcode).append("\n");
    details.append("Name: ").append(newName).append("\n");
    details.append("Address: ").append(newAddress).append("\n");
    details.append("Program: ").append(newProgram).append("\n");
    details.append("Track: ").append(newTrack).append("\n");
    details.append("Email: ").append(newEmail).append("\n");
    details.append("Sex: ").append(newSex).append("\n");
    details.append("Year Level: ").append(newYear).append("\n");

    // Show confirmation dialog
    int confirm = JOptionPane.showConfirmDialog(this, details.toString(), "Confirm Add", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.NO_OPTION) {
        return;
    }

    // Database connection and transaction management
    try (Connection conn = DBConnector.getConnection()) {
        // Start transaction
        conn.setAutoCommit(false);  

        // Insert student into the 'students' table
        String sqlInsertStudent = "INSERT INTO students (srcode, student_name, address, email, sex, year, pic) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmtInsertStudent = conn.prepareStatement(sqlInsertStudent)) {
            pstmtInsertStudent.setString(1, newSrcode);
            pstmtInsertStudent.setString(2, newName);
            pstmtInsertStudent.setString(3, newAddress);
            pstmtInsertStudent.setString(4, newEmail);
            pstmtInsertStudent.setString(5, newSex);
            pstmtInsertStudent.setString(6, newYear);
            pstmtInsertStudent.setBytes(7, newProfilePic);

            int rowsInserted = pstmtInsertStudent.executeUpdate();

            // Check if student insertion was successful
            if (rowsInserted > 0) {
                // Add student_track relation
                String sqlInsertTrack = "INSERT INTO student_track (student_id, track_id) VALUES ((SELECT student_id FROM students WHERE srcode = ?), (SELECT track_id FROM tracks WHERE track_name = ?))";
                try (PreparedStatement pstmtInsertTrack = conn.prepareStatement(sqlInsertTrack)) {
                    pstmtInsertTrack.setString(1, newSrcode);
                    pstmtInsertTrack.setString(2, newTrack);
                    pstmtInsertTrack.executeUpdate();
                }

                // Add track_program relation
                String sqlInsertProgram = "INSERT INTO track_program (track_id, program_id) VALUES ((SELECT track_id FROM tracks WHERE track_name = ?), (SELECT program_id FROM programs WHERE program_name = ?))";
                try (PreparedStatement pstmtInsertProgram = conn.prepareStatement(sqlInsertProgram)) {
                    pstmtInsertProgram.setString(1, newTrack);
                    pstmtInsertProgram.setString(2, newProgram);
                    pstmtInsertProgram.executeUpdate();
                }

                // Commit transaction
                conn.commit();
                JOptionPane.showMessageDialog(this, "Student added successfully.");
            } else {
                // Insertion failed, rollback transaction
                conn.rollback();
                JOptionPane.showMessageDialog(this, "Failed to add student.");
            }
        } catch (SQLException e) {
            // In case of an error, show the error message and rollback the transaction
            conn.rollback();
            JOptionPane.showMessageDialog(this, "Error adding student: " + e.getMessage());
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage());
    }


    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void imagechooserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagechooserbtnActionPerformed
       // TODO add your handling code here:
         JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Choose Profile Picture");
    fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg"));

    int userSelection = fileChooser.showOpenDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();

        try {
            // Convert image to byte[]
            FileInputStream fis = new FileInputStream(selectedFile);
            selectedImageData = new byte[(int) selectedFile.length()];
            fis.read(selectedImageData);
            fis.close();

            // Display the selected image in JLabel
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            Image image = imageIcon.getImage().getScaledInstance(lblProfilePic.getWidth(), lblProfilePic.getHeight(), Image.SCALE_SMOOTH);
            lblProfilePic.setIcon(new ImageIcon(image));

            JOptionPane.showMessageDialog(this, "Profile picture updated! Click 'Save' to save changes.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage());
        }   
    }
    }//GEN-LAST:event_imagechooserbtnActionPerformed

    private void addressFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFldActionPerformed

    private void srcodeFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcodeFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srcodeFldActionPerformed
private void loadProgramsAndTracks() {
    try {
        // Clear existing items
        programm.removeAllItems();
        TRACK.removeAllItems();
        
        // Load Programs from the Database
        Connection conn = DBConnector.getConnection();
        String sqlPrograms = "SELECT program_name FROM programs";
        PreparedStatement pstmtPrograms = conn.prepareStatement(sqlPrograms);
        ResultSet rsPrograms = pstmtPrograms.executeQuery();

        while (rsPrograms.next()) {
            programm.addItem(rsPrograms.getString("program_name"));  // Add each program to the JComboBox
        }

        // Load Tracks from the Database
        String sqlTracks = "SELECT track_name FROM tracks";
        PreparedStatement pstmtTracks = conn.prepareStatement(sqlTracks);
        ResultSet rsTracks = pstmtTracks.executeQuery();

        while (rsTracks.next()) {
            TRACK.addItem(rsTracks.getString("track_name"));  // Add each track to the JComboBox
        }

        rsPrograms.close();
        rsTracks.close();
        pstmtPrograms.close();
        pstmtTracks.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TRACK;
    private javax.swing.JTextField addressFld;
    private javax.swing.JLabel addressTXT;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> cmbSex;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JTextField emailFld;
    private javax.swing.JLabel emailTXT;
    private javax.swing.JButton imagechooserbtn;
    private javax.swing.JLabel imagelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblProfilePic;
    private javax.swing.JTextField nameFld;
    private javax.swing.JLabel nameTXT;
    private javax.swing.JLabel profileTXT1;
    private javax.swing.JLabel programTXT;
    private javax.swing.JComboBox<String> programm;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField srcodeFld;
    private javax.swing.JLabel srcodeTXT;
    private javax.swing.JLabel srcodeTXT1;
    private javax.swing.JLabel srcodeTXT2;
    private javax.swing.JLabel trackTXT;
    // End of variables declaration//GEN-END:variables
}
