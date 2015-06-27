package cafemathic.data;

import cafemathic.business.Product;
import cafemathic.utility.DBUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class ProductDB {

    List<Product> products;
    
    private EntityManager getEntityManager() {
        return DBUtil.getEmFactory().createEntityManager();
    }

    public Product addProduct(String productCode, String productName, String catalogCategory, String Description, String imageURL, float productPrice) {
        
        EntityTransaction trans = getEntityManager().getTransaction();
        Product product = new Product(productCode, productName, catalogCategory, Description, imageURL, productPrice);
        trans.begin();
        try {
            getEntityManager().persist(product);
            trans.commit();
            return product;
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
            return null;
        } finally {
            getEntityManager().close();
        }
    }

    public Product addProduct(Product product) {

        EntityTransaction trans = getEntityManager().getTransaction();
        trans.begin();
        try {
            getEntityManager().persist(product);
            trans.commit();
            return product;
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
            return null;
        } finally {
            getEntityManager().close();
        }
    }

    

    public List<Product> getAllProducts() {

        String qString = "SELECT p from Product p";
        TypedQuery<Product> tq = getEntityManager().createQuery(qString, Product.class);
        products = (List<Product>) tq.getResultList();
        return products;
    }

    public Product getProduct(String pcode) {
        Product product;
        try {
            product = getEntityManager().find(Product.class, pcode);

        } finally {
            getEntityManager().close();
        }
        return product;
    }
}
