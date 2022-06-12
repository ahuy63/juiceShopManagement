/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.controller;

import g4_juiceshopmanagement.model.Product;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author ahuy96
 */
public class ProductDAO {

    private UtilDB utilDB;

    public ProductDAO() {
        utilDB = new UtilDB();
        utilDB.connect();
    }

    public UtilDB getUtilDB() {
        return utilDB;
    }

    public void setUtilDB(UtilDB utilDB) {
        this.utilDB = utilDB;
    }

    public ArrayList<Product> getAll() {
        ArrayList<Product> productList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product";
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Product product = new Product();
                product.setiD(rs.getInt("ID"));
                product.setName(rs.getString("Name"));
                product.setPrice(rs.getFloat("Price"));
                product.setCategoryID(rs.getInt("CategoryID"));
                CategoryDAO cateDAO = new CategoryDAO();
                product.setCategory(cateDAO.getByID(product.getCategoryID()));
                product.setDescription(rs.getString("Description"));
                product.setIngredient(rs.getString("Ingredient"));
                product.setImage(rs.getString("Image"));
                product.setImg(new ImageIcon(System.getProperty("user.dir") + "\\Images\\" + product.getName() + ".png"));
                productList.add(product);
            }
        } catch (Exception e) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
        }
        return productList;
    }

    public Product getByID(int id) {
        String sql = "SELECT * FROM Product WHERE ID = " + id;
        try {
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                Product product = new Product();
                product.setiD(rs.getInt("ID"));
                product.setName(rs.getString("Name"));
                product.setPrice(rs.getFloat("Price"));
                product.setCategoryID(rs.getInt("CategoryID"));
                CategoryDAO cateDAO = new CategoryDAO();
                product.setCategory(cateDAO.getByID(product.getCategoryID()));
                product.setDescription(rs.getString("Description"));
                product.setIngredient(rs.getString("Ingredient"));
                product.setImage(rs.getString("Image"));
                product.setImg(new ImageIcon(System.getProperty("user.dir") + "\\Images\\" + product.getName() + ".png"));
                return product;
            }
        } catch (Exception e) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public ArrayList<Product> getByCategory(int categoryId) {
        ArrayList<Product> productList = new ArrayList<>();
        String sql = "SELECT * FROM Product WHERE CategoryID = " + categoryId;
        try {
            Statement stm = utilDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Product product = new Product();
                product.setiD(rs.getInt("ID"));
                product.setName(rs.getString("Name"));
                product.setPrice(rs.getFloat("Price"));
                product.setCategoryID(rs.getInt("CategoryID"));
                CategoryDAO cateDAO = new CategoryDAO();
                product.setCategory(cateDAO.getByID(product.getCategoryID()));
                product.setDescription(rs.getString("Description"));
                product.setIngredient(rs.getString("Ingredient"));
                product.setImage(rs.getString("Image"));
                product.setImg(new ImageIcon(System.getProperty("user.dir") + "\\Images\\" + product.getName() + ".png"));
                productList.add(product);
            }
        } catch (Exception e) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
        }
        return productList;
    }
    
    public boolean addNew(Product product) {
        String query = "INSERT INTO PRODUCT(Name, CategoryID, Price, Description, Ingredient, Image) VALUES(?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(query);
            pstm.setString(1, product.getName());
            pstm.setInt(2, product.getCategoryID());
            pstm.setFloat(3, product.getPrice());
            pstm.setString(4, product.getDescription());
            pstm.setString(5, product.getIngredient());
            pstm.setString(6, product.getImage());
            if (pstm.executeUpdate() != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean update(Product product) {
        String query = "UPDATE PRODUCT SET Name=?, CategoryID=?, Price=?, Description=?, Ingredient=?, Image=? WHERE ID=?";
        try {
            PreparedStatement pstm = utilDB.getConnection().prepareStatement(query);
            pstm.setString(1, product.getName());
            pstm.setInt(2, product.getCategoryID());
            pstm.setFloat(3, product.getPrice());
            pstm.setString(4, product.getDescription());
            pstm.setString(5, product.getIngredient());
            pstm.setString(6, product.getImage());
            pstm.setInt(7, product.getiD());
            if (pstm.executeUpdate() != 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean delete(int productID) {
        try {
            String sql = "DELETE FROM Product WHERE ID = " + productID;
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
