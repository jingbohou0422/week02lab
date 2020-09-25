<%-- 
    Document   : arithmeticcalculator
    Created on : 2020-9-25, 13:42:41
    Author     : jingbo hou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="ari">
        First: <input type="number" name="number1" value="${number1}"><br>
        Second: <input type="number" name="number2" value="${number2}"><br>
        <input type="submit" name="plus" value="+">
        <input type="submit" name="minus" value="-">
        <input type="submit" name="multiply" value="*">
        <input type="submit" name="modulo" value="%">
        </form>
        <div>
            <h1>Result: ${message}</h1>
        </div>
        <div>
            <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
