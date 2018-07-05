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
public class Computer extends Electronic {
    private String serialNumber;

    public Computer(Optional<String> serialNumber, Optional<Integer> voltage, String name, double price, String type, int quantity, String code, String presentation) {
        super(voltage, name, price, type, quantity, code, presentation);
        this.serialNumber = serialNumber.get();
    }

    public ArrayList<String> getComputerDataInAList() {
        ArrayList<String> productData = new ArrayList<>();
        productData.add(getName());
        productData.add(String.valueOf(getPrice()));
        productData.add(getPresentation());
        productData.add(getCode());
        productData.add(String.valueOf(getQuantity()));
        productData.add(getSerialNumber());
        return productData;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    
}
