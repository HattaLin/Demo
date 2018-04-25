<%@ page import="java.util.ArrayList" %>

<%@ page import="net.lqy.bean.User" %>
<%@ page import="java.util.List" %>

<%--
  Created by IntelliJ IDEA.
  User: lqy
  Date: 2018/4/16
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    List<User> list = new ArrayList<>();
    User user1 = new User();
    user1.setName("小蓝");
    user1.setSex("女孩纸");
    User user2 = new User();
    user2.setName("小白");
    user2.setSex("蓝孩纸");
    list.add(user1);
    list.add(user2);
    for (int i = 0; i < list.size(); i++) {
        System.out.println(i);
    }
    for (User user : list) {
        System.out.println(user.getName());
    }
  request.setAttribute("list",list);
%>
<c:forEach begin="0" end="${list.size()-1}" var="i" >

 ${list[i].name}
</c:forEach>
 <!--items 代表一个集合或者一个数组 -->
<c:forEach items="${list}" var="user">
    ${user.name}
</c:forEach>
</body>
</html>
