<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27.05.2024
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Articles</title>
</head>
<body>
<h1>Articles</h1>
<ul>
    <c:forEach var="article" items="${articles}">
        <li><a href="articleDetails?title=${article.title}">${article.title}</a></li>
    </c:forEach>
</ul>
<a href="addArticle.jsp">Add New Article</a>
</body>
</html>
