
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <jsp:include page="includes/header.jsp"/>
        <ol class="breadcrumb">
            <li><a  href="home.jsp">Home</a></li>
            <li><a class="breadcrumb" href="catalog.jsp">&nbsp;Catalog</a></li>
            <li class="active">&nbsp;Cart&nbsp;&nbsp;</li>
        </ol>
        <jsp:include page="includes/user-navigation.jsp"/>
        <jsp:include page="includes/site-navigation.jsp"/>
        
        <article id="main">
                    <h2>Your Cart</h2>
                    <table class="cartheader" >
                        <tr>
                            <td class="ch1">
                                
                            </td>
                            
                            <td class="ch2" >
                                To remove an item change the quantity to zero
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                &nbsp;
                            </td>
                        </tr>
                    </table>
                    <form action="updateCart">
                        <table class="cartTable" >
                            <tr class="cartTableHeader">
                                <th>Item</th>
                                <th>Price</th>
                                <th>Quantity</th>
                                <th>Total</th>
                            </tr>
                            <tr>
                                <td colspan="4" class="ct1"></td>
                            </tr>
                            <c:forEach var = "item" items="${theShoppingCart.items}">
                                <tr>
                                    <td>${item.getProduct().productName}</td>
                                    <td>${item.getProduct().productPrice}</td>
                                    <td><input type ="hidden" name = "productList" value='${item.getProduct().productCode}'/>
                                        <input type="number" name ='${item.getProduct().productCode}' value = "${item.quantity}" />
                                    </td>
                                    <td>${item.getTotal()}</td>
                            </tr>
                            </c:forEach>
                            <tr>
                                <td></td>
                                <td></td>
                                <td>Subtotal </td>
                                <td>$${subTotal}</td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                </tr>
                    </table> 
                    <input type ="hidden" name = "action" value="updateCart"/>
                    <input class="cartButton1" type="submit" value="Update Cart"/>
                </form>
                            <br>
                            <br>
                            <br>
                <form action="checkOut" method="post">
                   <input type ="hidden" name = "action" value="checkOut"/>
                   <input class="cartButton2" type="submit" value="Checkout"/>
                </form>
             </article>
        <jsp:include page="includes/footer.jsp"/>
    </body>
</html>
