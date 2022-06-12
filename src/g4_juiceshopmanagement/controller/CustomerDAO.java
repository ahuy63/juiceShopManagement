/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.controller;

import g4_juiceshopmanagement.model.Customer;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahuy96
 */
public class CustomerDAO {

    private UtilDB utilDB;

    public CustomerDAO() {
        utilDB = new UtilDB();
        utilDB.connect();
    }

    public UtilDB getUtilDB() {
        return utilDB;
    }

    public void setUtilDB(UtilDB utilDB) {
        this.utilDB = utilDB;
    }

    public ArrayList<Customer> getAll() {
        ArrayList<Customer> customerList = new ArrayList<>();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String sql = "SELECT * FROM Customer";
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setAccountID(rs.getInt("AccountID"));
                String dob = rs.getString("DoB");
                customer.setDoB(rs.getDate("DoB"));
                customer.setAddress(rs.getString("Address"));
                AccountDAO accountDAO = new AccountDAO();
                customer.setAccount(accountDAO.getByID(customer.getAccountID()));
                customerList.add(customer);
            }
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }
        return customerList;
    }

    public Customer getByAccountID(int id) {
        String sql = "SELECT * FROM Customer WHERE AccountID = " + id;
        try {
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                Customer customer = new Customer();
                customer.setAccountID(rs.getInt("AccountID"));
                customer.setDoB(rs.getDate("DoB"));
                customer.setAddress(rs.getString("Address"));
                AccountDAO accountDAO = new AccountDAO();
                customer.setAccount(accountDAO.getByID(customer.getAccountID()));
                return customer;
            }
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public boolean add(Customer customer) {
        String query = "INSERT INTO Customer(AccountID, DoB, Address) VALUES(?, ?, ?)";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(query);
            pstm.setInt(1, customer.getAccountID());
            pstm.setString(2, sdf.format(customer.getDoB()));
            pstm.setString(3, customer.getAddress());
            if (pstm.executeUpdate() != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    public boolean update(Customer customer) {
        String query = "UPDATE Customer SET DoB=?, Address=? WHERE AccountID=?";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(query);
            pstm.setString(1, sdf.format(customer.getDoB()));
            pstm.setString(2, customer.getAddress());
            pstm.setInt(3, customer.getAccountID());
            if (pstm.executeUpdate() != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean delete(int accountID) {
        try {
            String sql = "DELETE FROM Customer WHERE AccountID = " + accountID;
            Statement stm = utilDB.getConnection().createStatement();
            if (stm.executeUpdate(sql) != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
}
