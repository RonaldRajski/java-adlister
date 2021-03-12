<%--
  Created by IntelliJ IDEA.
  User: chief
  Date: 3/11/21
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<div class="container">
    <h1>Hello, ${user}!</h1>
</div>

</body>
</html>
