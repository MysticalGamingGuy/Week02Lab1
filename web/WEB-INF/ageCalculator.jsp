<%-- 
    Document   : ageCalculator
    Created on : Sep 20, 2017, 2:13:50 PM
    Author     : 728618
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Next Birthday</title>
    </head>
    <body>
        <h1>Age next Birthday</h1>
        <form action="agecalculator" method="post">
            Enter Your Current Birthday 
            <input name="birth" type="text" placeholder="Birthday" value="${birth}"> 
            <input type="submit" value="Age Next Birthday">
            <p>${message}</p>
        </form>
    </body>
</html>
