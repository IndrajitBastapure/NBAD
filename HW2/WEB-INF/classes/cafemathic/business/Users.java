/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafemathic.business;
import java.io.Serializable;
public class Users  implements Serializable{
    private String FirstName,LastName,EmailAddress,Address1Field,Address2Field,City,State,PostCode,Country;
    public Users() {
        FirstName="";
        LastName="";
        EmailAddress="";
        Address1Field="";
        Address2Field="";
        City="";
        State="";
        PostCode="";
        Country="";
    }
   public Users(String FirstName,String LastName,String EmailAddress,String Address1Field,
            String Address2Field,String City,String State,String PostCode,String Country) {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.EmailAddress=EmailAddress;
        this.Address1Field=Address1Field;
        this.Address2Field=Address2Field;
        this.City=City;
        this.PostCode=PostCode;
        this.State=State;
        this.Country=Country;
    }
   public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
public void setLastName(String LastName) {
        this.LastName=LastName;
}
public void setEmailAddress(String EmailAddress) {
        this.EmailAddress=EmailAddress;
}
public void setAddress1Field(String Address1Field) {
        this.Address1Field=Address1Field;
}
public void setAddress2Filed(String Address2Field) {
        this.Address2Field=Address2Field;
}
public void setCity(String City) {
        this.City=City;
}
public void setPostCode(String PostCode) {
        this.PostCode=PostCode;
}
public void setState(String State) {
        this.State=State;
}
public void setCountry(String Country) {
        this.Country=Country;
}
    public String getFirstName() {
        return FirstName;
    }
    public String getLasstName() {
        return LastName;
    }
    public String getEmailAddress() {
        return EmailAddress;
    }
    public String getAddress1Field() {
        return Address1Field;
    }
    public String getAddress2Field() {
        return Address2Field;
    }
    public String getCity() {
        return City;
    }
    public String getPostCode() {
        return PostCode;
    }
    public String getState() {
        return State;
    }
    public String getCountry() {
        return Country;
    }

public String toString() {
    return "Is this function also required???";
}
}
