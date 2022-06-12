/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.model;

import javax.swing.ImageIcon;

/**
 *
 * @author ahuy96
 */
public class Product {

    private int iD;
    private String name;
    private int categoryID;
    private float price;
    private String description;
    private String ingredient;
    private String image;
    private Category category;
    private ImageIcon img;

    public Product() {
    }

    public Product(int iD, String name, int categoryID, float price, String description, String ingredient, String image, Category category) {
        this.iD = iD;
        this.name = name;
        this.categoryID = categoryID;
        this.price = price;
        this.description = description;
        this.ingredient = ingredient;
        this.image = image;
        this.category = category;
    }

    public Product(int iD, String name, int categoryID, float price, String description, String ingredient, String image, Category category, ImageIcon img) {
        this.iD = iD;
        this.name = name;
        this.categoryID = categoryID;
        this.price = price;
        this.description = description;
        this.ingredient = ingredient;
        this.image = image;
        this.category = category;
        this.img = img;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }
  
    
    
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
