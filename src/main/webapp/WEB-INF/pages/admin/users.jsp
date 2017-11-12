<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ibm
  Date: 2017/11/12
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>users admin</title>
</head>
<body>
<c:if test = "${!empty  userList}">
    <table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>url</td>
    </tr>
        <c:forEach items = "${userList}" var="user">
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.url}</td>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
