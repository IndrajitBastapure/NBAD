/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafemathic.business;
import java.io.Serializable;
public class User  implements Serializable{
    private String firstName,lastName,emailAddress,addressField1,addressField2,city,state,postCode,country;
    public User() {
        firstName="";
        lastName="";
        emailAddress="";
        addressField1="";
        addressField2="";
        city="";
        state="";
        postCode="";
        country="";
    }

    public User(String firstName, String lastName, String emailAddress, String addressField1, String addressField2, String city, String state, String postCode, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.addressField1 = addressField1;
        this.addressField2 = addressField2;
        this.city = city;
        this.state = state;
        this.postCode = postCode;
        this.country = country;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddressField1() {
        return addressField1;
    }

    public void setAddressField1(String addressField1) {
        this.addressField1 = addressField1;
    }

    public String getAddressField2() {
        return addressField2;
    }

    public void setAddressField2(String addressField2) {
        this.addressField2 = addressField2;
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
   

}