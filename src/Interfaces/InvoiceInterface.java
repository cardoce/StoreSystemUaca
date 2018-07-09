/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Electronic;
import Classes.Product;
import Classes.Software;
import java.util.ArrayList;
import java.util.Optional;



/**
 *
 * @author fernandocardoce
 */
public interface InvoiceInterface {
    public void AddProductToInvoice(String name, Optional<Integer> voltage, String type, double price, 
            int quantity, String code, String presentation, Optional<String> softwareType);
    public ArrayList<String>GetInvoiceData();
    public ArrayList<String> GetProductData(Object product);
    public Electronic GetElectronicProduct(Object product);
    public Software GetSoftwareProduct(Object product);
    public double GetTotalInovicePrice(ArrayList<Product> productList);
}
