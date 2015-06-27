/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafemathic.business;
import java.io.Serializable;
import java.text.NumberFormat;
public class OrderItem implements Serializable{
    private Product product;
    private int quantity;

    public OrderItem() {
    }
    
    
    public void  setProduct(Product p) {
      this.product = p;
    }
      public void  setQuantity(int quantity) {
      this.quantity=quantity;
    }
     public Product getProduct() {
        return product;
    }
      public int getQuantity() {
        return quantity;
    }
      public double getTotal(){
          double total = product.getProductPrice()*quantity;
          return total;
      }
      public String getTotalCurrencyFormat(){
          NumberFormat currency = NumberFormat.getCurrencyInstance();
          return currency.format(this.getTotal());
      }
      
}
