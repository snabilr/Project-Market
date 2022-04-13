/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmarket;

import java.util.UUID;

/**
 *
 * @author User
 */
public class Product {

    // Encapsulate fields or properties
    private String ID;
    private String productName;
    private int price;
    private String category;
    private int stock;

    public Product(String productName, int price, String category, int stock) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.stock = stock;
        this.ID = UUID.randomUUID().toString();
    }

    public boolean addToCart(int amount) {
        // Validate apakah stock mencukupi
        if (this.stock > 0 && amount <= this.stock) {
            this.stock -= amount;
            return true;
        }
        
        return false;
    }

    // Getters and setters
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}