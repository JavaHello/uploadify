<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/24
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>SUCCESS</h1>
<form action="${pageContext.request.contextPath}/file" method="post">
    <input type="text" name="username" value="hello">
    <input type="file" name="file">
    <button type="submit">ok</button>
</form>
</body>
</html>
