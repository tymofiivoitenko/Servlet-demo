<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <title>Todos</title>
</head>
<body>
<p>Welcome ${name}</p>
TODOS
<ol>
    <c:forEach items="${todos}" var = "todo">
        <li>${todo.name}</li>
    </c:forEach>

</ol>
</body>
</html>
