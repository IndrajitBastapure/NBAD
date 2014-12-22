<%-- 
    Document   : contact.jsp
    Created on : Sep 16, 2014, 10:45:29 AM
    Author     : Sybilla Dantas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <jsp:include page="includes/header.jsp"/>
        <ol class="breadcrumb">
            <li><a  href="home.jsp">Home</a></li>
            <li class="active">&nbsp;Contact&nbsp;&nbsp;</li>
        </ol>
        <jsp:include page="includes/user-navigation.jsp"/>
        <jsp:include page="includes/site-navigation.jsp"/>
        <article id="main">
            <h4>Contact US</h4>
                <table class="contactTable">
                    <tr>
                        <td>United States</td>
                    </tr>
                    <tr>
                        <td>1-800-000-0000</td>
                    </tr>
                    <tr>
                        <td>24/7</td>
                    </tr>
                    <tr>       
                        <td>&nbsp;&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Address</td>
                    </tr>
                    <tr>
                        <td>2000 mac'cough ln,</td>
                    </tr> 
                    <tr>
                        <td>suit 300,</td>
                    </tr>
                    <tr>
                        <td>Charlotte</td>
                    </tr>
                    <tr>
                    <td>NC, 300678</td>
                    </tr>
                    <tr>
                        <td>Provide your contact details</td>
                    </tr>
                </table>
                <table>
                    <tr>
                        <td>Name </td>
                        <td>
                            <input type="text" name="name"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Phone number </td>
                        <td>
                            <input type="text" name="phone"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Address </td>
                        <td>
                            <input type="text" name="address"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Email </td>
                        <td>
                            <input type="email" name="email"/>
                        </td>
                    </tr>
                    <tr>
                        <td> </td>
                        <td>
                            <form action = "home.jsp">
                                <input class="cartButton2" type="submit" value="Submit"/>
                            </form>
                        </td>
                    </tr>
                </table>
            
        </article> 
        <jsp:include page="includes/footer.jsp"/>
    </body>
</html>
