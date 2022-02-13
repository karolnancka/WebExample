<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 13.02.2022
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fourth JSP</title>
</head>
<body>
<jsp:include page="/jspCookie" />
${cookie.foo.value}
</body>
</html>
