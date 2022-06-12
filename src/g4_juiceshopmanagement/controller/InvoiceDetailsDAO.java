/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.controller;

import g4_juiceshopmanagement.model.InvoiceDetails;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahuy96
 */
public class InvoiceDetailsDAO {
    private UtilDB utilDB;

    public InvoiceDetailsDAO() {
        utilDB = new UtilDB();
        utilDB.connect();
    }

    public UtilDB getUtilDB() {
        return utilDB;
    }

    public void setUtilDB(UtilDB utilDB) {
        this.utilDB = utilDB;
    }
    
    public boolean add(InvoiceDetails invoiceDetails){
         try {
            String sql = "INSERT INTO InvoiceDetails(InvoiceID, ProductID, Quantity, Price) VALUES(?, ?, ?, ?)";
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(sql);
            pstm.setInt(1, invoiceDetails.getInvoiceID());
            pstm.setInt(2, invoiceDetails.getProductID());
            pstm.setInt(3, invoiceDetails.getQuantity());
            pstm.setFloat(4, invoiceDetails.getPrice());
            if (pstm.executeUpdate() != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(InvoiceDetailsDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    public ArrayList<InvoiceDetails> getByInvoiceID(int invoiceID){
        ArrayList<InvoiceDetails> invoiceDetailseList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM InvoiceDetails WHERE InvoiceID = " + invoiceID;
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {                
                InvoiceDetails invoiceDetails = new InvoiceDetails();
                invoiceDetails.setInvoiceID(rs.getInt("InvoiceID"));
                invoiceDetails.setProductID(rs.getInt("ProductID"));
                ProductDAO productDAO = new ProductDAO();
                invoiceDetails.setProduct(productDAO.getByID(invoiceDetails.getProductID()));
                invoiceDetails.setQuantity(rs.getInt("Quantity"));
                invoiceDetails.setPrice(rs.getFloat("Price"));
                invoiceDetailseList.add(invoiceDetails);
            }
        } catch (Exception e) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return invoiceDetailseList;
    }
}
