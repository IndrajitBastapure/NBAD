

package cafemathic.business;

import java.util.ArrayList;

public class ProductDB {
    
    public ArrayList<Product> products = new ArrayList<Product>();

    public ProductDB() {
        products.add(new Product("100",
                                "Basic Maths Formula",
                                "Maths Reference Books",
                                "This is a third edition of award winning Math-A-Trick. This book provides essential math skills to everyday life with best tricky solutions. Tested and full proof trick for every calculation. With this book in your packet you do not need a calculator in your pocket!!",
                                "images/book1.png",
                                51.00));
        products.add(new Product("101",
                                "Advanced Maths Formula",
                                "Maths Reference Books",
                                "Written by the famous Mathemeatician - Shekuntala Devi.This book provides the detailed list of all the Math Formulaes to all school levels and additional exercise helps in improving Maths Skills for the student. Grab your copy now!!!",
                                "images/book1.png",
                                58.00));
        products.add(new Product("102",
                                "GRE Maths",
                                "Maths Reference Books",
                                "The 2nd Edition Kumar Publishers by Author Ali  provides the student with greater knowledge in each topic and many practise exercise after every topic helps to achieve the Target of the student",
                                "images/gre.gif",
                                60.50));
        products.add(new Product("103",
                                "GMAT Maths",
                                "Maths Reference Books",
                                "GMAT Maths- The Complete Reference, by Wifi Publishers. This book provides the basic understanding of math concepts for Beginners,Intermediate, Advanced Levels. Free Pratice tests provided inside.",
                                "images/gmat.gif",
                                51.60));
        products.add(new Product("104",
                                "Pre Calculus",
                                "Maths Reference Books",
                                "Calculus by Gold boy 2nd Edition. the famous book sold out in record number is back with more advanced topics and examples for beginners. This book provides essential skills to enhance the calculus knowledge",
                                "images/calculus.gif",
                                50.00));
        products.add(new Product("105",
                                "Elementary Statistics",
                                "Maths Reference Books",
                                "The 3rd Edition published by Chris Tree Publications, Covers the advanced topics like Applied Statistics, Theoratical Statistics and Machine Learning for Higher studies ",
                                "images/Estatistics.gif",
                                20.00));
        products.add(new Product("106",
                                "Business Statistics",
                                "Maths Reference Books",
                                "Business Staistics-10th Edition By Arya Bhatta. This book provides the staistical calculations and analysis models required to develop a business data. New Edition include Topics like Business Mathematics , Economic Data  and Staistics Stub",
                                "images/Bstatistics.gif",
                                36.99));
        products.add(new Product("107",
                                "Probability Distribution",
                                "Maths Reference Books",
                                "Probablity Distribution -8th Edition by MyMath Publications. This book is mostly useful for Engineering students. Includes the general topics with advanced technical implementation for solutions.10 % off on first 100 purchases ",
                                "images/PandS.gif",
                                20.00));
        products.add(new Product("108",
                                "Basic Calculator",
                                "Maths Manipulatives, supplies and resources",
                                "Basic Calculator by Digi Systems provides the basic calculator for daily use in home, office for students. special offers for school students on purchase of Digi System Tablets.",
                                "images/BasicCalc.gif",
                                20.00));
        products.add(new Product("109",
                                "Advanced Calculator",
                                "Maths Manipulatives, supplies and resources",
                                "Avanced Calc- I can calculate any thing. This product can solve upto 32 digits of calculation. The latest product is exceptional in performing larger number operations used by Engineers and Researchers",
                                "images/AdvCalc.gif",
                                40.00));
        products.add(new Product("110",
                                "Maths GRE Flash cards",
                                "Maths Manipulatives, supplies and resources",
                                "Gre Flash-5000 by Sybroski. The Flash cards provide the complete meanings of GRE and GMAT Aspiriants. This cards can help the students to learn more in less time and achieve the target score. ",
                                "images/greflash.gif",
                                15.00));
        products.add(new Product("111",
                                "geometry/trigonometry flash cards",
                                "Maths Manipulatives, supplies and resources",
                                "Geometry Flash Cards by Silver Collins. This card is essential guide to children to enhance their knowledge in Geometry. Clear description of problem with images help the children to understand in better way makes this book childrrens choice",
                                "images/alge-gemtry.gif",
                                19.00));
        products.add(new Product("112",
                                "Algebra Supplies",
                                "Maths Manipulatives, supplies and resources",
                                "Algebra Equipments by Cam Corporations is one of the best suppliers in the town with best quality to the price. Special offers applicable for bulk orders",
                                "images/alge-supplies.gif",
                                19.00));
    }
    
    public Product getProduct(String productCode){
          
        for (Product p : products){
            if(p.getProductCode().equals(productCode)){
                return p;
            }
                
        }
    return null;
    }
   
            
}