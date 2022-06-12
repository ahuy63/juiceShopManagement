/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.controller;

import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author ahuy96
 */
public class UtilDB {

    private Connection connection;

    public UtilDB() {
    }

    public UtilDB(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void connect() {
        if (connection == null) {
            String dbURL = "jdbc:sqlserver://localhost;databaseName=juiceshop_db;user=sa;password=123456";
            try {
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(dbURL);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }

    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error disconnect: " + e);
            }
        }
    }
}
