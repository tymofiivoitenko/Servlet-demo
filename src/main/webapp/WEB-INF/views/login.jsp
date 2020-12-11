<%--
  Created by IntelliJ IDEA.
  User: tymofiivoitenko
  Date: 10.12.20
  Time: 08:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
${message}
<form action="/login.do", method="post">
    Name:   <input type="text" name="name"/><br>
    Password: <input type = "password" name="password"><br>
    <input type="submit" value="knopka"/>
</form>
</body>
</html>
