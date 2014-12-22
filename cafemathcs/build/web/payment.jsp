<%-- 
    Document   : home
    Created on : Sep 16, 2014, 10:02:30 AM
    Author     : precious
--%>

        <jsp:include page="includes/header.jsp"/>
        <ol class = "breadcrumb">
            <li class="active">Home&nbsp;&nbsp;</li>
        </ol>
        <jsp:include page="includes/user-navigation.jsp"/>
        <jsp:include page="includes/site-navigation.jsp"/>
        
        
        <article id="main">
            <h4>Enter your Payment Information
                    <br>
                    <table>
                        <tr>
                        <td>Credit Card Type</td>
                        <td>
                        <select name="Card">
                            <option value="Visa" selected>Visa</option>
                        <option value="Master">Master</option>
                        <option value="Discover">Discover</option>
                        <option value="American Express">American Express</option>
                        </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Card Number</td>
                            <td><input type ="text" name="text" maxlength="16"> </td>
                        </tr>
                        <tr>
                            <td>Expiration Date(MM /YYYY)</td>
                            <td><select name="Month">
                        <option value="December">Dec </option>
                        <option value="January">Jan</option>
                        <option value="February">Feb</option>
                        <option value="March ">Mar</option>
                        <option value="April ">Mar</option>
                        <option value="May ">Apr</option>
                        <option value="June ">Jun</option>
                        <option value="July ">Jul</option>
                        <option value="August ">Aug</option>
                        <option value="September ">Sep</option>
                        <option value="October ">Oct</option>
                        <option value="November ">Nov</option>
                         </select>
                            
                                <select>
                                <option value="Year ">select</option>
                                <option value="2014 ">2014</option>
                                <option value="2015 ">2015</option>
                                <option value="2016 ">2016</option>
                                <option value="2017 ">2017</option>
                                <option value="2018 ">2018</option>
                                <option value="2019 ">2019</option>
                                <option value="2020 ">2020</option>       
                                <option value="2021 ">2021</option>
                                <option value="2022 ">2022</option>
                                        
                                </select>
                            </td>
                        </tr>
                        <td>CVV (3-Digit)</td>
                        <td><input type ="text" name="text" maxlength="3"></td>
                        <tr>
                            <td>Your card will be charged of :</td>
                            <td> <input type="text" name="text"><br></td></tr>
                        <tr><td></td>
                     <td><input type="submit" value="Confirm Payment"></td> </tr>
           
                              </table>     
                     </h4>
        </article> 
        <jsp:include page="includes/footer.jsp"/>
    </body>
</html>
