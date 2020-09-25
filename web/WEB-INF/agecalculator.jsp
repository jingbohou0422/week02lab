<%-- 
    Document   : agecalculator
    Created on : 2020-9-25, 13:42:00
    Author     : jingbo hou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
            <form method="post" action="age">
            Enter your age: <input type="number" name="age" value="${number}"><br>
            <input type="submit" value="Age next birthday">
            </form>
            <div>
                ${message}
            </div>
            <div>
                <a href="ari">Aritmetic Calculator</a>
            </div>
    </body>
</html>
