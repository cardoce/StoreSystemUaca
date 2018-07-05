/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Classes.Product;
import Interfaces.DataAccessInterface;
import java.sql.*;  
import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernandocardoce
 */
public class DataAccess implements DataAccessInterface{

     @Override
    public Connection connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb", "root", "");
            return connection;
        } catch (Exception e) {
            return null;
        }   
    }

    @Override
    public ArrayList<Product> getProducts() {
        ArrayList<Product> productList= new ArrayList<>();
        
        Optional<Integer> voltage=null;
        String name, type, code, presentation;
        double price;
        int quantity = 1;
        Optional<String> softwareType=null;
        try {
             Connection connection = connectToDB();
             Statement stmt;
             stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("select * from product");
             while (rs.next()) {
                 name = rs.getString(2);
                 price = rs.getDouble(3);
                 type = rs.getString(4);
                 code = rs.getString(5);
                 presentation = rs.getString(6);
                 Product product = new Product(name, price, type, quantity, code, presentation);
                 productList.add(product);
             }
         } catch (SQLException ex) {
             Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
         }
         return productList;
    }
   
}
