/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.controller;

import g4_juiceshopmanagement.model.Category;
import g4_juiceshopmanagement.model.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahuy96
 */
public class CategoryDAO {

    private UtilDB utilDB;

    public CategoryDAO() {
        utilDB = new UtilDB();
        utilDB.connect();
    }

    public UtilDB getUtilDB() {
        return utilDB;
    }

    public void setUtilDB(UtilDB utilDB) {
        this.utilDB = utilDB;
    }

    public ArrayList<Category> getAll() {
        ArrayList<Category> categoryList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Category";
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Category category = new Category();
                category.setiD(rs.getInt("ID"));
                category.setName(rs.getString("Name"));
                categoryList.add(category);
            }
        } catch (Exception e) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
        }
        return categoryList;
    }

    public Category getByID(int id) {
        String sql = "SELECT * FROM Category WHERE ID=" + id;
        try {
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                Category category = new Category();
                category.setiD(rs.getInt("ID"));
                category.setName(rs.getString("Name"));
                return category;
            }
        } catch (Exception e) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }



    public boolean addNewCategory(Category category) {
        String sql = "INSERT INTO Category(Name) VALUES (?)";
        try {
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(sql);
            pstm.setString(1, category.getName());
            if (pstm.executeUpdate() != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean updateCategory(Category category) {
        String sql = "UPDATE Category SET Name = ? WHERE ID = ?";
        try {
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(sql);
            pstm.setString(1, category.getName());
            pstm.setInt(2, category.getiD());
            if (pstm.executeUpdate() != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean deleteCategory(Category category) {
        try {
            String sql = "DELETE FROM Category WHERE ID = " + category.getiD();
            Statement stm = utilDB.getConnection().createStatement();
            if (stm.executeUpdate(sql) != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
}
