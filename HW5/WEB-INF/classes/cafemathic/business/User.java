/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafemathic.business;
import java.io.Serializable;
import javax.persistence.*;
@Entity
public class User  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    private String password;
    private String firstName;
    private String lastName; 
    private String emailAddr;
    private String address1Field;
    private String address2Field;
    private String city;
    private String state;
    private String zipPostalCode;
    private String country;
    
    
    public User() {
        userID = 0;
        password = "";
        firstName="";
        lastName="";
        emailAddr="";
        address1Field="";
        address2Field="";
        city="";
        state="";
        zipPostalCode="";
        country="";
    }

    public User(int userID, String password, String firstName, String lastName, String emailAddr, String address1Field, String address2Field, String city, String state, String zipPostalCode, String country) {
        this.userID = userID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddr = emailAddr;
        this.address1Field = address1Field;
        this.address2Field = address2Field;
        this.city = city;
        this.state = state;
        this.zipPostalCode = zipPostalCode;
        this.country = country;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getAddress1Field() {
        return address1Field;
    }

    public void setAddress1Field(String address1Field) {
        this.address1Field = address1Field;
    }

    public String getAddress2Field() {
        return address2Field;
    }

    public void setAddress2Field(String address2Field) {
        this.address2Field = address2Field;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipPostalCode() {
        return zipPostalCode;
    }

    public void setZipPostalCode(String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
   

}