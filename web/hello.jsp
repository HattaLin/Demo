<%@ page import="net.lqy.session.SessionServlet" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: lqy
  Date: 2018/4/13
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ page import="java.util.Map" %>
<%@include file="include.jsp"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>hello jsp</h2>
<%
    String str = "hello jsp";
    int i = 0;
    i++;

%>
<jsp:include page="include1.jsp"></jsp:include>
<%="变量i=" + i
%>
<%!
  int x=0;
%>
</body>
</html>
