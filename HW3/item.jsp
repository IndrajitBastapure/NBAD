<%-- 
    Document   : item
    Created on : Sep 16, 2014, 10:15:57 AM
    Author     : precious
--%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <article id="main">
                <img id="bookimg" src=${currentSelectedProduct.getImageURL()} alt="BookLogo" class="cartimg"/>
                <h3>${currentSelectedProduct.getProductName()} </h3>
                    ${currentSelectedProduct.getCatalogCategory()}
                     
                <br>
                    ${currentSelectedProduct.getProductPrice()}
                <br>
                <br>
                <br>
                <p> 
                    ${currentSelectedProduct.getDescription()} 
                    
                </p>
                
                
                <form action="updateCart" method="post">
                    <input type ="hidden" name = "productList" value='${currentSelectedProduct.productCode}'/>
                    <input type ="hidden" name = '${currentSelectedProduct.productCode}' value="1"/>
                    <input class="cartButton" type="submit" value="Add To Cart"/>
                </form>
                <br>
                <br>
                <a  href ="catalog.jsp">Return To Catalog</a>
            </article>
        <jsp:include page="includes/footer.jsp"/>
    </body>
</html>
