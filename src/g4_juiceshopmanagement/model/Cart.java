/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.model;

/**
 *
 * @author ahuy96
 */
public class Cart {
    private String name;
    private int quantity;
    private Float total;
    private int productID;

    public Cart() {
    }

    public Cart(String name, int quantity, Float total, int productID) {
        this.name = name;
        this.quantity = quantity;
        this.total = total;
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    
    
}
