<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27.05.2024
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Article</title>
</head>

<body>
<form action="addArticle" method="post">
    Title: <input type="text" name="title"/><br/>
    Content: <textarea name="content"></textarea><br/>
    <input type="submit" value="Add Article"/>
</form>
<a href="articleList.jsp">Back to Articles</a>
</body>
</html>
