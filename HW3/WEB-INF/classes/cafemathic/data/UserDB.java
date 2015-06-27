/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafemathic.data;

import cafemathic.business.User;
import java.util.ArrayList;

/**
 *
 * @author precious
 */
public class UserDB {
    
    ArrayList<User> users = new ArrayList<User>();

    public UserDB() {
        users.add(new User("Rickey", "Galor", "rickey@hotmail.com", "1212 canadian dr", "no.108", "charlotte", "NC", "28266", "United Sates"));
        users.add(new User("Peter", "Arevalo", "peter@hotmail.com", "1212 canadian dr", "no.108", "charlotte", "NC", "28266", "United Sates"));
        users.add(new User("Malini", "Chavis", "malini@hotmail.com", "1212 canadian dr", "no.108", "charlotte", "NC", "28266", "United Sates"));
        users.add(new User("Kite", "Penn", "kite@hotmail.com", "1212 canadian dr", "no.108", "charlotte", "NC", "28266", "United Sates"));
        users.add(new User("Rocky", "Renfro", "rocky@hotmail.com", "1212 canadian dr", "no.108", "charlotte", "NC", "28266", "United Sates"));
        users.add(new User("Jhon", "Rice", "jhon@hotmail.com", "1212 canadian dr", "no.108", "charlotte", "NC", "28266", "United Sates"));
        
    }

    public ArrayList<User> getUsers() {
        return users;
    }
    
    
}
