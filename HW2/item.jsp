<%-- 
    Document   : item
    Created on : Sep 16, 2014, 10:15:57 AM
    Author     : precious
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="cafemathic.business.Product"%>
       
        <jsp:include page="includes/header.jsp"/>
        <ol class="breadcrumb">
            <li><a  href="home.jsp">Home</a></li>
            <li><a class="breadcrumb" href="catalog.jsp">&nbsp;Catalog</a></li>
            <li class="active">&nbsp;Item&nbsp;&nbsp;</li>
        </ol>
        <jsp:include page="includes/user-navigation.jsp"/>
        <jsp:include page="includes/site-navigation.jsp"/>
        <% Product product = (Product)request.getAttribute("currentSelectedProduct");
            
        %>
        <article id="main">
                <img id="bookimg" src=<%= product.getImageURL()%> alt="cartImage" class="cartimg"/>
                <h3><%= product.getProductName() %> </h3>
                     <%= product.getCatalogCategory() %>
                <br>
                     $<%= product.getProductPrice() %>
                <br>
                <br>
                <br>
                <p> 
                    <%= product.getDescription() %>
                    
                </p>
                
                
                <form action="cart.jsp">
                    
                    <input class="cartButton" type="submit" value="Add To Cart"/>
                </form>
                <br>
                <br>
                <a  href ="catalog.jsp">Return To Catalog</a>
            </article>
        <jsp:include page="includes/footer.jsp"/>
    </body>
</html>
