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
            <form action ="home.jsp">
                <table class="contactTable">
                    <tr class="ContactText">
                        <td>
                            Contact Us
                            <br>
                            <br>
                            United States
                            <br>
                            1-800-000-0000
                            <br>
                            24/7
                            <br>
                        </td>
                        <td>&nbsp;&nbsp;</td>
                        <td>
                            <br>
                            <br>
                            Address
                            <br>
                            2000 mac'cough ln,  
                            <br>
                            suit 300,
                            <br>
                            Charlotte
                            <br>
                            NC, 300678
                        </td>
                    </tr>
                    <tr>
                        <td>Provide your contact details</td>
                    <br>
                    </tr>
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
            </form>
        </article> 
        <jsp:include page="includes/footer.jsp"/>
    </body>
</html>
