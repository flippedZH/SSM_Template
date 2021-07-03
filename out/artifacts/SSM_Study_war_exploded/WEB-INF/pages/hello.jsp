<%--
  Created by IntelliJ IDEA.
  User: zh
  Date: 2021/7/2
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>success_real!</h2>
pageContext:${pageScope.accountInfo}<br>
request:${requestScope.accountInfo}<br>
session:${sessionScope.accountInfo}<br>
application:${applicationScope.accountInfo}<br>
</body>
</html>