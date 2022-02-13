<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 13.02.2022
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>JSP1</title>
</head>
<body>
    <c:out default="guest" value="${userRole}" />

</body>
</html>
