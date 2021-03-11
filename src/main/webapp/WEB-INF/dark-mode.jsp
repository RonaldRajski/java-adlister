<%--
  Created by IntelliJ IDEA.
  User: chief
  Date: 3/11/21
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dark Mode?</title>
</head>
<body>
<form action="/dark-mode" method="post">
    <input type="radio" name="dark-mode" value="yes" id="dm-yes">
    <label for="dm-yes">Dark Mode, pls</label>
    <input type="radio" name="dark-mode" value="no" id="dm-no">
    <label for="dm-no">No dark mode for me, thank you. I have good eyes.</label>
    <input type="submit">
</form>
</body>
</html>
