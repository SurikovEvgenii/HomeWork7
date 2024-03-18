<%--
  Created by IntelliJ IDEA.
  User: Mystation
  Date: 18.03.2024
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Info</title>
</head>
<body>
    <p>Name: ${param.name}</p>
    <p>Age: ${param.age}</p><br>
    <p>Name: ${param.name}</p>
    <p>Phone 1: ${paramValues.phone[0]}</p>
    <p>Phone 2: ${paramValues.phone[1]}</p><br>
    <p>From cookie: ${cookie.userName.value}</p>
</body>
</html>
