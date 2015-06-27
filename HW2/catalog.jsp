

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="cafemathic.business.Catagory,
        cafemathic.business.CatagoryDB,
        cafemathic.business.Product,
        cafemathic.business.ProductDB
        "
        %>

        <jsp:include page="includes/header.jsp"/>
        <ol class="breadcrumb">
            <li><a  href="home.jsp">Home</a></li>
            <li class="active">&nbsp;Catalog&nbsp;&nbsp;</li>
        </ol>
        <jsp:include page="includes/user-navigation.jsp"/>
        <jsp:include page="includes/site-navigation.jsp"/>
        <article id="main">
            <form action ="CatalogController" method="post">
                <select name="catagoryCode" >                          
                    <option value="00" >All Catagory</option>
                    <% if(request.getAttribute("catagoryCode")!=null && request.getAttribute("catagoryCode").equals("01")) {%>
                    <option value="01" selected>Maths Reference Books</option>
                    <%} else{%>
                    <option value="01" >Maths Reference Books</option>
                    <%}
                    if(request.getAttribute("catagoryCode")!=null && request.getAttribute("catagoryCode").equals("02")) {
                    %>
                    <option value="02" selected>Maths Manipulatives, supplies and resources</option>
                    <%} else{%>
                    <option value="02">Maths Manipulatives, supplies and resources</option>
                    <%}%>
                 </select>
            
            <input type="submit">
        </form>
        <% 
            Catagory catControl = (Catagory)request.getAttribute("currentCatagory");
            if(catControl != null){
                ProductDB productData = new ProductDB();
                    %>
               <h3><%= catControl.getCatagoryName()%></h3>
                <ul>
                <%
                String[] items = catControl.getCatagoryItems();
                
                for(int i=0 ; i <items.length; i++){
                     
                    Product product = productData.getProduct(items[i]);
                %>
                <li><a href="CatalogController?productCode=<%=product.getProductCode()%>"><%= product.getProductName()%></a></li>
                
                
         <%
            }%>
                </ul>
           <% }
            else{
            CatagoryDB catagoryData = new CatagoryDB();
            
            ProductDB productData = new ProductDB();
            ArrayList<Catagory> catagoryArray =  catagoryData.getCatagories();
            for(Catagory cat : catagoryArray){
                
        %>
        
        
                <h3><%= cat.getCatagoryName()%></h3>
                <ul>
                <%
                String[] items = cat.getCatagoryItems();
                
                for(int i=0 ; i <items.length; i++){
                     
                    Product product = productData.getProduct(items[i]);
                %>
                 <li><a href="CatalogController?productCode=<%=product.getProductCode()%>"><%= product.getProductName()%></a></li>
                 <%
                }
                 %>
                </ul>
         <%
            }   
            }
         %>
                
        </article>
        <jsp:include page="includes/footer.jsp"/>
    </body>
</html>
