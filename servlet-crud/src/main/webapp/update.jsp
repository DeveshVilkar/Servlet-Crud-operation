<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
<h2>To update username</h2><br><br>
enter the id:<input type="number" name="id" value="<%=request.getParameter("id")%>"><br><br>
enter the old email:<input type="email" name="oldemail"><br><br>
enter the new email:<input type="email" name="email"><br><br>
 <input type="submit">

</form>

</body>
</html>