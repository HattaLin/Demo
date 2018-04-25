<%--
  Created by IntelliJ IDEA.
  User: lqy
  Date: 2018/4/16
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>商品列表</title>
</head>
<body>
    <c:forEach items="${list}" var="phone">
        <div class="col-md-2" style="display: inline-block">
            <img src="${phone.image}" width="170",height="170">
            </a>
            <p>
                <a href="login.html" style='color: green'>${phone.name}</a>
            </p>
           <p>
               <font color = "#FF0000">商城价: &yen;${phone.price}</font>
           </p>
        </div>

    </c:forEach>
</body>
</html>
