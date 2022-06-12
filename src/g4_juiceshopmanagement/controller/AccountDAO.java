/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.controller;

import g4_juiceshopmanagement.model.Account;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahuy96
 */
public class AccountDAO {

    private UtilDB utilDB;

    public AccountDAO() {
        utilDB = new UtilDB();
        utilDB.connect();
    }

    //Check Login
    public Account checkLogin(String username, String password) {
        try {
            String sql = "Select * from Staff, Account where Account.Username=? and Account.Password = ? and Account.ID = Staff.AccountID";
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setID(rs.getInt("ID"));
                account.setFullName(rs.getString("FullName"));
                account.setEmail(rs.getString("Email"));
                account.setPhone(rs.getString("Phone"));
                account.setAvatar(rs.getString("Avatar"));
                account.setUsername(rs.getString("Username"));
                account.setPassword(rs.getString("Password"));
                return account;
            }
        } catch (Exception e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public Account checkCustomerLogin(String username, String password) {
        try {
            String sql = "Select * from Customer, Account where Account.Username=? and Account.Password = ? and Account.ID = Customer.AccountID";
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setID(rs.getInt("ID"));
                account.setFullName(rs.getString("FullName"));
                account.setEmail(rs.getString("Email"));
                account.setPhone(rs.getString("Phone"));
                account.setAvatar(rs.getString("Avatar"));
                account.setUsername(rs.getString("Username"));
                account.setPassword(rs.getString("Password"));
                return account;
            }
        } catch (Exception e) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public Account getByID(int id) {
        String sql = "SELECT * FROM Account WHERE ID = " + id;
        try {
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                Account account = new Account();
                account.setID(rs.getInt("ID"));
                account.setUsername(rs.getString("Username"));
                account.setPassword(rs.getString("Password"));
                account.setFullName(rs.getString("Fullname"));
                account.setEmail(rs.getString("Email"));
                account.setPhone(rs.getString("Phone"));
                account.setAvatar(rs.getString("Avatar"));
                return account;
            }
        } catch (Exception e) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public int getAccountID(Account account) {
        String sql = "SELECT ID FROM Account WHERE Username = '" + account.getUsername() + "'";
        try {
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("ID");
            }
        } catch (Exception e) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, e);
        }
        return -1;
    }

    public boolean isExist_Username(String username) {
        String sql = "SELECT * FROM Account WHERE Username = '" + username + "'";
        try {
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public int add(Account account) {
        String query = "INSERT INTO Account(Username, Password, FullName, Email, Phone, Avatar) VALUES(?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(query);
            pstm.setString(1, account.getUsername());
            pstm.setString(2, account.getPassword());
            pstm.setString(3, account.getFullName());
            pstm.setString(4, account.getEmail());
            pstm.setString(5, account.getPhone());
            pstm.setString(6, account.getAvatar());
            if (pstm.executeUpdate() != 0) {
                return getAccountID(account);
            }
        } catch (Exception e) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, e);
        }
        return -1;
    }

    public boolean update(Account account) {
        String query = "UPDATE Account SET Username=?, Password=?, FullName=?, Email=?, Phone=?, Avatar=? WHERE ID =?";
        try {
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(query);
            pstm.setString(1, account.getUsername());
            pstm.setString(2, account.getPassword());
            pstm.setString(3, account.getFullName());
            pstm.setString(4, account.getEmail());
            pstm.setString(5, account.getPhone());
            pstm.setString(6, account.getAvatar());
            pstm.setInt(7, account.getID());
            if (pstm.executeUpdate() != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean delete(int accountID) {
        try {
            String sql = "DELETE FROM Account WHERE ID = " + accountID;
            Statement stm = utilDB.getConnection().createStatement();
            if (stm.executeUpdate(sql) != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
}
