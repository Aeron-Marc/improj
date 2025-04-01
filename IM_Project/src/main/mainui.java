/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import main.login.LoginSession;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.sql.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import main.DBConnector;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.general.*;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.axis.NumberTickUnit;



/**
 *
 * @author leand
 */
public class mainui extends javax.swing.JFrame {
       private DefaultPieDataset dataset;
    private Timer timer;
    
      private DefaultCategoryDataset datasett;
    private JLabel totalEnrolleesLabel; 

      private DefaultTableModel studentstablemodel;
        private DefaultTableModel curitablemodel;
      private DefaultTableModel userstablemodel;
    private byte[] selectedImageData = null;
private int selectedStudentID = -1; // Default value kapag walang napili

      private byte[] profilePictureBytes;
    
    private String srcode;
    private int userId;
    private String fullname;
    private String usertype;
    // Declare this variable at the class level
private int currentCourseId;


    /**
     * Creates new form mainui
     */
     //"23-73079", 1, "Dorina Cables", "Administrator"


    public mainui(String username, int userId, String fullname, String usertype) {
     initComponents();
   this.srcode = username;
    this.userId = userId;
    this.fullname = fullname;
    this.usertype = usertype;
    addPieChart(); 
 
    addBarChart();

    welcome.setText(fullname + " (" + usertype + ")");   
    
     if (usertype.equalsIgnoreCase("Evaluator")) {
            usersBtn.setEnabled(false);
        }
    this.setLocationRelativeTo(null);
    
    studentstablemodel = new DefaultTableModel();
        studentstablemodel.addColumn("Student ID");
        studentstablemodel.addColumn("SR Code");
        studentstablemodel.addColumn("Name");
        studentstablemodel.addColumn("Sex");
        studentstablemodel.addColumn("Year");
        studentstablemodel.addColumn("Address");
        studentstablemodel.addColumn("Email");
        

        tblstuds.setModel(studentstablemodel);

        loadStudentsToTable();
        loadProgramsAndTracks();
        loadProgramsTracksAndDepartmentsinPanel();
        loadProgramsTracksAndDepartments();
        
        userstablemodel = new DefaultTableModel();  
        userstablemodel.addColumn("SR Code"); 
        userstablemodel.addColumn("Usertype");      
        userstablemodel.addColumn("Full Name");  
        userstablemodel.addColumn("Email"); 
        tblusers.setModel(userstablemodel);
        
        loadUsersToTable();
        
         curitablemodel = new DefaultTableModel();
        curitablemodel.addColumn("Student Name");
        curitablemodel.addColumn("Department Name");
        curitablemodel.addColumn("Program Name");
        curitablemodel.addColumn("Track Name");
     
        

        curriculumTable.setModel(curitablemodel);

        

        loadCurriculumTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        adminPanel = new javax.swing.JPanel();
        maroonbckgrnd = new javax.swing.JPanel();
        bsulogo = new javax.swing.JLabel();
        batstateuLbl1 = new javax.swing.JLabel();
        tneuLbl = new javax.swing.JLabel();
        batstateuLbl = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        adminTabbedpane = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        coursesTotalPanel = new javax.swing.JPanel();
        studentsTotalPanel = new javax.swing.JPanel();
        studentTXT = new javax.swing.JLabel();
        homeTXT = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        searchTxt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblstuds = new javax.swing.JTable();
        txtsearchh = new javax.swing.JTextField();
        searchBtn1 = new javax.swing.JButton();
        profilePanel2 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        lblProfilePic = new javax.swing.JLabel();
        srcodeTXT = new javax.swing.JLabel();
        addressTXT = new javax.swing.JLabel();
        emailTXT = new javax.swing.JLabel();
        programTXT = new javax.swing.JLabel();
        profileTXT = new javax.swing.JLabel();
        nameTXT = new javax.swing.JLabel();
        nameFld = new javax.swing.JTextField();
        addressFld = new javax.swing.JTextField();
        emailFld1 = new javax.swing.JTextField();
        srcodeFld = new javax.swing.JTextField();
        srcodeTXT1 = new javax.swing.JLabel();
        srcodeTXT2 = new javax.swing.JLabel();
        cmbSex = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        programTXT1 = new javax.swing.JLabel();
        srcodeTXT3 = new javax.swing.JLabel();
        studid = new javax.swing.JLabel();
        TRACK = new javax.swing.JComboBox<>();
        programm = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        profileTXT1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        coursesPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        coursesTable = new javax.swing.JTable();
        coursesTXT = new javax.swing.JLabel();
        addBtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        trck = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        prgrm = new javax.swing.JComboBox<>();
        coursesPANEL = new javax.swing.JPanel();
        addressTXT1 = new javax.swing.JLabel();
        nameTXT1 = new javax.swing.JLabel();
        srcodeTXT6 = new javax.swing.JLabel();
        programTXT3 = new javax.swing.JLabel();
        srcodeTXT7 = new javax.swing.JLabel();
        coursesTXT1 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        prerequisiteField = new javax.swing.JTextField();
        programule = new javax.swing.JComboBox<>();
        deptule = new javax.swing.JComboBox<>();
        trackule = new javax.swing.JComboBox<>();
        srcodeTXT9 = new javax.swing.JLabel();
        srcodeTXT10 = new javax.swing.JLabel();
        srcodeTXT11 = new javax.swing.JLabel();
        srcodeTXT12 = new javax.swing.JLabel();
        txtCourseCode1 = new javax.swing.JTextField();
        unitsField = new javax.swing.JTextField();
        hoursLecField = new javax.swing.JTextField();
        hoursLabField = new javax.swing.JTextField();
        corequisiteField = new javax.swing.JTextField();
        sem = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        srcodeTXT13 = new javax.swing.JLabel();
        srcodeTXT14 = new javax.swing.JLabel();
        srcodeTXT15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dept = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        curriculumPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        curriculumTable = new javax.swing.JTable();
        printcurriculumBtn = new javax.swing.JButton();
        printblankBtn = new javax.swing.JButton();
        curriculumTXT = new javax.swing.JLabel();
        gradesPanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        gradesTXT = new javax.swing.JLabel();
        reportsPanel = new javax.swing.JPanel();
        reportsTXT = new javax.swing.JLabel();
        usersPanel = new javax.swing.JPanel();
        settingsTXT = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        searchTxt1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblusers = new javax.swing.JTable();
        searchBtn2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        profilePanel3 = new javax.swing.JPanel();
        passwordTXT = new javax.swing.JLabel();
        emailTXT1 = new javax.swing.JLabel();
        profileTXT2 = new javax.swing.JLabel();
        fullnameTXT = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSRCode = new javax.swing.JTextField();
        typeTXT = new javax.swing.JLabel();
        cmbUserType = new javax.swing.JComboBox<>();
        srcodeTXT16 = new javax.swing.JLabel();
        editBtn1 = new javax.swing.JButton();
        addBtn3 = new javax.swing.JButton();
        buttonsPanel = new javax.swing.JPanel();
        usersBtn = new javax.swing.JButton();
        homeBtn1 = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        coursesBtb = new javax.swing.JButton();
        curriculumBtn = new javax.swing.JButton();
        gradesBtn = new javax.swing.JButton();
        reportsBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 900));
        setPreferredSize(new java.awt.Dimension(1440, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminPanel.setMaximumSize(new java.awt.Dimension(1440, 900));
        adminPanel.setMinimumSize(new java.awt.Dimension(1440, 900));
        adminPanel.setPreferredSize(new java.awt.Dimension(0, 0));
        adminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        maroonbckgrnd.setBackground(new java.awt.Color(128, 0, 0));
        maroonbckgrnd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bsulogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/logo bsu.png"))); // NOI18N
        maroonbckgrnd.add(bsulogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 140));

        batstateuLbl1.setBackground(new java.awt.Color(255, 255, 255));
        batstateuLbl1.setFont(new java.awt.Font("Serif", 1, 60)); // NOI18N
        batstateuLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batstateuLbl1.setText("BATANGAS STATE UNIVERSITY");
        maroonbckgrnd.add(batstateuLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 1100, 50));

        tneuLbl.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        tneuLbl.setForeground(new java.awt.Color(153, 0, 0));
        tneuLbl.setText("The National Engineering University");
        maroonbckgrnd.add(tneuLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        batstateuLbl.setBackground(new java.awt.Color(255, 255, 255));
        batstateuLbl.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        batstateuLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batstateuLbl.setText("ARASOF - Nasugbu Campus");
        maroonbckgrnd.add(batstateuLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 490, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/photo.png"))); // NOI18N
        maroonbckgrnd.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 180));

        adminPanel.add(maroonbckgrnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 200));

        homePanel.setBackground(new java.awt.Color(204, 204, 204));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coursesTotalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        coursesTotalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        homePanel.add(coursesTotalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 550, 410));

        studentsTotalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        studentsTotalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        studentTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentTXT.setText("Students");
        studentsTotalPanel.add(studentTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, 40));

        homePanel.add(studentsTotalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 550, 410));

        homeTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        homeTXT.setText("Home");
        homePanel.add(homeTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("User: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        welcome.setText("jLabel2");
        jPanel1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        homePanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 230, -1));

        adminTabbedpane.addTab("Home", homePanel);

        profilePanel.setBackground(new java.awt.Color(204, 204, 204));
        profilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchTxt.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        searchTxt.setText("Search:");
        profilePanel.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        tblstuds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "SR-Code", "Name", "Sex", "Year", "Address", "Email"
            }
        ));
        tblstuds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstudsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblstuds);
        if (tblstuds.getColumnModel().getColumnCount() > 0) {
            tblstuds.getColumnModel().getColumn(0).setHeaderValue("Student ID");
            tblstuds.getColumnModel().getColumn(5).setHeaderValue("Address");
        }

        profilePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 660, 360));

        txtsearchh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchhActionPerformed(evt);
            }
        });
        profilePanel.add(txtsearchh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 370, -1));

        searchBtn1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        searchBtn1.setText("Search");
        searchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn1ActionPerformed(evt);
            }
        });
        profilePanel.add(searchBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        profilePanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profilePanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(102, 102, 102));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProfilePic.setPreferredSize(new java.awt.Dimension(190, 180));
        panel.add(lblProfilePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        profilePanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 190, 180));

        srcodeTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        srcodeTXT.setText("Student ID:");
        profilePanel2.add(srcodeTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        addressTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        addressTXT.setText("Address:");
        profilePanel2.add(addressTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        emailTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        emailTXT.setText("Email:");
        profilePanel2.add(emailTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 90, -1));

        programTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        programTXT.setText("Track: ");
        profilePanel2.add(programTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        profileTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 31)); // NOI18N
        profileTXT.setText("Students Information");
        profilePanel2.add(profileTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        nameTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        nameTXT.setText("Name:");
        profilePanel2.add(nameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));
        profilePanel2.add(nameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 270, -1));

        addressFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFldActionPerformed(evt);
            }
        });
        profilePanel2.add(addressFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 340, -1));
        profilePanel2.add(emailFld1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 340, -1));
        profilePanel2.add(srcodeFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, -1));

        srcodeTXT1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        srcodeTXT1.setText("Sex:");
        profilePanel2.add(srcodeTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, 30));

        srcodeTXT2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        srcodeTXT2.setText("Year:");
        profilePanel2.add(srcodeTXT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 30));

        cmbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        profilePanel2.add(cmbSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First", "Second", "Third", "Fourth" }));
        cmbYear.setSelectedIndex(-1);
        profilePanel2.add(cmbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        profilePanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 90, 30));

        jButton2.setText("Choose Image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        profilePanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 210, 150, -1));

        programTXT1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        programTXT1.setText("Program:");
        profilePanel2.add(programTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        srcodeTXT3.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        srcodeTXT3.setText("SR-Code:");
        profilePanel2.add(srcodeTXT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        studid.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        profilePanel2.add(studid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, 40));

        TRACK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TRACK.setSelectedIndex(-1);
        profilePanel2.add(TRACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 340, -1));

        programm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        profilePanel2.add(programm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 340, -1));

        profilePanel.add(profilePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 640, 520));

        addBtn.setBackground(new java.awt.Color(0, 255, 0));
        addBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        profilePanel.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 120, -1));

        profileTXT1.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        profileTXT1.setText("Students Profile");
        profilePanel.add(profileTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        profilePanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        adminTabbedpane.addTab("StudentsProfile", profilePanel);

        coursesPanel.setBackground(new java.awt.Color(204, 204, 204));
        coursesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Course Code", "Course Name"
            }
        ));
        coursesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(coursesTable);

        coursesPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 690, 380));

        coursesTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        coursesTXT.setText("Courses");
        coursesPanel.add(coursesTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        addBtn1.setBackground(new java.awt.Color(0, 255, 0));
        addBtn1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        addBtn1.setText("Add");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });
        coursesPanel.add(addBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 510, 120, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel2.setText("Program:");
        coursesPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        trck.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        trck.setSelectedIndex(-1);
        coursesPanel.add(trck, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 250, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel3.setText("Track:");
        coursesPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 30));

        prgrm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        prgrm.setSelectedIndex(-1);
        prgrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prgrmActionPerformed(evt);
            }
        });
        coursesPanel.add(prgrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 300, -1));

        coursesPANEL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        coursesPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addressTXT1.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        addressTXT1.setText("Track:");
        coursesPANEL.add(addressTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        nameTXT1.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        nameTXT1.setText("Course Name:");
        coursesPANEL.add(nameTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 30));

        srcodeTXT6.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        srcodeTXT6.setText("Prerequisite:");
        coursesPANEL.add(srcodeTXT6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, 30));

        programTXT3.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        programTXT3.setText("Program:");
        coursesPANEL.add(programTXT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        srcodeTXT7.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        srcodeTXT7.setText("Department:");
        coursesPANEL.add(srcodeTXT7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        coursesTXT1.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        coursesTXT1.setText("Course Information");
        coursesPANEL.add(coursesTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
        coursesPANEL.add(txtCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 300, -1));
        coursesPANEL.add(prerequisiteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 110, -1));

        programule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        programule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programuleActionPerformed(evt);
            }
        });
        coursesPANEL.add(programule, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 300, -1));

        deptule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        deptule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptuleActionPerformed(evt);
            }
        });
        coursesPANEL.add(deptule, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 300, -1));

        trackule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        coursesPANEL.add(trackule, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 300, -1));

        srcodeTXT9.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        srcodeTXT9.setText("Units:");
        coursesPANEL.add(srcodeTXT9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        srcodeTXT10.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        srcodeTXT10.setText("Lec Hours:");
        coursesPANEL.add(srcodeTXT10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, 30));

        srcodeTXT11.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        srcodeTXT11.setText("Lab Hours:");
        coursesPANEL.add(srcodeTXT11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, 30));

        srcodeTXT12.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        srcodeTXT12.setText("Corequisite:");
        coursesPANEL.add(srcodeTXT12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, 30));
        coursesPANEL.add(txtCourseCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, -1));
        coursesPANEL.add(unitsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 60, -1));
        coursesPANEL.add(hoursLecField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 60, -1));
        coursesPANEL.add(hoursLabField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 60, -1));
        coursesPANEL.add(corequisiteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 110, -1));

        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First", "Second" }));
        coursesPANEL.add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 130, -1));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First", "Second", "Third", "Fourth" }));
        coursesPANEL.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 120, 30));

        srcodeTXT13.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        srcodeTXT13.setText("Course Code:");
        coursesPANEL.add(srcodeTXT13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        srcodeTXT14.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        srcodeTXT14.setText("Semester:");
        coursesPANEL.add(srcodeTXT14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, 30));

        srcodeTXT15.setFont(new java.awt.Font("Yu Gothic UI", 1, 17)); // NOI18N
        srcodeTXT15.setText("Year:");
        coursesPANEL.add(srcodeTXT15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 30));

        coursesPanel.add(coursesPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 620, 480));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel4.setText("Department:");
        coursesPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, 30));

        dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dept.setSelectedIndex(-1);
        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });
        coursesPanel.add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 370, -1));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton4.setText("Show");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        coursesPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 90, -1));

        clearBtn.setBackground(new java.awt.Color(255, 255, 102));
        clearBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        coursesPanel.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 510, 110, -1));

        adminTabbedpane.addTab("Courses", coursesPanel);

        curriculumPanel.setBackground(new java.awt.Color(204, 204, 204));
        curriculumPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        curriculumTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane5.setViewportView(curriculumTable);

        curriculumPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 1240, 410));

        printcurriculumBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        printcurriculumBtn.setText("PRINT ACTUAL CURRICULUM");
        curriculumPanel.add(printcurriculumBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 270, -1));

        printblankBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        printblankBtn.setText("PRINT BLANK CURRICULUM");
        curriculumPanel.add(printblankBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, 270, -1));

        curriculumTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        curriculumTXT.setText("Curriculum");
        curriculumPanel.add(curriculumTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        adminTabbedpane.addTab("Curriculums", curriculumPanel);

        gradesPanel.setBackground(new java.awt.Color(204, 204, 204));
        gradesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable6);

        gradesPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 1070, 510));

        gradesTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        gradesTXT.setText("Grades");
        gradesPanel.add(gradesTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        adminTabbedpane.addTab("tab7", gradesPanel);

        reportsPanel.setBackground(new java.awt.Color(204, 204, 204));
        reportsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportsTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        reportsTXT.setText("Reports");
        reportsPanel.add(reportsTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        adminTabbedpane.addTab("Reports", reportsPanel);

        usersPanel.setBackground(new java.awt.Color(204, 204, 204));
        usersPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingsTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 30)); // NOI18N
        settingsTXT.setText("Users");
        usersPanel.add(settingsTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        usersPanel.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 370, -1));

        searchTxt1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        searchTxt1.setText("Search:");
        usersPanel.add(searchTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        tblusers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SR-Code", "Password", "Type", "Full Name", "Email"
            }
        ));
        tblusers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblusersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblusers);

        usersPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 670, 370));

        searchBtn2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        searchBtn2.setText("Search");
        searchBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn2ActionPerformed(evt);
            }
        });
        usersPanel.add(searchBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jButton5.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        usersPanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        profilePanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profilePanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        passwordTXT.setText("Password:");
        profilePanel3.add(passwordTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        emailTXT1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        emailTXT1.setText("Email:");
        profilePanel3.add(emailTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 90, -1));

        profileTXT2.setFont(new java.awt.Font("Yu Gothic UI", 1, 31)); // NOI18N
        profileTXT2.setText("Users Information");
        profilePanel3.add(profileTXT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        fullnameTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        fullnameTXT.setText("Full Name:");
        profilePanel3.add(fullnameTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));

        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });
        profilePanel3.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 370, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        profilePanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 370, -1));
        profilePanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 370, -1));
        profilePanel3.add(txtSRCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, -1));

        typeTXT.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        typeTXT.setText("Type:");
        profilePanel3.add(typeTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, 40));

        cmbUserType.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Evaluator" }));
        profilePanel3.add(cmbUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 118, 160, 40));

        srcodeTXT16.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        srcodeTXT16.setText("SR-Code:");
        profilePanel3.add(srcodeTXT16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        editBtn1.setBackground(new java.awt.Color(255, 255, 102));
        editBtn1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        editBtn1.setText("Edit");
        editBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtn1ActionPerformed(evt);
            }
        });
        profilePanel3.add(editBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 100, 30));

        addBtn3.setBackground(new java.awt.Color(0, 255, 0));
        addBtn3.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        addBtn3.setText("Add");
        addBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn3ActionPerformed(evt);
            }
        });
        profilePanel3.add(addBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 100, 30));

        usersPanel.add(profilePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 640, 490));

        adminTabbedpane.addTab("Settings", usersPanel);

        adminPanel.add(adminTabbedpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 160, 1930, 580));

        buttonsPanel.setBackground(new java.awt.Color(153, 153, 153));
        buttonsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        usersBtn.setText("Users");
        usersBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersBtnActionPerformed(evt);
            }
        });
        buttonsPanel.add(usersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, 170, 40));

        homeBtn1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        homeBtn1.setText("Home");
        homeBtn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn1ActionPerformed(evt);
            }
        });
        buttonsPanel.add(homeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 40));

        profileBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        profileBtn.setText("Students Profile");
        profileBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });
        buttonsPanel.add(profileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 200, 40));

        coursesBtb.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        coursesBtb.setText("Courses");
        coursesBtb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coursesBtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesBtbActionPerformed(evt);
            }
        });
        buttonsPanel.add(coursesBtb, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 170, 40));

        curriculumBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        curriculumBtn.setText("Curriculum");
        curriculumBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        curriculumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curriculumBtnActionPerformed(evt);
            }
        });
        buttonsPanel.add(curriculumBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 190, 40));

        gradesBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        gradesBtn.setText("Grades");
        gradesBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradesBtnActionPerformed(evt);
            }
        });
        buttonsPanel.add(gradesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 170, 40));

        reportsBtn1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        reportsBtn1.setText("Reports");
        reportsBtn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reportsBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsBtn1ActionPerformed(evt);
            }
        });
        buttonsPanel.add(reportsBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 50, 160, 40));

        adminPanel.add(buttonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 1920, 130));

        jScrollPane1.setViewportView(adminPanel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1010));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchhActionPerformed

    private void usersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersBtnActionPerformed
        adminTabbedpane.setSelectedComponent(usersPanel);
    }//GEN-LAST:event_usersBtnActionPerformed

    private void homeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn1ActionPerformed
        adminTabbedpane.setSelectedComponent(homePanel);
    }//GEN-LAST:event_homeBtn1ActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        adminTabbedpane.setSelectedComponent(profilePanel);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void coursesBtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesBtbActionPerformed
        adminTabbedpane.setSelectedComponent(coursesPanel);
    }//GEN-LAST:event_coursesBtbActionPerformed

    private void curriculumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curriculumBtnActionPerformed
        adminTabbedpane.setSelectedComponent(curriculumPanel);
    }//GEN-LAST:event_curriculumBtnActionPerformed

    private void gradesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradesBtnActionPerformed
        adminTabbedpane.setSelectedComponent(gradesPanel);
    }//GEN-LAST:event_gradesBtnActionPerformed

    private void reportsBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsBtn1ActionPerformed
        adminTabbedpane.setSelectedComponent(reportsPanel);
    }//GEN-LAST:event_reportsBtn1ActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        new AddStudent().setVisible(true);
        updateChart();
    }//GEN-LAST:event_addBtnActionPerformed

    private void addressFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFldActionPerformed

    private void tblstudsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstudsMouseClicked
        // Get the index of the clicked row
        int row = tblstuds.rowAtPoint(evt.getPoint());
        // Ensure the row index is valid (not -1)
        if (row != -1) {
            // Retrieve the studentId from the selected row (assuming it is the first column)
            int studentId = (int) tblstuds.getValueAt(row, 0);
            // Call loadStudentInfo with the studentId
            loadStudentInfo(studentId);
        }
    }//GEN-LAST:event_tblstudsMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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

            JOptionPane.showMessageDialog(this, "Profile picture updated! Click 'Edit' to save changes.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage());
        }
    }   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int studID = Integer.parseInt(studid.getText());
    String newSrcode = srcodeFld.getText();
    String newName = nameFld.getText();
    String newAddress = addressFld.getText();
    String newProgram = programm.getSelectedItem().toString();
    String newTrack = TRACK.getSelectedItem().toString();
    String newEmail = emailFld1.getText();
    String newSex = cmbSex.getSelectedItem().toString();
    String newYear = cmbYear.getSelectedItem().toString();

    byte[] newProfilePic = selectedImageData; // Set this from the button or wherever you set the profile image.

    try {
        Connection conn = DBConnector.getConnection();
        String sqlSelect = "CALL StudentInfo(?)";  // Use the same query to get the current info.
        PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect);
        pstmtSelect.setInt(1, studID);
        ResultSet rs = pstmtSelect.executeQuery();

        if (rs.next()) {
            // Fetch old values
            String oldSrcode = rs.getString("srcode");
            String oldName = rs.getString("student_name");
            String oldAddress = rs.getString("address");
            String oldProgram = rs.getString("program_name");
            String oldTrack = rs.getString("track_name");
            String oldEmail = rs.getString("email");
            String oldSex = rs.getString("sex");
            String oldYear = rs.getString("year");
            byte[] oldProfilePic = rs.getBytes("pic");

            // Compare changes
            StringBuilder changes = new StringBuilder("Confirm the following changes:\n");
            boolean hasChanges = false;

            if (!oldSrcode.equals(newSrcode)) { changes.append("SR Code: ").append(oldSrcode).append(" → ").append(newSrcode).append("\n"); hasChanges = true; }
            if (!oldName.equals(newName)) { changes.append("Name: ").append(oldName).append(" → ").append(newName).append("\n"); hasChanges = true; }
            if (!oldAddress.equals(newAddress)) { changes.append("Address: ").append(oldAddress).append(" → ").append(newAddress).append("\n"); hasChanges = true; }
            if (!oldProgram.equals(newProgram)) { changes.append("Program: ").append(oldProgram).append(" → ").append(newProgram).append("\n"); hasChanges = true; }
            if (!oldEmail.equals(newEmail)) { changes.append("Email: ").append(oldEmail).append(" → ").append(newEmail).append("\n"); hasChanges = true; }
            if (!oldTrack.equals(newTrack)) { changes.append("Track Name: ").append(oldTrack).append(" → ").append(newTrack).append("\n"); hasChanges = true; }
            if (!oldSex.equals(newSex)) { changes.append("Sex: ").append(oldSex).append(" → ").append(newSex).append("\n"); hasChanges = true; }
            if (!oldYear.equals(newYear)) { changes.append("Year Level: ").append(oldYear).append(" → ").append(newYear).append("\n"); hasChanges = true; }

            // Check if profile picture has changed
            boolean profilePicChanged = (newProfilePic != null && !Arrays.equals(oldProfilePic, newProfilePic));
            if (profilePicChanged) { changes.append("Profile Picture: Updated\n"); hasChanges = true; }

            if (!hasChanges) {
                JOptionPane.showMessageDialog(this, "No changes detected.");
                return;
            }

            // Confirmation Dialog
            int confirm = JOptionPane.showConfirmDialog(this, changes.toString(), "Confirm Update", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // Update students table
                String sqlUpdate = "UPDATE students SET srcode=?, student_name=?, address=?, email=?, sex=?, year=?, pic=? WHERE student_id=?";
                PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate);

                pstmtUpdate.setString(1, newSrcode);
                pstmtUpdate.setString(2, newName);
                pstmtUpdate.setString(3, newAddress);
                pstmtUpdate.setString(4, newEmail);
                pstmtUpdate.setString(5, newSex);
                pstmtUpdate.setString(6, newYear);
                pstmtUpdate.setBytes(7, profilePicChanged ? newProfilePic : oldProfilePic); // Update only if changed
                pstmtUpdate.setInt(8, studID);

                int rowsUpdated = pstmtUpdate.executeUpdate();

                // Update student_track table
                String sqlUpdateTrack = "UPDATE student_track SET track_id = (SELECT track_id FROM tracks WHERE track_name = ?) WHERE student_id = ?";
                PreparedStatement pstmtUpdateTrack = conn.prepareStatement(sqlUpdateTrack);
                pstmtUpdateTrack.setString(1, newTrack);
                pstmtUpdateTrack.setInt(2, studID);
                pstmtUpdateTrack.executeUpdate();

                // Update track_program table
                String sqlUpdateProgram = "UPDATE track_program SET program_id = (SELECT program_id FROM programs WHERE program_name = ?) WHERE track_id = (SELECT track_id FROM tracks WHERE track_name = ?)";
                PreparedStatement pstmtUpdateProgram = conn.prepareStatement(sqlUpdateProgram);
                pstmtUpdateProgram.setString(1, newProgram);
                pstmtUpdateProgram.setString(2, newTrack);
                pstmtUpdateProgram.executeUpdate();

                // Show success message
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Student information updated successfully.");
                    loadStudentsToTable();
                    updateChart();
                     txtsearchh.setText("");
         srcodeFld.setText("");  
        nameFld.setText("");    
        addressFld.setText(""); 
        emailFld1.setText("");  
        studid.setText("");  
        cmbSex.setSelectedIndex(0); 
        cmbYear.setSelectedIndex(0); 
        programm.setSelectedIndex(0); 
        TRACK.setSelectedIndex(0);  
        
        // Clear Profile Picture if any
        lblProfilePic.setIcon(null);  
                } else {
                    JOptionPane.showMessageDialog(this, "No changes made.");
                }

                pstmtUpdate.close();
                pstmtUpdateTrack.close();
                pstmtUpdateProgram.close();
            } else {
                JOptionPane.showMessageDialog(this, "Update canceled.");
            }
        }

        rs.close();
        pstmtSelect.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        loadStudentsToTable();
        txtsearchh.setText("");
         srcodeFld.setText("");  // Clear srcode field
        nameFld.setText("");    // Clear name field
        addressFld.setText(""); // Clear address field
        emailFld1.setText("");  // Clear email field
        studid.setText("");
        // Reset JComboBox selections to default
        cmbSex.setSelectedIndex(0); // Assuming the first item is the default
        cmbYear.setSelectedIndex(0); // Assuming the first item is the default
        programm.setSelectedIndex(0); // Assuming the first item is the default program
        TRACK.setSelectedIndex(0);   // Assuming the first item is the default track
        
        // Clear Profile Picture if any
        lblProfilePic.setIcon(null);  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        // TODO add your handling code here:
         String selectedDepartment = (String) dept.getSelectedItem();

    if (selectedDepartment != null) {
        try {
            // Clear program and track combo boxes
            prgrm.removeAllItems();
            trck.removeAllItems();

            // Establish database connection
            Connection conn = DBConnector.getConnection();

            // Query to get programs linked to the selected department
            String sqlPrograms = "SELECT p.program_name FROM programs p " +
                                 "JOIN department_program dp ON p.program_id = dp.program_id " +
                                 "JOIN departments d ON dp.department_id = d.department_id " +
                                 "WHERE d.dep_name = ?";
            PreparedStatement pstmtPrograms = conn.prepareStatement(sqlPrograms);
            pstmtPrograms.setString(1, selectedDepartment);
            ResultSet rsPrograms = pstmtPrograms.executeQuery();

            // Populate program combo box
            while (rsPrograms.next()) {
                prgrm.addItem(rsPrograms.getString("program_name"));
            }

            // Query to load tracks linked to the selected department (even before choosing a program)
            String sqlTracks = "SELECT DISTINCT t.track_name FROM tracks t " +
                               "JOIN track_program pt ON t.track_id = pt.track_id " +
                               "JOIN department_program dp ON pt.program_id = dp.program_id " +
                               "JOIN departments d ON dp.department_id = d.department_id " +
                               "WHERE d.dep_name = ?";
            PreparedStatement pstmtTracks = conn.prepareStatement(sqlTracks);
            pstmtTracks.setString(1, selectedDepartment);
            ResultSet rsTracks = pstmtTracks.executeQuery();

            // Populate track combo box
            while (rsTracks.next()) {
                
            }

            // Close resources
            rsPrograms.close();
            pstmtPrograms.close();
            rsTracks.close();
            pstmtTracks.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading programs and tracks: " + e.getMessage());
        }
    }



    }//GEN-LAST:event_deptActionPerformed

    private void prgrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prgrmActionPerformed
        // TODO add your handling code here:
         String selectedProgram = (String) prgrm.getSelectedItem();

    if (selectedProgram != null) {
        try {
            // Clear the track combo box before loading new data
            trck.removeAllItems();

            // Establish database connection
            Connection conn = DBConnector.getConnection();

            // Query to get tracks linked to the selected program
            String sqlTracks = "SELECT t.track_name FROM tracks t " +
                               "JOIN track_program tp ON t.track_id = tp.track_id " +
                               "JOIN programs p ON tp.program_id = p.program_id " +
                               "WHERE p.program_name = ?";
            PreparedStatement pstmtTracks = conn.prepareStatement(sqlTracks);
            pstmtTracks.setString(1, selectedProgram);
            ResultSet rsTracks = pstmtTracks.executeQuery();

            // Populate track combo box
            while (rsTracks.next()) {
                trck.addItem(rsTracks.getString("track_name"));
            }

            // Close resources
            rsTracks.close();
            pstmtTracks.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading tracks: " + e.getMessage());
        }
    }

    }//GEN-LAST:event_prgrmActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        loadCoursesIntoTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void deptuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptuleActionPerformed
        // TODO add your handling code here:
          String selectedDepartment = (String) deptule.getSelectedItem();

    if (selectedDepartment != null) {
        try {
            // Clear program and track combo boxes
            programule.removeAllItems();
            trackule.removeAllItems();

            // Establish database connection
            Connection conn = DBConnector.getConnection();

            // Query to get programs linked to the selected department
            String sqlPrograms = "SELECT p.program_name FROM programs p " +
                                 "JOIN department_program dp ON p.program_id = dp.program_id " +
                                 "JOIN departments d ON dp.department_id = d.department_id " +
                                 "WHERE d.dep_name = ?";
            PreparedStatement pstmtPrograms = conn.prepareStatement(sqlPrograms);
            pstmtPrograms.setString(1, selectedDepartment);
            ResultSet rsPrograms = pstmtPrograms.executeQuery();

            // Populate program combo box
            while (rsPrograms.next()) {
                programule.addItem(rsPrograms.getString("program_name"));
            }

            // Query to load tracks linked to the selected department (even before choosing a program)
            String sqlTracks = "SELECT DISTINCT t.track_name FROM tracks t " +
                               "JOIN track_program pt ON t.track_id = pt.track_id " +
                               "JOIN department_program dp ON pt.program_id = dp.program_id " +
                               "JOIN departments d ON dp.department_id = d.department_id " +
                               "WHERE d.dep_name = ?";
            PreparedStatement pstmtTracks = conn.prepareStatement(sqlTracks);
            pstmtTracks.setString(1, selectedDepartment);
            ResultSet rsTracks = pstmtTracks.executeQuery();

            // Populate track combo box
            while (rsTracks.next()) {
               
            }

            // Close resources
            rsPrograms.close();
            pstmtPrograms.close();
            rsTracks.close();
            pstmtTracks.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading programs and tracks: " + e.getMessage());
        }
    }

    }//GEN-LAST:event_deptuleActionPerformed

    private void programuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programuleActionPerformed
        // TODO add your handling code here:
         String selectedProgram = (String) programule.getSelectedItem();

    if (selectedProgram != null) {
        try {
            // Clear the track combo box before loading new data
            trackule.removeAllItems();

            // Establish database connection
            Connection conn = DBConnector.getConnection();

            // Query to get tracks linked to the selected program
            String sqlTracks = "SELECT t.track_name FROM tracks t " +
                               "JOIN track_program tp ON t.track_id = tp.track_id " +
                               "JOIN programs p ON tp.program_id = p.program_id " +
                               "WHERE p.program_name = ?";
            PreparedStatement pstmtTracks = conn.prepareStatement(sqlTracks);
            pstmtTracks.setString(1, selectedProgram);
            ResultSet rsTracks = pstmtTracks.executeQuery();

            // Populate track combo box
            while (rsTracks.next()) {
                trackule.addItem(rsTracks.getString("track_name"));
            }

            // Close resources
            rsTracks.close();
            pstmtTracks.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading tracks: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_programuleActionPerformed

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        // TODO add your handling code here:
        addCourse() ;
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void coursesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesTableMouseClicked
        // TODO add your handling code here:
           int selectedRow = coursesTable.getSelectedRow();
            if (selectedRow != -1) {
                // Get the course_code from the selected row
                String courseCode = (String) coursesTable.getValueAt(selectedRow, 0); // assuming course_code is in the first column
                fetchAndPopulateCourseDetails(courseCode);
            }
    }//GEN-LAST:event_coursesTableMouseClicked

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void tblusersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblusersMouseClicked
        // TODO add your handling code here:
     int row = tblusers.rowAtPoint(evt.getPoint());

// Ensure the row index is valid (not -1)
if (row != -1) {
    // Retrieve the srcode from the first column
    String srcode = (String) tblusers.getValueAt(row, 0);

    // Fetch the user ID using srcode if needed
    DBConnector db = new DBConnector();
    int userId = db.getUserId(srcode); // Fetch user ID from the database

    // Call loadUserInfo with the fetched userId
    loadUserInfo(userId);

    }
        
    }//GEN-LAST:event_tblusersMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        loadUsersToTable();
        clearFields();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void addBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn3ActionPerformed
        // TODO add your handling code here:
        String newSrcode = txtSRCode.getText();
    String newFullName = txtFullName.getText();
    String newEmail = txtEmail.getText();
    String newPassword = txtPassword.getText();
    String newUserType = cmbUserType.getSelectedItem().toString();

    // Ensure all fields are filled
    if (newSrcode.isEmpty() || newFullName.isEmpty() || newEmail.isEmpty() || 
        newPassword.isEmpty() || newUserType.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Confirmation message
    StringBuilder details = new StringBuilder("Please confirm the following details to add:\n");
    details.append("SR Code: ").append(newSrcode).append("\n");
    details.append("Full Name: ").append(newFullName).append("\n");
    details.append("Email: ").append(newEmail).append("\n");
    details.append("User Type: ").append(newUserType).append("\n");

    int confirm = JOptionPane.showConfirmDialog(this, details.toString(), "Confirm Add", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.NO_OPTION) {
        return;
    }

    // Database operation
    try (Connection conn = DBConnector.getConnection()) {
        String sqlInsertUser = "INSERT INTO users (srcode, fullname, email, password, type) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sqlInsertUser)) {
            pstmt.setString(1, newSrcode);
            pstmt.setString(2, newFullName);
            pstmt.setString(3, newEmail);
            pstmt.setString(4, newPassword);
            pstmt.setString(5, newUserType);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "User added successfully.");
                loadUsersToTable();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add user.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_addBtn3ActionPerformed

    private void editBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtn1ActionPerformed
        // TODO add your handling code here:
        String newSrcode = txtSRCode.getText();
    String newName = txtFullName.getText();
    String newEmail = txtEmail.getText();
    String newUserType = cmbUserType.getSelectedItem().toString();

    try {
        Connection conn = DBConnector.getConnection();
        String sqlSelect = "SELECT srcode, fullname, email, type FROM users WHERE srcode = ?";
        PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect);
        pstmtSelect.setString(1, newSrcode);
        ResultSet rs = pstmtSelect.executeQuery();

        if (rs.next()) {
            // Fetch old values
            String oldName = rs.getString("fullname");
            String oldEmail = rs.getString("email");
            String oldUserType = rs.getString("type");

            // Compare changes
            StringBuilder changes = new StringBuilder("Confirm the following changes:\n");
            boolean hasChanges = false;

            if (!oldName.equals(newName)) { 
                changes.append("Name: ").append(oldName).append(" → ").append(newName).append("\n"); 
                hasChanges = true; 
            }
            if (!oldEmail.equals(newEmail)) { 
                changes.append("Email: ").append(oldEmail).append(" → ").append(newEmail).append("\n"); 
                hasChanges = true; 
            }
            if (!oldUserType.equals(newUserType)) { 
                changes.append("User Type: ").append(oldUserType).append(" → ").append(newUserType).append("\n"); 
                hasChanges = true; 
            }

            if (!hasChanges) {
                JOptionPane.showMessageDialog(this, "No changes detected.");
                return;
            }

            // Confirmation Dialog
            int confirm = JOptionPane.showConfirmDialog(this, changes.toString(), "Confirm Update", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // Update users table
                String sqlUpdate = "UPDATE users SET fullname=?, email=?, type=? WHERE srcode=?";
                PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate);

                pstmtUpdate.setString(1, newName);
                pstmtUpdate.setString(2, newEmail);
                pstmtUpdate.setString(3, newUserType);
                pstmtUpdate.setString(4, newSrcode);

                int rowsUpdated = pstmtUpdate.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "User information updated successfully.");
                    loadUsersToTable(); // Reload the updated data into the table
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "No changes made.");
                }

                pstmtUpdate.close();
            } else {
                JOptionPane.showMessageDialog(this, "Update canceled.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "User not found.");
        }

        rs.close();
        pstmtSelect.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
    }

    }//GEN-LAST:event_editBtn1ActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        clearCourseFields();
        
    }
        private void clearCourseFields() {
    txtCourseCode1.setText("");
    txtCourseName.setText("");
    unitsField.setText("");
    hoursLecField.setText("");
    hoursLabField.setText("");
    corequisiteField.setText("");
    prerequisiteField.setText("");

    deptule.setSelectedIndex(-1);
    programule.setSelectedIndex(-1);
    trackule.setSelectedIndex(-1);
    year.setSelectedIndex(-1);
    sem.setSelectedIndex(-1);

    }//GEN-LAST:event_clearBtnActionPerformed

    private void searchBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn2ActionPerformed
        // TODO add your handling code here:
            String searchQuery = txtsearch.getText().trim();

    if (!searchQuery.isEmpty()) {
        fetchUsers(searchQuery);
    } else {
        JOptionPane.showMessageDialog(null, "Please enter a search term.");
    }
}

