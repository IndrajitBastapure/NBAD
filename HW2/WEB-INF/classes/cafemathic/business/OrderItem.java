/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafemathic.business;
import java.io.Serializable;
public class OrderItem implements Serializable{
    private String Product,Quantity;
    public OrderItem(){
        Product="";
        Quantity="";
    }
    public OrderItem(String Product,String Quantity) {
        this.Product=Product;
        this.Quantity=Quantity;
    }
    public void  setProduct(String Product) {
      this.Product=Product;
    }
      public void  setQuantity(String Quantity) {
      this.Quantity=Quantity;
    }
     public String getProduct() {
        return Product;
    }
      public String getQuantity() {
        return Quantity;
    }
      
}
