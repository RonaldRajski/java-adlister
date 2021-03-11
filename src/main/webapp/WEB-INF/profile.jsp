<%--
  Created by IntelliJ IDEA.
  User: chief
  Date: 3/11/21
  Time: 1:29 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<c:if test="${darkMode == true}">
<body class="dark">
</c:if>
<c:if test="${darkMode == false}">
<body>
</c:if>
<jsp:include page="partials/navbar.jsp" />

<div class="container">
    <h1>Viewing your profile, ${name}</h1>
</div>

</body>
</html>
