<%@ page import="net.lqy.bean.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: lqy
  Date: 2018/4/13
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("name", "小明");
    User user = new User();
    user.setName("小红");
    user.setSex("蓝孩纸");
    //加入到session域中
    session.setAttribute("user", user);
    List<User> list = new ArrayList<>();
    User user1 = new User();
    user1.setName("小蓝");
    user1.setSex("女孩纸");
    User user2 = new User();
    user2.setName("小白");
    user2.setSex("蓝孩纸");
    list.add(user1);
    list.add(user2);
    //加入到application域中
    application.setAttribute("list", list);

%>
<%=
request.getAttribute("name")
%>
<%
    User user3 = (User) session.getAttribute("user");
    String name = user3.getName();
    out.write(name);
%>
<%
    List<User> list1 = (List<User>) application.getAttribute("list");
    User user4 = list.get(0);
    out.write(user4.getName());

%>
<!--通过el表达式获取request域中的值-->
${requestScope.name}
${sessionScope.user.name}
${applicationScope.list[0].name}
<!--另一种方式可以不通过scope，直接获取-->
${name}
${user.name}
${list[0].name}
</body>
</html>
