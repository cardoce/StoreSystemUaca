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
public class Hardware extends Computer {
    private String accessory;

    public Hardware(Optional<String> accessory, Optional<String> serialNumber, Optional<Integer> voltage, String name, double price, String type, int quantity, String code, String presentation) {
        super(serialNumber, voltage, name, price, type, quantity, code, presentation);
        this.accessory = accessory.get();
    }
    
    public ArrayList<String> getHardwareDataInAList() {
        ArrayList<String> productData = new ArrayList<>();
        productData.add(getName());
        productData.add(String.valueOf(getPrice()));
        productData.add(getPresentation());
        productData.add(getCode());
        productData.add(String.valueOf(getQuantity()));
        productData.add(getSerialNumber());
        productData.add(getAccessory());
        return productData;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }
    

}
