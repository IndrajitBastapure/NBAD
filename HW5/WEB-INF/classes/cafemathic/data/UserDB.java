package cafemathic.data;

import cafemathic.business.User;
import cafemathic.utility.DBUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class UserDB {

    List<User> users;

    private EntityManager getEntityManager() {
        return DBUtil.getEmFactory().createEntityManager();
    }

    public User addUser(int userID, String password, String firstName, String lastName, String email,
            String address1, String address2, String city, String state,
            String zipcode, String country) {

        EntityTransaction trans = getEntityManager().getTransaction();
        User user = new User(userID, password, firstName, lastName, email, address1, address2, city, state, zipcode, country);
        trans.begin();
        try {
            getEntityManager().persist(user);
            trans.commit();
            return user;
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
            return null;
        } finally {
            getEntityManager().close();
        }
    }

    public User addProduct(User user) {

        EntityTransaction trans = getEntityManager().getTransaction();
        trans.begin();
        try {
            getEntityManager().persist(user);
            trans.commit();
            return user;
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
            return null;
        } finally {
            getEntityManager().close();
        }
    }

    public List<User> getAllUsers() {

        String qString = "SELECT u from User u";
        TypedQuery<User> tq = getEntityManager().createQuery(qString, User.class);
        users = (List<User>) tq.getResultList();
        return users;
    }

    public User getUser(int userId) {

        try {
            User user = getEntityManager().find(User.class, userId);
            return user;
        } finally {
            getEntityManager().close();
        }
    }
}
