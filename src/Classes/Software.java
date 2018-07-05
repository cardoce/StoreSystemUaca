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
public class Software extends Product{
    private String softwareType;

    public Software(Optional<String> softwareType, String name, double price, String type, int quantity, String code, String presentation) {
        super(name, price, type, quantity, code, presentation);
        this.softwareType = softwareType.get();
    }

    public ArrayList<String> getSoftwareDataInAList(){
        ArrayList<String> productData = new ArrayList<>();
        productData.add(getName());
        productData.add(String.valueOf(getPrice()));
        productData.add(getPresentation());
        productData.add(getCode());
        productData.add(String.valueOf(getQuantity()));
        productData.add(getSoftwareType());
        return productData;
    }

    public String getSoftwareType() {
        return softwareType;
    }

    public void setSoftwareType(String softwareType) {
        this.softwareType = softwareType;
    }
    
}
