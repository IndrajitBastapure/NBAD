
package cafemathic.order;

import cafemathic.business.Cart;
import cafemathic.business.Order;
import cafemathic.business.OrderItem;
import cafemathic.business.Product;
import cafemathic.business.User;
import java.io.IOException;
import cafemathic.data.ProductDB;
import cafemathic.data.UserDB;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "OrderController", urlPatterns = {"/OrderController"})
public class OrderController extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        String url = "";
        double subTotal = 0;
        //ArrayList<String> sessionProductList = new ArrayList<String>();
        ProductDB productDB = new ProductDB();
        Product p = new Product();
        
       
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("theShoppingCart");
       
        if(cart == null){
            cart = new Cart();
            session.setAttribute("theShoppingCart", cart);
        }
        
        String action = request.getParameter("action");
        
        if(action == null){
            action = "updateCart";
            url = "/cart.jsp";
        }
        
        if(action.equals("updateCart")){
            //for(int k = 0 ; k < cart.items.size(); k ++){
                
            //}
            String[] productList = request.getParameterValues("productList");
            if(productList != null){
                for (int i = 0 ; i < productList.length ; i++){
                    if (productDB.getProduct(productList[i])!= null ){
                        String productCode = productList[i];
                        int quantity = 0;
                        if(productList.length == 1 && Integer.parseInt(request.getParameter(productList[i]))==1){
                        if (cart.items.size() != 0 && cart.items.size()!= 1 ){
                        for(int k = 0 ; k < cart.items.size(); k ++){
                           if (cart.getItems().get(k).getProduct().getProductCode().equals(productCode)){
                             quantity = (cart.getItems().get(k).getQuantity())+ 1;
                           }else{
                               try{
                                
                                quantity = Integer.parseInt(request.getParameter(productList[i]));
                                
                                }catch (NumberFormatException e){}
                               
                           }
                        }
                        }else{
                               try{
                                
                                quantity = Integer.parseInt(request.getParameter(productList[i]));
                                
                                }catch (NumberFormatException e){}
                               
                           }
                        }else{
                               try{
                                
                                quantity = Integer.parseInt(request.getParameter(productList[i]));
                                
                                }catch (NumberFormatException e){}
                               
                           }
                      
                        
                                OrderItem item = new OrderItem();
                                item.setProduct(productDB.getProduct(productCode)); 
                                item.setQuantity(quantity);
                        
                        
                        if(quantity > 0){
                            cart.addItem(item);
                            subTotal = 0;
                           
                        }else if(quantity == 0){
                            
                            cart.removeItem(item);
                            subTotal = 0;
                            session.setAttribute("subTotal", subTotal);
                        }
                     }
                        for(int j = 0 ; j < cart.items.size(); j ++){
                           OrderItem item =  cart.getItems().get(j);
                           subTotal = subTotal + item.getTotal();
                           NumberFormat.getCurrencyInstance().format(subTotal);
                           //DecimalFormat df = new DecimalFormat("0.00");
                           //df.format(subTotal);
                           session.setAttribute("subTotal", subTotal);
                        }
                        session.setAttribute("theShoppingCart", cart);
                        url = "/cart.jsp";

                }
            }
        } 
        else if(action.equals("checkOut")){
            UserDB users = new UserDB();
            User user = new User();
            user = users.getUser(2);
            session.setAttribute("theUser", user);
            Order order = new Order();
            order.setOrderNumber("NM023345122");
            order.setDate(Calendar.getInstance().getTime());
            order.setItems(cart.getItems());
            double total = 0;
            for (int i = 0 ; i < cart.getItems().size() ; i++){
                OrderItem item = cart.getItems().get(i);
                total = total + item.getTotal();
            }
                
            order.setPaid(true);
            order.setTaxRate(0.2);
            order.setTotalCost(total);
            session.setAttribute("currentOrder", order);
            url = "/order.jsp";
            
        }
        else if(action.equals("removeAll")){
            
            cart = (Cart)session.getAttribute("theShoppingCart");
            cart.emptyCart();
            subTotal = 0;
            session.setAttribute("subTotal", subTotal);
            session.setAttribute("theShoppingCart", cart);
            url = "/catalog.jsp";
            
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
