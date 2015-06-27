/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafemathic.business;


public class Catagory {
    String catagoryCode,catagoryName;
            String[] catagoryItems;

    public Catagory(String catagoryCode, String catagoryName, String[] catagoryItems) {
        this.catagoryCode = catagoryCode;
        this.catagoryName = catagoryName;
        this.catagoryItems = catagoryItems;
    }

    public String getCatagoryCode() {
        return catagoryCode;
    }

    public void setCatagoryCode(String catagoryCode) {
        this.catagoryCode = catagoryCode;
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }

    public String[] getCatagoryItems() {
        return catagoryItems;
    }

    public void setCatagoryItems(String[] catagoryItems) {
        this.catagoryItems = catagoryItems;
    }

    
    
}
