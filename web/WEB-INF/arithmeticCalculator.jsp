<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="">
            <label>First: </label><input type="text" name="first" value="${fnumber}">
            <br>
            <label>Second: </label><input type="text" name="second" value="${snumber}">
            <br>
            <input type="submit" name="addition" value="+">
            <input type="submit" name="subtraction" value="-">
            <input type="submit" name="multiplication" value="*">
            <input type="submit" name="modulus" value="%"><br>
        </form>
            <div>Result: ${message}</div>
            <a href="age">Age Calculator</a>
    </body>
</html>

