<%-- 
    Document   : cookieview
    Created on : Sep 17, 2018, 1:37:18 PM
    Author     : Nuntuch  Thongyoo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Cookie </title>
    </head>
    <body>
        <!--l. Create Form-->
        <h1>Hello World!</h1>
        <h1>Hello Cookie</h1>
    <center>
        <!--<img src="https://scontent-ort2-2.cdninstagram.com/vp/ab7552c80c8edb26f5002868208ffd76/5C2DF2AE/t51.2885-15/e35/c0.67.540.540/40958575_2283078828586550_7691490591354183506_n.jpg">-->

    </center>
    <form action="Cookie" method="post">

        <!--Text:  <input type="text" name ="text" required />-->     
        BNK GEN:  <input type="number" name ="bnkgen" required value="1" /> <br>    
        Music:  <input type="text" name ="music" required value="Fortune Cookie" /><br>     
        Idol:  <input type="text" name ="idol" required value="Cherprang" />     <br>




        <input type="submit" value="subcat" >
    </form>
    <!--var คือ ตัวแปรชั่วคราวที่ใช้ items--> 
    <%--<c:forEach var=""--%>

</body>
</html>
