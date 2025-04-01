/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mary Jhezl
 */
public class DBConnector {
     private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/semproj";  
    private static final String username = "root";  
    private static final String password = ""; 
    
    private Connection conn;

    public static Connection getConnection() {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Database connection established.");
            return conn;
        } catch (Exception e) {
            System.err.println("❌ Error connecting to the database: " + e.getMessage());
            return null;
        }
    }

    public boolean validateLogin(String srcode, String enteredPassword) {
        String sql = "SELECT password FROM users WHERE srcode = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, srcode);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("password");  
                return enteredPassword.equals(storedPassword);
            }
        } catch (SQLException e) {
            System.err.println("❌ Error validating login: " + e.getMessage());
        }
        return false;
    }
  
    public int getUserId(String srcode) {
        int userId = -1;
        String sql = "SELECT uid FROM users WHERE srcode = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, srcode);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                userId = rs.getInt("uid");
            }
        } catch (SQLException e) {
            System.err.println("❌ Error fetching user ID: " + e.getMessage());
        }
        return userId;
    }

  public String getFullname(String srcode) {
    String fullname = "";
    try {
        Connection con = getConnection();
        String sql = "SELECT fullname FROM users WHERE srcode = ?";

        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, srcode);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            fullname = rs.getString("fullname");
        }
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return fullname;
}

public String getUserType(String srcode) {
    String userType = null;
    String sql = "SELECT type FROM users WHERE srcode = ?"; 

    try (Connection conn = getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, srcode);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            userType = rs.getString("type");     
        }
    } catch (SQLException e) {
        System.err.println("❌ Error fetching user type: " + e.getMessage());
    }
    return userType;
}

 public String getUserEmail(String srcode) {
        String email = null;
        String sql = "SELECT email FROM users WHERE srcode = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, srcode);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                email = rs.getString("email");
            }
        } catch (SQLException e) {
            System.err.println("❌ Error fetching user email: " + e.getMessage());
        }
        return email;
    }
}
