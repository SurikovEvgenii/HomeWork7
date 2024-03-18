<%--
  Created by IntelliJ IDEA.
  User: Mystation
  Date: 18.03.2024
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Please fill the form below:</h2>
    <form action="${pageContext.request.contextPath}/userServlet" method="post">
        <label for="name"><strong>Name:</strong></label>
        <input type="text" name="name" id="name">
        <label for="email"><strong>Email:</strong></label>
        <input type="text" name="email" id="email">
        <input type="submit" value="Send">
    </form>
    <h2>Postuser.jsp: Form 1</h2>
        <form action="/postuser.jsp" method="post">
            <label for="name1"><strong>Name:</strong></label>
            <input type="text" name="name" id="name1">
            <label for="age"><strong>Age:</strong></label>
            <input type="text" name="age" id="age">
            <input type="submit" value="Send">
        </form>
    <h2>Postuser.jsp: Form 2</h2>
        <form action="/postuser.jsp" method="post">
            Name: <input name="name" />
            <br><br>
            Main Phone: <input name="phone" />
            <br></br>
            Additional Phone: <input name="phone" />
            <br></br>
            <input type="submit" value="Submit" />
        </form>
</body>
</html>
