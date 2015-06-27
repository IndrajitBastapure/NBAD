/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafemathic.business;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author precious
 */
public class Cart implements Serializable{
    public ArrayList<OrderItem> items;

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public int getCount(){
        return items.size();
    }
    public Cart() {
        items = new ArrayList<OrderItem>();
    }
    public void addItem(OrderItem item){
        String code = item.getProduct().getProductCode();
        int quantity = item.getQuantity();
        for (int i = 0 ; i < items.size() ; i++){
            OrderItem orderItem = items.get(i);
            if(orderItem.getProduct().getProductCode().equals(code)){
                orderItem.setQuantity(quantity);
                return;
            }
        }
        items.add(item);
    }
        public void removeItem(OrderItem item){
        String code = item.getProduct().getProductCode();
        for (int i = 0 ; i < items.size() ; i++){
           OrderItem orderItem = items.get(i);
           if(orderItem.getProduct().getProductCode().equals(code)){
               items.remove(i);
               return;
           }
        }
    }
    public void emptyCart(){
        items.removeAll(items);
    }
}

