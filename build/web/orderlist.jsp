<%-- 
    Document   : orderlist
    Created on : Nov 22, 2014, 11:49:00 AM
    Author     : nitesh
--%>

<jsp:include page="includes/header.jsp"/>
        <ol class = "breadcrumb">
            <li class="active">Home&nbsp;&nbsp;</li>
        </ol>
        <jsp:include page="includes/user-navigation.jsp"/>
        <jsp:include page="includes/site-navigation.jsp"/>
        
        
        <article id="main">
            <h3>Orders List</h3>
                    <br>
                    <table>
                    <tr>
                        <th>Order Number</th> 
                        <th>Customer</th>
                        <th>Order Date</th>
                        <th>Total</th>
                    </tr>
                    <% int ordernumber=5;
                        for(int i=0;i<ordernumber;i++) 
                        {%>
                    <tr>
                        <td>1</td>
                        <td>abc</td>
                        <td>date</td>
                        <td>total</td>
                    </tr>
                   <% {%>
                    </table>
            </article> 
        <jsp:include page="includes/footer.jsp"/>
    </body>
</html>
