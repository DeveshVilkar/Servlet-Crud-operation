<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- IF METHOD NOT MENTION USE GETPOST -->
<form action="delete" method="post">
enter the id to delete:<input type="number" name="id" value="<%=request.getParameter("id") %>"><br><br>
<input type="submit">

</form>

</body>
</html>