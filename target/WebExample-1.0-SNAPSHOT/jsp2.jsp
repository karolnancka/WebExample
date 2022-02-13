<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 13.02.2022
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSP2</title>
</head>
<body>
<p>Numbers:</p><br/>
<c:if test="${not empty start}">
    <c:forEach begin="${start}" end="${end}" var="idx">
        <div>${idx}</div>
    </c:forEach>
</c:if>
</body>
</html>