private void fetchUsers(String searchQuery) {
    DefaultTableModel tableModel = (DefaultTableModel) tblusers.getModel();
    tableModel.setRowCount(0);  

    String searchSQL = "SELECT srcode, type, fullname, email " +
                       "FROM users " +
                       "WHERE srcode LIKE ? OR type LIKE ? OR fullname LIKE ? OR email LIKE ?";

    try (Connection conn = DBConnector.getConnection();
         PreparedStatement pst = conn.prepareStatement(searchSQL)) {

        String searchPattern = "%" + searchQuery + "%"; 

        pst.setString(1, searchPattern); 
        pst.setString(2, searchPattern); 
        pst.setString(3, searchPattern); 
        pst.setString(4, searchPattern);  

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Object[] row = new Object[4];  
            row[0] = rs.getString("srcode");            
            row[1] = rs.getString("type");           
            row[2] = rs.getString("fullname");         
            row[3] = rs.getString("email");             

            tableModel.addRow(row);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error while searching for users: " + e.getMessage());
    }

    }//GEN-LAST:event_searchBtn2ActionPerformed

    private void searchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn1ActionPerformed
        // TODO add your handling code here:
           String searchQuery = txtsearchh.getText().trim();

    if (!searchQuery.isEmpty()) {
        fetchStudents(searchQuery);
    } else {
        JOptionPane.showMessageDialog(null, "Please enter a search term.");
    }
}

