<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<% pageContext.setAttribute("name","Hello JSP World"); %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<h2>${name}</h2>
<br/>
<a href="hello-servlet">Hello Servlet</a><br>
<a href="result.jsp">Result</a><br>
<a href="form.jsp">Forms</a><br><br>
<a href="postuser.jsp?age=27&name=Jerry">User Information GET</a><br>
<p>Attribute 1: ${linksdata1[1]}</p>
<p>Attribute 2: ${linksdata1[2]}</p><br><br>
<p>User-Agent: ${header["User-Agent"]}</p>
<p>Host: ${header.host}</p><br>
<p>From cookie: ${cookie.userName.value}</p>
</body>
</html>