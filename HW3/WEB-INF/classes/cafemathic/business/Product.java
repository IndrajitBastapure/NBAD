/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafemathic.business;

import java.io.Serializable;
import java.text.NumberFormat;

public class Product implements Serializable {
    
    private String productName,catalogCategory, Description, imageURL;
    private String productCode;
    private double productPrice;

    public Product(String productCode,String productName, String catalogCategory, String Description, String imageURL, double productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.catalogCategory = catalogCategory;
        this.Description = Description;
        this.imageURL = imageURL;
        this.productPrice = productPrice;
    }

    public Product() {
        this.productCode = "";
        this.productName = "";
        this.catalogCategory = "";
        this.Description = "";
        this.imageURL = "";
        this.productPrice = 0;
    }
    public String getProductCode() {
        return productCode;
    }
    public String getProductName() {
        return productName;
    }

    public String getCatalogCategory() {
        return catalogCategory;
    }

    public String getDescription() {
        return Description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public double getProductPrice() {
       
        return productPrice;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCatalogCategory(String catalogCategory) {
        this.catalogCategory = catalogCategory;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
public String getTotalCurrencyFormat(){
          NumberFormat currency = NumberFormat.getCurrencyInstance();
          return currency.format(this.getProductPrice());
      }
    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", catalogCategory=" + catalogCategory + ", Description=" + Description + ", imageURL=" + imageURL + ", productPrice=" + productPrice + '}';
    }
    
    
}