private void fetchStudents(String searchQuery) {
    DefaultTableModel tableModel = (DefaultTableModel) tblstuds.getModel();
    tableModel.setRowCount(0);  

    String searchSQL = "SELECT student_id, srcode, student_name, sex, year, address, email " +
                       "FROM students " +
                       "WHERE student_id LIKE ? " +
                       "OR srcode LIKE ? " +
                       "OR student_name LIKE ? " + 
                       "OR sex LIKE ? " + 
                       "OR year LIKE ? " + 
                       "OR address LIKE ? " + 
                       "OR email LIKE ?";

    try (Connection conn = DBConnector.getConnection();
         PreparedStatement pst = conn.prepareStatement(searchSQL)) {

        String searchPattern = "%" + searchQuery + "%"; 

        // Apply search pattern to all relevant columns
        for (int i = 1; i <= 7; i++) {
            pst.setString(i, searchPattern);
        }

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Object[] row = new Object[7];  
            row[0] = rs.getInt("student_id");   // Student ID
            row[1] = rs.getString("srcode");  // SR Code
            row[2] = rs.getString("student_name");     // Name (as stored)
            row[3] = rs.getString("sex");      // Sex
            row[4] = rs.getString("year");     // Year
            row[5] = rs.getString("address");  // Address
            row[6] = rs.getString("email");    // Email

            tableModel.addRow(row);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error while searching for students: " + e.getMessage());
    }

    }//GEN-LAST:event_searchBtn1ActionPerformed

    private void clearFields() {
    txtSRCode.setText("");  // Clear the student code field
    txtPassword.setText("");  // Clear the password field
    txtEmail.setText("");
    txtFullName.setText("");
    txtsearch.setText("");
    cmbUserType.setSelectedIndex(0);  // Reset the combo box to default selection
}

