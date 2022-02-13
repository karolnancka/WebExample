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
    <title>JSP3</title>
</head>
<body>
<form method="post" action="mvc13">
    <div>
        <label for="title">Title</label>
        <input name="title" id="title" type="text">
    </div>
    <div>
        <label for="author">Author</label>
        <input name="author" id="author" type="text">
    </div>
    <div>
        <label for="isbn">ISBN</label>
        <input name="isbn" id="isbn" type="text">
    </div>
    <div>
        <input type="submit">
    </div>
</form>
<p>Book:</p><br/>
${book.title}<br/>
${book.author}<br/>
${book.isbn}
</body>
</html>
