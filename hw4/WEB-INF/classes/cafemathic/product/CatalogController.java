

package cafemathic.product;

import cafemathic.business.Catagory;
import cafemathic.business.Product;
import cafemathic.data.ProductDB;
import cafemathic.data.CatagoryDB;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "CatalogController", urlPatterns = {"/CatalogController"})
public class CatalogController extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String url;
        
        String productCode = request.getParameter("productCode");
        String catagoryCode = request.getParameter("catagoryCode");
        //String catagoryCode1 = request.getParameter("catagory");
        
        if(catagoryCode!=null){
            CatagoryDB catagoryData = new CatagoryDB();
            Catagory cat = catagoryData.getCatagory(catagoryCode);
                url = "/catalog.jsp";
            request.setAttribute("currentCatagory", cat);
            }
        if (productCode == null){
            url = "/catalog.jsp";
        }else{
            
            ProductDB productDB = new ProductDB();
            Product product = productDB.getProduct(productCode);
            if(product==null){
                url = "/catalog.jsp";
            }else{
            request.setAttribute("currentSelectedProduct", product);
            url = "/item.jsp";
            }
        }
        request.setAttribute("catagoryCode",catagoryCode);
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
       /* HttpSession session = request.getSession(true);
        session.setAttribute("productCode", product.getProductName());*/
        
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