private void loadUserInfo(int userID) {
    try {
        Connection conn = DBConnector.getConnection();
        String sql = "SELECT srcode, fullname, email, type FROM users WHERE uid = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, userID);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            // Load text fields
            txtSRCode.setText(rs.getString("srcode"));
            txtFullName.setText(rs.getString("fullname"));
            txtEmail.setText(rs.getString("email"));

            // Set JComboBox for usertype (Administrator / Evaluator)
            String userType = rs.getString("type");
            if (userType.equalsIgnoreCase("Administrator") || userType.equalsIgnoreCase("Evaluator")) {
                cmbUserType.setSelectedItem(userType);
            } else {
                cmbUserType.setSelectedIndex(-1); // Reset selection if unknown type
            }
        } else {
            JOptionPane.showMessageDialog(this, "No user found with ID: " + userID, "Warning", JOptionPane.WARNING_MESSAGE);
        }

        // Close resources
        rs.close();
        pstmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void loadUsersToTable() {
    // Clear existing table data
    userstablemodel.setRowCount(0);

    try {
        Connection conn = DBConnector.getConnection();
        String sql = "SELECT srcode, type, fullname, email FROM users";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            String srCode = rs.getString("srcode"); // SR Code
            String userType = rs.getString("type"); // Usertype
            String fullName = rs.getString("fullname"); // Full Name
            String email = rs.getString("email"); // Email

            // Add row to JTable model
            userstablemodel.addRow(new Object[]{srCode, userType, fullName, email});
        }

        // Close resources
        rs.close();
        pstmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    private void fetchAndPopulateCourseDetails(String courseCode) {
    try {
        // Establish database connection
        Connection conn = DBConnector.getConnection();

        // Query to join necessary tables and fetch course details
        String sql = "SELECT c.course_id, c.course_code, c.course_name, c.units, c.hours_lec, c.hours_lab, c.corequisite, c.prerequisite, " +
                     "d.dep_name, p.program_name, t.track_name, tc.year, tc.semester " +
                     "FROM courses c " +
                     "JOIN track_course tc ON c.course_id = tc.course_id " +  
                     "JOIN tracks t ON tc.track_id = t.track_id " +  
                     "JOIN track_program tp ON t.track_id = tp.track_id " +  
                     "JOIN programs p ON tp.program_id = p.program_id " +  
                     "JOIN department_program dp ON p.program_id = dp.program_id " +  
                     "JOIN departments d ON dp.department_id = d.department_id " +  
                     "WHERE c.course_code = ?";  

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, courseCode);
        
        // Execute the query
        ResultSet rs = pstmt.executeQuery();

        // Check if data is available and populate fields
        if (rs.next()) {
            // Populate the text fields with course data
            txtCourseCode1.setText(rs.getString("course_code"));
            txtCourseName.setText(rs.getString("course_name"));
            unitsField.setText(rs.getString("units"));
            hoursLecField.setText(rs.getString("hours_lec"));
            hoursLabField.setText(rs.getString("hours_lab"));
            corequisiteField.setText(rs.getString("corequisite"));
            prerequisiteField.setText(rs.getString("prerequisite"));

            // Populate combo boxes with related data
            deptule.setSelectedItem(rs.getString("dep_name"));
            programule.setSelectedItem(rs.getString("program_name"));
            trackule.setSelectedItem(rs.getString("track_name"));
            year.setSelectedItem(rs.getString("year"));
            sem.setSelectedItem(rs.getString("semester"));

            // Store the course_id for future reference (e.g., for editing)
            currentCourseId = rs.getInt("course_id");
        }

        // Close resources
        rs.close();
        pstmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching course details: " + e.getMessage());
    }
}
    
   private void loadCurriculumTable() {
    DefaultTableModel tableModel = (DefaultTableModel) curriculumTable.getModel();
    tableModel.setRowCount(0);  

    String sql = "SELECT s.student_name, d.dep_name, p.program_name, t.track_name " +
                 "FROM students s " +
                 "JOIN track_course tc ON s.student_id = tc.course_id " +  // Get track from student's course
                 "JOIN tracks t ON tc.track_id = t.track_id " +  
                 "JOIN track_program tp ON t.track_id = tp.track_id " +  
                 "JOIN programs p ON tp.program_id = p.program_id " +
                 "JOIN department_program dp ON p.program_id = dp.program_id " +
                 "JOIN departments d ON dp.department_id = d.department_id";  

    try (Connection conn = DBConnector.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {

        while (rs.next()) {
            Object[] row = new Object[4];  
            row[0] = rs.getString("student_name");  // Student Name
            row[1] = rs.getString("dep_name");      // Department Name
            row[2] = rs.getString("program_name");  // Program Name
            row[3] = rs.getString("track_name");    // Track Name

            tableModel.addRow(row);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading curriculum: " + e.getMessage());
    }
}



private void addCourse() {
    // Get values from input fields
    String courseCode = txtCourseCode1.getText();
    String courseName = txtCourseName.getText();
    String units = unitsField.getText();
    String hoursLec = hoursLecField.getText();
    String hoursLab = hoursLabField.getText();
    String corequisite = corequisiteField.getText();
    String prerequisite = prerequisiteField.getText();
    
    String selectedDept = (String) deptule.getSelectedItem();
    String selectedProgram = (String) programule.getSelectedItem();
    String selectedTrack = (String) trackule.getSelectedItem();
    String selectedYear = (String) year.getSelectedItem(); // Year ComboBox
    String selectedSemester = (String) sem.getSelectedItem(); // Semester ComboBox

    // Validate that all fields are provided
    if (courseCode.isEmpty() || courseName.isEmpty() ||
        units.isEmpty() || hoursLec.isEmpty() || hoursLab.isEmpty() ||
        selectedDept == null || selectedProgram == null || selectedTrack == null ||
        selectedYear == null || selectedSemester == null) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields (course code, course name, units, hours, department, program, track, year, semester)!");
        return;
    }

    // Prepare confirmation message with details
    StringBuilder details = new StringBuilder("Please confirm the following details to add the course:\n");
    details.append("Course Code: ").append(courseCode).append("\n");
    details.append("Course Name: ").append(courseName).append("\n");
    details.append("Units: ").append(units).append("\n");
    details.append("Hours (Lecture): ").append(hoursLec).append("\n");
    details.append("Hours (Lab): ").append(hoursLab).append("\n");
    details.append("Corequisite: ").append(corequisite).append("\n");
    details.append("Prerequisite: ").append(prerequisite).append("\n");
    details.append("Department: ").append(selectedDept).append("\n");
    details.append("Program: ").append(selectedProgram).append("\n");
    details.append("Track: ").append(selectedTrack).append("\n");
    details.append("Year: ").append(selectedYear).append("\n");
    details.append("Semester: ").append(selectedSemester).append("\n");

    // Show confirmation dialog
    int confirm = JOptionPane.showConfirmDialog(this, details.toString(), "Confirm Add Course", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    // Insert into the database
    try (Connection conn = DBConnector.getConnection()) {
        // Start a transaction
        conn.setAutoCommit(false);

        // Step 1: Insert into the courses table.
        // Assume the courses table has columns: course_id (auto-increment), course_code, course_name, units, hours_lec, hours_lab, corequisite, prerequisite
        String sqlInsertCourse = "INSERT INTO courses (course_code, course_name, units, hours_lec, hours_lab, corequisite, prerequisite) " +
                                 "VALUES (?, ?, ?, ?, ?, ?, ?)";
        int courseId = -1;
        try (PreparedStatement pstmtCourse = conn.prepareStatement(sqlInsertCourse, Statement.RETURN_GENERATED_KEYS)) {
            pstmtCourse.setString(1, courseCode);
            pstmtCourse.setString(2, courseName);
            pstmtCourse.setString(3, units);
            pstmtCourse.setString(4, hoursLec);
            pstmtCourse.setString(5, hoursLab);
            pstmtCourse.setString(6, corequisite);
            pstmtCourse.setString(7, prerequisite);
            int rowsInserted = pstmtCourse.executeUpdate();
            if (rowsInserted > 0) {
                // Retrieve the generated course_id
                try (ResultSet rs = pstmtCourse.getGeneratedKeys()) {
                    if (rs.next()) {
                        courseId = rs.getInt(1);
                    }
                }
            } else {
                conn.rollback();
                JOptionPane.showMessageDialog(this, "Failed to add course.");
                return;
            }
        }

        // Step 2: Link the new course to the selected track and year/semester.
        // For this example, assume there is a join table "track_courses" with columns: course_id, track_id, year, semester.
        String sqlInsertTrackCourse = "INSERT INTO track_course (course_id, track_id, year, semester) " +
                                      "VALUES (?, (SELECT track_id FROM tracks WHERE track_name = ?), ?, ?)";
        try (PreparedStatement pstmtTrackCourse = conn.prepareStatement(sqlInsertTrackCourse)) {
            pstmtTrackCourse.setInt(1, courseId);
            pstmtTrackCourse.setString(2, selectedTrack);
            pstmtTrackCourse.setString(3, selectedYear);
            pstmtTrackCourse.setString(4, selectedSemester);
            pstmtTrackCourse.executeUpdate();
        }

        // Commit the transaction if all inserts succeed
        conn.commit();

        JOptionPane.showMessageDialog(this, "Course added successfully!");
        clearCourseFields();

        // Optionally: Clear fields and/or reload your courses JTable
        loadCoursesIntoTable();  // your method to refresh the courses display

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error adding course: " + e.getMessage());
    }
}


 private void loadCoursesIntoTable() {
    // Get selected department, program, and track
    String selectedDepartment = (String) dept.getSelectedItem();
    String selectedProgram = (String) prgrm.getSelectedItem();
    String selectedTrack = (String) trck.getSelectedItem();

    // Ensure selections are valid
    if (dept.getSelectedIndex() == -1 || prgrm.getSelectedIndex() == -1 || trck.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Please select a department, program, and track.");
        return;
    }

    try {
        // Establish database connection
        Connection conn = DBConnector.getConnection();

        // Optimized SQL Query (No subqueries)
        String sqlCourses = "SELECT c.course_code, c.course_name " +
                            "FROM courses c " +
                            "JOIN track_course tc ON c.course_id = tc.course_id " +
                            "JOIN tracks t ON tc.track_id = t.track_id " +  
                            "JOIN track_program tp ON t.track_id = tp.track_id " +  
                            "JOIN programs p ON tp.program_id = p.program_id " +  
                            "JOIN department_program dp ON p.program_id = dp.program_id " +  
                            "JOIN departments d ON dp.department_id = d.department_id " +  
                            "WHERE d.dep_name = ? " +
                            "AND p.program_name = ? " +
                            "AND t.track_name = ?";

        PreparedStatement pstmtCourses = conn.prepareStatement(sqlCourses);
        pstmtCourses.setString(1, selectedDepartment);
        pstmtCourses.setString(2, selectedProgram);
        pstmtCourses.setString(3, selectedTrack);
        ResultSet rsCourses = pstmtCourses.executeQuery();

        // Get JTable model and clear previous data
        DefaultTableModel model = (DefaultTableModel) coursesTable.getModel();
        model.setRowCount(0); // Clear table before loading new data

        // Populate JTable with retrieved data
        while (rsCourses.next()) {
            String courseCode = rsCourses.getString("course_code");
            String courseName = rsCourses.getString("course_name");
            model.addRow(new Object[]{courseCode, courseName});
        }

        // Close resources
        rsCourses.close();
        pstmtCourses.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading courses: " + e.getMessage());
    }
}


    private void loadStudentsToTable() {
    // Clear the existing table data
    studentstablemodel.setRowCount(0);
    
    try {
        Connection conn = DBConnector.getConnection();
        String sql = "SELECT student_id, srcode, student_name, sex, year, address, email FROM students";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            int studentId = rs.getInt("student_id");
            String srCode = rs.getString("srcode");
            String studentName = rs.getString("student_name");
            String sex = rs.getString("sex");
            String year = rs.getString("year");
            String address = rs.getString("address");
            String email = rs.getString("email");

            // Add row to table
            studentstablemodel.addRow(new Object[]{
                studentId, srCode, studentName, sex, year, address, email
            });
        }

        rs.close();
        pstmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
private void loadStudentInfo(int studID) {
    try {
        Connection conn = DBConnector.getConnection();
        String sql = "CALL StudentInfo(?)"; // Ensure this SQL matches your procedure
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, studID);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            studid.setText(String.valueOf(rs.getInt("student_id")));
            srcodeFld.setText(rs.getString("srcode"));
            nameFld.setText(rs.getString("student_name"));
            
            String track = rs.getString("track_name");
              TRACK.setSelectedItem(track);
              
            addressFld.setText(rs.getString("address"));
            String program = (rs.getString("program_name"));
            programm.setSelectedItem(program);
            emailFld1.setText(rs.getString("email"));

            // Set the selected value in JComboBox for sex
            String gender = rs.getString("sex");
            cmbSex.setSelectedItem(gender);

            // Set the selected value in JComboBox for year level
            String yearLevel = rs.getString("year");
            cmbYear.setSelectedItem(yearLevel);

            // Load and Display Profile Picture
            // Load and Display Profile Picture
byte[] imgData = rs.getBytes("pic");

if (imgData != null && imgData.length > 0) {
    try {
        ImageIcon directIcon = new ImageIcon(imgData);
        Image scaledImage = directIcon.getImage().getScaledInstance(lblProfilePic.getWidth(), lblProfilePic.getHeight(), Image.SCALE_SMOOTH);
        lblProfilePic.setIcon(new ImageIcon(scaledImage));
    } catch (Exception e) {
        e.printStackTrace();
        lblProfilePic.setIcon(null);
    }
} else {
    lblProfilePic.setIcon(null); // No Image
}

        } else {
            JOptionPane.showMessageDialog(this, "No student found with ID: " + studID, "Error", JOptionPane.WARNING_MESSAGE);
        }

        rs.close();
        pstmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

 private void addBarChart() {
    datasett = new DefaultCategoryDataset();
    JFreeChart chart = createBarChart(datasett);
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(316, 390));

    coursesTotalPanel.setLayout(new BorderLayout());
    coursesTotalPanel.add(chartPanel, BorderLayout.CENTER);
    coursesTotalPanel.revalidate();
    coursesTotalPanel.repaint();

    // Start timer to update the chart every 5 seconds
    timer = new Timer(5000, e -> updateBarChart());
    timer.start();
    updateBarChart(); // Initial chart update
}


  private JFreeChart createBarChart(DefaultCategoryDataset dataset) {
    JFreeChart chart = ChartFactory.createBarChart(
        "Total Enrollees per Department", 
        "Department", 
        "Total Enrollees", 
        dataset, 
        PlotOrientation.VERTICAL, 
        true, true, false
    );

    CategoryPlot plot = (CategoryPlot) chart.getPlot();
    plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);

    // Configure the Y-Axis (Total Enrollees)
    NumberAxis yAxis = (NumberAxis) plot.getRangeAxis();
    yAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits()); // Ensure whole numbers
    yAxis.setAutoRangeIncludesZero(true);
    yAxis.setTickUnit(new NumberTickUnit(10)); // Set increments of 10

    // Customize bar colors
    BarRenderer renderer = (BarRenderer) plot.getRenderer();
    renderer.setSeriesPaint(0, Color.RED);

    return chart;
}

private void updateBarChart() {
    datasett.clear();
    
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/semproj", "root", "");
         Statement stmt = conn.createStatement()) {
         
        String query = "SELECT d.dep_name, COUNT(s.student_id) AS total_enrollees\n" +
            "FROM departments d\n" +
            "JOIN department_program dp ON d.department_id = dp.department_id\n" +
            "JOIN track_program tp ON dp.program_id = tp.program_id\n" +
            "JOIN student_track st ON tp.track_id = st.track_id\n" +
            "JOIN students s ON st.student_id = s.student_id\n" +
            "GROUP BY d.dep_name;";
        
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String departmentName = rs.getString("dep_name");
            int departmentEnrollees = rs.getInt("total_enrollees");
            datasett.addValue(departmentEnrollees, "Enrollees", departmentName);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}



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

   private void addPieChart() {
        dataset = new DefaultPieDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(316, 390));

        studentsTotalPanel.setLayout(new BorderLayout());
        studentsTotalPanel.add(chartPanel, BorderLayout.CENTER);
        studentsTotalPanel.revalidate();
        studentsTotalPanel.repaint();

        
        timer = new Timer(5000, e -> updateChart());
        timer.start();
        updateChart(); 
    }

   private JFreeChart createChart(PieDataset dataset) {
    JFreeChart chart = ChartFactory.createPieChart(
        "Total Male and Female Students", dataset, true, true, false);

    PiePlot plot = (PiePlot) chart.getPlot();
    plot.setSectionPaint("Male", Color.BLUE);
    plot.setSectionPaint("Female", Color.PINK);
    plot.setSimpleLabels(true);
    plot.setExplodePercent("Male", 0.05);
    plot.setExplodePercent("Female", 0.05);

    // Show percentage labels
    plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
        "{0}: {1} ({2})")); 

    return chart;
}


    private void updateChart() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/semproj", "root", "");
             Statement stmt = conn.createStatement()) {
             
            String maleQuery = "SELECT COUNT(*) FROM students WHERE sex = 'Male'";
            String femaleQuery = "SELECT COUNT(*) FROM students WHERE sex = 'Female'";

            ResultSet rsMale = stmt.executeQuery(maleQuery);
            rsMale.next();
            int maleCount = rsMale.getInt(1);

            ResultSet rsFemale = stmt.executeQuery(femaleQuery);
            rsFemale.next();
            int femaleCount = rsFemale.getInt(1);

            dataset.setValue("Male", maleCount);
            dataset.setValue("Female", femaleCount);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


private void loadProgramsTracksAndDepartments() {
    try {
        // Clear existing items
        prgrm.removeAllItems();
        trck.removeAllItems();
        dept.removeAllItems(); // Clear departments list
        
        // Establish database connection
        Connection conn = DBConnector.getConnection();

        // Load Programs from the Database
        String sqlPrograms = "SELECT program_name FROM programs";
        PreparedStatement pstmtPrograms = conn.prepareStatement(sqlPrograms);
        ResultSet rsPrograms = pstmtPrograms.executeQuery();

        while (rsPrograms.next()) {
            prgrm.addItem(rsPrograms.getString("program_name"));  // Add each program to the JComboBox
        }

        // Load Tracks from the Database
        String sqlTracks = "SELECT track_name FROM tracks";
        PreparedStatement pstmtTracks = conn.prepareStatement(sqlTracks);
        ResultSet rsTracks = pstmtTracks.executeQuery();

        while (rsTracks.next()) {
            trck.addItem(rsTracks.getString("track_name"));  // Add each track to the JComboBox
        }

        // Load Departments from the Database
        String sqlDepartments = "SELECT dep_name FROM departments"; // Adjust the column name if needed
        PreparedStatement pstmtDepartments = conn.prepareStatement(sqlDepartments);
        ResultSet rsDepartments = pstmtDepartments.executeQuery();

        while (rsDepartments.next()) {
            dept.addItem(rsDepartments.getString("dep_name"));  // Add each department to the JComboBox
        }

        // Close resources
        rsPrograms.close();
        rsTracks.close();
        rsDepartments.close();
        pstmtPrograms.close();
        pstmtTracks.close();
        pstmtDepartments.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
    }
}

private void loadProgramsTracksAndDepartmentsinPanel() {
    try {
        // Clear existing items
        programule.removeAllItems();
        trackule.removeAllItems();
        deptule.removeAllItems(); // Clear departments list
        
        // Establish database connection
        Connection conn = DBConnector.getConnection();

        // Load Programs from the Database
        String sqlPrograms = "SELECT program_name FROM programs";
        PreparedStatement pstmtPrograms = conn.prepareStatement(sqlPrograms);
        ResultSet rsPrograms = pstmtPrograms.executeQuery();

        while (rsPrograms.next()) {
            programule.addItem(rsPrograms.getString("program_name"));  // Add each program to the JComboBox
        }

        // Load Tracks from the Database
        String sqlTracks = "SELECT track_name FROM tracks";
        PreparedStatement pstmtTracks = conn.prepareStatement(sqlTracks);
        ResultSet rsTracks = pstmtTracks.executeQuery();

        while (rsTracks.next()) {
            trackule.addItem(rsTracks.getString("track_name"));  // Add each track to the JComboBox
        }

        // Load Departments from the Database
        String sqlDepartments = "SELECT dep_name FROM departments"; // Adjust the column name if needed
        PreparedStatement pstmtDepartments = conn.prepareStatement(sqlDepartments);
        ResultSet rsDepartments = pstmtDepartments.executeQuery();

        while (rsDepartments.next()) {
            deptule.addItem(rsDepartments.getString("dep_name"));  // Add each department to the JComboBox
        }

        // Close resources
        rsPrograms.close();
        rsTracks.close();
        rsDepartments.close();
        pstmtPrograms.close();
        pstmtTracks.close();
        pstmtDepartments.close();
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
            java.util.logging.Logger.getLogger(mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainui(LoginSession.getSrcode(), LoginSession.getUserId(), LoginSession.getFullname(), LoginSession.getUsertype()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TRACK;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addBtn1;
    private javax.swing.JButton addBtn3;
    private javax.swing.JTextField addressFld;
    private javax.swing.JLabel addressTXT;
    private javax.swing.JLabel addressTXT1;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JTabbedPane adminTabbedpane;
    private javax.swing.JLabel background;
    private javax.swing.JLabel batstateuLbl;
    private javax.swing.JLabel batstateuLbl1;
    private javax.swing.JLabel bsulogo;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JComboBox<String> cmbSex;
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JTextField corequisiteField;
    private javax.swing.JButton coursesBtb;
    private javax.swing.JPanel coursesPANEL;
    private javax.swing.JPanel coursesPanel;
    private javax.swing.JLabel coursesTXT;
    private javax.swing.JLabel coursesTXT1;
    private javax.swing.JTable coursesTable;
    private javax.swing.JPanel coursesTotalPanel;
    private javax.swing.JButton curriculumBtn;
    private javax.swing.JPanel curriculumPanel;
    private javax.swing.JLabel curriculumTXT;
    private javax.swing.JTable curriculumTable;
    private javax.swing.JComboBox<String> dept;
    private javax.swing.JComboBox<String> deptule;
    private javax.swing.JButton editBtn1;
    private javax.swing.JTextField emailFld1;
    private javax.swing.JLabel emailTXT;
    private javax.swing.JLabel emailTXT1;
    private javax.swing.JLabel fullnameTXT;
    private javax.swing.JButton gradesBtn;
    private javax.swing.JPanel gradesPanel;
    private javax.swing.JLabel gradesTXT;
    private javax.swing.JButton homeBtn1;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel homeTXT;
    private javax.swing.JTextField hoursLabField;
    private javax.swing.JTextField hoursLecField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable6;
    private javax.swing.JLabel lblProfilePic;
    private javax.swing.JPanel maroonbckgrnd;
    private javax.swing.JTextField nameFld;
    private javax.swing.JLabel nameTXT;
    private javax.swing.JLabel nameTXT1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel passwordTXT;
    private javax.swing.JTextField prerequisiteField;
    private javax.swing.JComboBox<String> prgrm;
    private javax.swing.JButton printblankBtn;
    private javax.swing.JButton printcurriculumBtn;
    private javax.swing.JButton profileBtn;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JPanel profilePanel2;
    private javax.swing.JPanel profilePanel3;
    private javax.swing.JLabel profileTXT;
    private javax.swing.JLabel profileTXT1;
    private javax.swing.JLabel profileTXT2;
    private javax.swing.JLabel programTXT;
    private javax.swing.JLabel programTXT1;
    private javax.swing.JLabel programTXT3;
    private javax.swing.JComboBox<String> programm;
    private javax.swing.JComboBox<String> programule;
    private javax.swing.JButton reportsBtn1;
    private javax.swing.JPanel reportsPanel;
    private javax.swing.JLabel reportsTXT;
    private javax.swing.JButton searchBtn1;
    private javax.swing.JButton searchBtn2;
    private javax.swing.JLabel searchTxt;
    private javax.swing.JLabel searchTxt1;
    private javax.swing.JComboBox<String> sem;
    private javax.swing.JLabel settingsTXT;
    private javax.swing.JTextField srcodeFld;
    private javax.swing.JLabel srcodeTXT;
    private javax.swing.JLabel srcodeTXT1;
    private javax.swing.JLabel srcodeTXT10;
    private javax.swing.JLabel srcodeTXT11;
    private javax.swing.JLabel srcodeTXT12;
    private javax.swing.JLabel srcodeTXT13;
    private javax.swing.JLabel srcodeTXT14;
    private javax.swing.JLabel srcodeTXT15;
    private javax.swing.JLabel srcodeTXT16;
    private javax.swing.JLabel srcodeTXT2;
    private javax.swing.JLabel srcodeTXT3;
    private javax.swing.JLabel srcodeTXT6;
    private javax.swing.JLabel srcodeTXT7;
    private javax.swing.JLabel srcodeTXT9;
    private javax.swing.JLabel studentTXT;
    private javax.swing.JPanel studentsTotalPanel;
    private javax.swing.JLabel studid;
    private javax.swing.JTable tblstuds;
    private javax.swing.JTable tblusers;
    private javax.swing.JLabel tneuLbl;
    private javax.swing.JComboBox<String> trackule;
    private javax.swing.JComboBox<String> trck;
    private javax.swing.JTextField txtCourseCode1;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSRCode;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsearchh;
    private javax.swing.JLabel typeTXT;
    private javax.swing.JTextField unitsField;
    private javax.swing.JButton usersBtn;
    private javax.swing.JPanel usersPanel;
    private javax.swing.JLabel welcome;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
