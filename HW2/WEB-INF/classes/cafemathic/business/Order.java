/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafemathic.business;
import java.io.Serializable;
public class Order implements Serializable{
 private String OrderNumber,Date,User,List;
 private double TaxRate;
 private  double TotalCost;
 private double Paid;
 public Order(){
     OrderNumber="";
     Date="";
     User="";
     List="";
 }
/* public double Order(){
     double TaxRate=0;
    double TotalCost=0;
    double Paid=0;
     return 0;
 }*/
 public Order(String OrderNumber,String Date,String User,String List,double TaxRate,double TotalCost,double Paid) {
     this.OrderNumber=OrderNumber;
     this.Date=Date;
     this.User=User;
     this.List=List;
     this.TaxRate=TaxRate;
     this.TotalCost=TotalCost;
     this.Paid=Paid;
 }
 public void setOrderNumber(String OrderNumber){
    this.OrderNumber=OrderNumber;
}
public void setDate(String Date){
    this.Date=Date;
}
public void setUser(String User){
    this.User=User;
}
public void setList(String List){
    this.List=List;
}
public void setTaxRate(double TaxRate){
    this.TaxRate=TaxRate;
}
public void setTotalCost(double TotalCost){
    this.TotalCost=TotalCost;
}
public void setPaid(double Paid){
    this.Paid=Paid;
}
 public String getOrderNumber(){
     return OrderNumber;
 }
 public  String getDate(){
     return Date;
 }
 public String getUser(){
     return User;
 }
 public String getList(){
     return List;
 }
 public double getTaxRate(){
     return TaxRate;
 }
 public double getTotalCost(){
     return TotalCost;
 }
 public double getPaid(){
     return Paid;
 }

}

