/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gecp.helper;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginHelper {

    /*
    public boolean validateUser(String username, String password) {

        Connection con = getConnection();
        if (con != null) {
            try {
                Statement statement;
                statement = con.createStatement();
                String query = "SELECT * FROM persons WHERE userName = "+username +" AND password = "+password;
                System.out.println("Query: "+ query);
                ResultSet rs;
                rs = statement.executeQuery(query);
                System.out.println("ResultSet: ");
                return rs.next();
            } catch (SQLException ex) {
                Logger.getLogger(LoginHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
     
    public boolean validateUser(String username, String password) {
        Connection con = getConnection();
        if (con != null) {
            try {
                PreparedStatement ps;
                String query = "SELECT * FROM persons WHERE userName = ? AND password = ?";
                ps = con.prepareStatement(query);

                ps.setString(1, username);
                ps.setString(2, password);
                System.out.println("Query : " + ps.toString());
                ResultSet rs = ps.executeQuery();
                return rs.next();

            } catch (SQLException ex) {
                Logger.getLogger(LoginHelper.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        return false;
    }
*/
    public void registerUser(String username, String password, int age) {
        Connection con = getConnection();
        if (con != null) {
            try {
                CallableStatement stmt = con.prepareCall("{CALL insertuser(?,?,?)}");
                stmt.setString(1, username);
                stmt.setString(2, password);
                stmt.setInt(3, age);
                stmt.execute();
            } catch (SQLException ex) {
                Logger.getLogger(LoginHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private Connection getConnection() {

        Connection con = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/csedept", "root", "root");
            System.out.println("connection succssful");
        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println(exception);
        }
        return con;
    }

    public boolean varifyUser(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
