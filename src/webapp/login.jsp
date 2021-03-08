<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--    <title>Login</title>--%>
<%--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">--%>

<%--</head>--%>
<%--<%@ include file="partials/navbar.jsp" %>--%>
<%--<body>--%>
<%--<h1>Login Form</h1>--%>

<%--<div class="form-group"></div>--%>

<%--<form action="">--%>
<%--    <div class="form-group"></div>--%>
<%--    <label for="exampleInputEmail"></label><input type="text" name="username" class="form-control" id="exampleInputEmail" aria-describedby="exampleInputEmail">--%>
<%--    <small id=emailHelp"       ></small>--%>


<%--</form>--%>


<%--<form action="guru_register" method="post">--%>
<%--    <table style="with: 50%">--%>
<%--        <tr>--%>
<%--            <td>First Name</td>--%>
<%--            <td><input type="text" name="first_name" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Last Name</td>--%>
<%--            <td><input type="text" name="last_name" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>UserName</td>--%>
<%--            <td><input type="text" name="username" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Password</td>--%>
<%--            <td><input type="password" name="password" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Address</td>--%>
<%--            <td><input type="text" name="address" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Contact No</td>--%>
<%--            <td><input type="text" name="contact" /></td>--%>
<%--        </tr></table>--%>
<%--    <input type="submit" value="Submit" /></form>--%>
<%--</body>--%>
<%--</html>--%>

<%--
  Created by IntelliJ IDEA.
  User: samsc
  Date: 3/5/2021
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String wrongCredentialsMessage = "";
    if (request.getMethod().equals("POST")) {
        if (request.getParameter("username").equals("admin") && request.getParameter("userPassword").equals("password")) {
            response.sendRedirect("/profile.jsp?username=" + request.getParameter("username"));
        }
        wrongCredentialsMessage = "Username or Password Invalid";
    }
%>
<html>
<head>
    <title>Login</title>
    <jsp:include page="partials/styleSheets.jsp" />

</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<main class="container">


    <h2>Login Form</h2>


    <form method="POST" action="/login.jsp">


        <p class="red-text"><%=wrongCredentialsMessage%></p>
        <label for="username">Username</label>
        <input name="username" id="username" type="text">

        <br>

        <label for="userPassword">Password</label>
        <input name="userPassword" id="userPassword" type="password">

        <br>

        <input type="submit" value="Login">

    </form>

</main>

<jsp:include page="partials/scripts.jsp" />
</body>
</html>