<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 13.02.2022
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Third JSP</title>
</head>
<body>
<p>${empty param.a ? "empty" : param.a }</p>
<p>${empty param.b ? "empty" : param.b }</p>

</body>
</html>
