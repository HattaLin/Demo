<%--
  Created by IntelliJ IDEA.
  User: lqy
  Date: 2018/4/10
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆错误</title>
</head>
<body>
  <h2>登陆失败</h2>
<p>
    <%=request.getAttribute("errorMessage")%>
</p>
</body>
</html>
