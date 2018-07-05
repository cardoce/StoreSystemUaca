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
public class Electronic extends Product{
    private int voltage;

    public Electronic(Optional<Integer> voltage, String name, double price, String type, int quantity, String code, String presentation) {
        super(name, price, type, quantity, code, presentation);
        this.voltage = voltage.get();
    }

    public ArrayList<String> getElectronicDataInAList(){
        ArrayList<String> productData = new ArrayList<>();
        productData.add(getName());
        productData.add(String.valueOf(getPrice()));
        productData.add(getPresentation());
        productData.add(getCode());
        productData.add(String.valueOf(getQuantity()));
        productData.add(String.valueOf(getVoltage()));
        return productData;
        
    }

//    Getters and Setters
    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
}
