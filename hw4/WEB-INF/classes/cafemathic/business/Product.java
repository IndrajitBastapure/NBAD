/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafemathic.business;

import java.io.Serializable;
import java.text.NumberFormat;
import javax.persistence.*;

@Entity
public class Product implements Serializable {
    @Id
    private String productCode;
    private String productName;
    private String catalogCategory;
    private String description;
    private String imageURL;    
    private float price;

    public Product(String productCode,String productName, String catalogCategory, String Description, String imageURL, float productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.catalogCategory = catalogCategory;
        this.description = Description;
        this.imageURL = imageURL;
        this.price = productPrice;
    }

    public Product() {
        this.productCode = "";
        this.productName = "";
        this.catalogCategory = "";
        this.description = "";
        this.imageURL = "";
        this.price = 0;
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
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public float getPrice() {
       
        return price;
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
        this.description = Description;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setPrice(float productPrice) {
        this.price = productPrice;
    }
public String getTotalCurrencyFormat(){
          NumberFormat currency = NumberFormat.getCurrencyInstance();
          return currency.format(this.getPrice());
      }
    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", catalogCategory=" + catalogCategory + ", Description=" + description + ", imageURL=" + imageURL + ", productPrice=" + price + '}';
    }
    
    
}
