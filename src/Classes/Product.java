/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author fernandocardoce
 */
public class Product {
    private String name;
    private double price;
    private String type;
    private int quantity;
    private String code;
    private String presentation;

    public Product(String name,double price, String type, int quantity, String code, String presentation) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
        this.code = code;
        this.presentation = presentation;
    }

    public Product() {
    }
    
    public double calculateDiscount(double discount){
        double discountValue;
        discountValue = (price*discount)/100;
        return discountValue;
    }

    public ArrayList<Product> FullProductList(String name, Optional<Integer> voltage,  String type, double price, 
            int quantity, String code, String presentation, Optional<String> softwareType){
        ArrayList<Product> productList= new ArrayList<>();
        switch (type){
           case "Electronic":
               Electronic electronicDevice = new Electronic(voltage, name, price, type, quantity, code, presentation);
              productList.add(electronicDevice);
               break; 
           case "Software":
               Software software = new Software(softwareType, name, price,type,quantity, code,presentation);
              productList.add(software);
               break;
       }
       return productList;
    }
    
//    Getters and Setters
    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
