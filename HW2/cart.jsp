<%-- 
    Document   : cart
    Created on : Sep 16, 2014, 10:15:41 AM
    Author     : precious
--%>

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
                    <table class="cartTable" >
                        <tr class="cartTableHeader">
                            <th>Item</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total</th>
                        </tr>
                        <tr>
                            <td colspan="4" class="ct1">
                             
                            </td>
                        </tr>
                        
                        <tr>
                            <td>Maths statistics</td>
                            <td>$65.00</td>
                            <td>
                                <input type="number" value="1"/>
                            </td>
                            <td>$65</td>
                        </tr>
                        <tr>
                            <td>GRE Flash Cards</td>
                            <td>$15.00</td>
                            <td>
                                <input type="number" value="2"/>
                            </td>
                            <td>$30</td>
                        </tr>
                        <tr>
                            <td>Calculator (advanced)</td>
                            <td>$150.00</td>
                            <td>
                                <input type="number" value="1"/>
                            </td>
                            <td>$150</td>
                        </tr>
                        <tr>
                            <td colspan="4" class="ct1">
                             
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td>Subtotal</td>
                            <td>$245</td>
                        </tr>
                        <tr>
                        <td></td>
                            <td></td>
                            <td>
                                <form action="cart.jsp">
                                    <input class="cartButton1" type="submit" value="Update Cart"/>
                                </form>                               
                            </td>
                            <td></td>
                        </tr>
                        <tr>
                        <td></td>
                            <td></td>
                            <td>
                                <form action="home.jsp">
                                 <input class="cartButton2" type="submit" value="Checkout"/>
                                </form>                               
                            </td>
                            <td></td>
                        </tr>
                    </table> 
             </article>
        <jsp:include page="includes/footer.jsp"/>
    </body>
</html>
