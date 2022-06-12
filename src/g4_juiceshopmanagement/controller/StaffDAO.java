/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.controller;

import g4_juiceshopmanagement.model.Staff;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.*;

/**
 *
 * @author ahuy96
 */
public class StaffDAO {

    private UtilDB utilDB;

    public StaffDAO() {
        utilDB = new UtilDB();
        utilDB.connect();
    }

    public ArrayList<Staff> getAll() {
        ArrayList<Staff> staffList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Staff";
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Staff staff = new Staff();
                staff.setAccountID(rs.getInt("AccountID"));
                staff.setIDCardNumber(rs.getString("IDCardNumber"));
                staff.setIsAdmin(rs.getBoolean("IsAdmin"));
                AccountDAO accountDAO = new AccountDAO();
                staff.setAccount(accountDAO.getByID(staff.getAccountID()));
                staffList.add(staff);
            }
        } catch (Exception e) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, e);
        }
        return staffList;
    }

    public Staff getByID(int id) {
        String sql = "SELECT * FROM Staff WHERE AccountID = " + id;
        try {
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                Staff staff = new Staff();
                staff.setAccountID(rs.getInt("AccountID"));
                staff.setIDCardNumber(rs.getString("IDCardNumber"));
                staff.setIsAdmin(rs.getBoolean("IsAdmin"));
                AccountDAO accountDAO = new AccountDAO();
                staff.setAccount(accountDAO.getByID(staff.getAccountID()));
                return staff;
            }
        } catch (Exception e) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public boolean add(Staff staff) {
        String query = "INSERT INTO Staff(AccountID, IDCardNumber, IsAdmin) VALUES(?, ?, ?)";
        try {
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(query);
            pstm.setInt(1, staff.getAccountID());
            pstm.setString(2, staff.getIDCardNumber());
            pstm.setBoolean(3, staff.isIsAdmin());
            if (pstm.executeUpdate() != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean update(Staff staff) {
        String query = "UPDATE Staff SET IDCardNumber=?, IsAdmin=? WHERE AccountID=?";
        try {
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(query);
            pstm.setString(1, staff.getIDCardNumber());
            pstm.setBoolean(2, staff.isIsAdmin());
            pstm.setInt(3, staff.getAccountID());
            if (pstm.executeUpdate() != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    public boolean delete(int accountID) {
        try {
            String sql = "DELETE FROM Staff WHERE AccountID = " + accountID;
            Statement stm = utilDB.getConnection().createStatement();
            if (stm.executeUpdate(sql) != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
}
