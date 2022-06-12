/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.controller;

import g4_juiceshopmanagement.model.Invoice;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author ahuy96
 */
public class InvoiceDAO {

    private UtilDB utilDB;

    public InvoiceDAO() {
        utilDB = new UtilDB();
        utilDB.connect();
    }

    public UtilDB getUtilDB() {
        return utilDB;
    }

    public void setUtilDB(UtilDB utilDB) {
        this.utilDB = utilDB;
    }

    public boolean add(Invoice invoice) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String sql = "INSERT INTO Invoice(AccountID, IssuedDate, Total) VALUES(?, ?, ?)";
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(sql);
            pstm.setInt(1, invoice.getAccountID());
            pstm.setString(2, sdf.format(invoice.getIssuedDate()));
            pstm.setFloat(3, invoice.getTotal());
            if (pstm.executeUpdate() != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public ArrayList<Invoice> getAllbyAccountID(int accountID) {
        ArrayList<Invoice> invoiceList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Invoice WHERE AccountID = " + accountID + " ORDER BY ID DESC";
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {                
                Invoice invoice = new Invoice();
                invoice.setID(rs.getInt("ID"));
                invoice.setAccountID(rs.getInt("AccountID"));
                invoice.setIssuedDate(rs.getDate("IssuedDate"));
                invoice.setTotal(rs.getFloat("Total"));
                invoiceList.add(invoice);
            }
        } catch (Exception e) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return invoiceList;
    }
    public ArrayList<Invoice> getAll() {
        ArrayList<Invoice> invoiceList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Invoice ORDER BY ID DESC";
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {                
                Invoice invoice = new Invoice();
                invoice.setID(rs.getInt("ID"));
                invoice.setAccountID(rs.getInt("AccountID"));
                invoice.setIssuedDate(rs.getDate("IssuedDate"));
                invoice.setTotal(rs.getFloat("Total"));
                invoiceList.add(invoice);
            }
        } catch (Exception e) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return invoiceList;
    }
    public int getNewestInvoiceID(){
        try {
            String sql ="SELECT TOP 1 ID FROM Invoice ORDER BY ID DESC";
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("ID");
            }
        } catch (Exception e) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return -1;
    }
    
    
}
