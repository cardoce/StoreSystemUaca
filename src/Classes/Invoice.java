/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Date;
import Interfaces.InvoiceInterface;
import java.util.Optional;
/**
 *
 * @author fernandocardoce
 */
public class Invoice implements InvoiceInterface {
    private String invoceNumber;
    private ArrayList<Product> productList = new ArrayList<>();
    private Date invoiceDate;
    private double discount;
    private Integer codeIndex = 1000;
    private double totalPrice;

    @Override
    public void AddProductToInvoice(String name, Optional<Integer> voltage,  String type, double price, 
            int quantity, String code, String presentation, Optional<String> softwareType) {
       switch (type){
           case "Electronic":
               Electronic electronicDevice = new Electronic(voltage, name, price, type, quantity, code, presentation);
              this.productList.add(electronicDevice);
               break; 
           case "Software":
               Software software = new Software(softwareType, name, price,type,quantity, code,presentation);
              this.productList.add(software);
               break;
       }
    }

    @Override
    public ArrayList<String> GetInvoiceData() {
        ArrayList<String> invoiceData = new ArrayList<>();
        invoiceData.add(this.invoceNumber);
        invoiceData.add(String.valueOf(this.invoiceDate));
        invoiceData.add(String.valueOf(this.discount));
        return invoiceData;
    }
//   Method GetProductData Refactor move every if to a method in every class that returns the ArrayList<String>
    
    @Override
    public ArrayList<String> GetProductData(Object product) {
        ArrayList<String> productData = new ArrayList<>();
        if (product instanceof Electronic) {
            Electronic electronicProduct = GetElectronicProduct(product);
            productData.addAll(electronicProduct.getElectronicDataInAList());
        } else if(product instanceof Software){
            Software softwareProduct = GetSoftwareProduct(product);
            productData.addAll(softwareProduct.getSoftwareDataInAList());
        }
        return productData;
    }
    
    @Override
    public Electronic GetElectronicProduct(Object product) {
        Electronic electronicProduct = Electronic.class.cast(product);
        return electronicProduct;
    }
    @Override
    public Software GetSoftwareProduct(Object product) {
        Software softwareProduct = Software.class.cast(product);
        return softwareProduct;
    }
    
    public void AddListProductsToInvoiceList(ArrayList<Product> productList){
        this.productList.addAll(productList);
    }

    @Override
    public double GetTotalInovicePrice(ArrayList<Product> productList) {
       double totalInvoicePrice = 0;
       for(int i =0;productList.size()>i;i++){
                if (productList.get(i) instanceof Electronic) {
                    Electronic electronicProduct = GetElectronicProduct(productList.get(i));
                    totalInvoicePrice = 
                        totalInvoicePrice + (electronicProduct.getPrice()-
                            electronicProduct.calculateDiscount(discount))*electronicProduct.getQuantity();
                }
//                } if (productList.get(i) instanceof Software) {
//                    Software esoftwareProduct = GetSoftwareProduct(productList.get(i));
//                    totalInvoicePrice = 
//                        totalInvoicePrice + (softwareProduct.getPrice()-
//                            electronicProduct.calculateDiscount(discount))*electronicProduct.getQuantity();
//                }
       }
       return totalInvoicePrice;
    }

    private boolean ValidatesDate(Date invoiceDate){
        Date today = new Date();
        today.setHours(0);
        return invoiceDate.after(today);
    }
    
    private String GenerateCode(){
        String code =  "2018COD"+codeIndex;
        codeIndex+=1;
        return code;
    }
    
//    Getters and Setters
    public String getInvoceNumber() {
        return invoceNumber;
    }

    public void setInvoceNumber() {
        this.invoceNumber = GenerateCode();
        
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Integer getCodeIndex() {
        return codeIndex;
    }

    public void setCodeIndex(Integer codeIndex) {
        this.codeIndex = codeIndex;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {
        this.totalPrice = GetTotalInovicePrice(productList);
    }


}
