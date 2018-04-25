<%--
  Created by IntelliJ IDEA.
  User: lqy
  Date: 2018/4/13
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
   pageContext.setAttribute("name","xiaoming"); //pageContext域，当前jsp页面
   pageContext.setAttribute("name","zhangsan",pageContext.REQUEST_SCOPE); //request域整个请求过程
   pageContext.setAttribute("name","lisi",pageContext.SESSION_SCOPE); //session域一个会话过程
   pageContext.setAttribute("name","wangwu",pageContext.APPLICATION_SCOPE);//application 整个web项目
  %>
<%=pageContext.getAttribute("name",pageContext.REQUEST_SCOPE)%>
  <%=pageContext.getAttribute("name",pageContext.SESSION_SCOPE)%>
  <%=pageContext.getAttribute("name",pageContext.APPLICATION_SCOPE)%>
<%=
  pageContext.findAttribute("name") //能获取到所有作用域中的数据，但是有顺序，作用顺序是从小到大的
%>
</body>
</html>
