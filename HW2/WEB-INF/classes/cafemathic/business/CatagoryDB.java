/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafemathic.business;

import java.util.ArrayList;

/**
 *
 * @author precious
 */
public class CatagoryDB {
   public ArrayList<Catagory> catagoryArray = new ArrayList<Catagory>();

    public CatagoryDB() {
        String[] mathsReferenceBooksArray= {"100",
            "101",
            "102",
            "103",
            "104",
            "105",
            "106",
            "107"};
        String[] mathsManupulativeSuppliesArray= {"108",
            "109",
            "110",
            "111",
            "112"};

        catagoryArray.add(new Catagory("01", "Maths Reference Books",mathsReferenceBooksArray));
        catagoryArray.add(new Catagory("02", "Maths Manipulatives, supplies and resources",mathsManupulativeSuppliesArray));
    }
   public ArrayList<Catagory> getCatagories(){
          
     return catagoryArray;

   } 
   public Catagory getCatagory(String catagoryCode){
          for(Catagory cat : catagoryArray){
              if (cat.getCatagoryCode().equals(catagoryCode)){
                  return cat;
              }
    } 
          return null;
   }
}
