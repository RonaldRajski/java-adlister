<%--
  Created by IntelliJ IDEA.
  User: chief
  Date: 3/10/21
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
<h2>Here are all your ads</h2>

<c:forEach items="${ads}" var="ad" >

    <div class="container">
        <h3>${ad.title}</h3>
        <p>ID: ${ad.id}</p>
        <p>Description: ${ad.description}</p>

    </div>
    <br>

</c:forEach>



</body>
</html>
