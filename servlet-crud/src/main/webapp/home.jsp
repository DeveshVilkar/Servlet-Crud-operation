<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="home" method="post">
<input type="submit" value="insert" name="insert"><br><br>
<input type="submit" value="delete" name="delete"><br><br>
<input type="submit" value="update" name="update"><br><br>
<input type="submit" value="get single data" name="getbyid"><br><br>
<input type="submit" value="getall" name="getall"><br><br>
<label for="getlibrarian">Get all librarian:</label>
<input type="submit" id="getlibrarian" name="getlibrarian"><br><br>
<label for="authorize">Authorized Librarian:</label>
<input type="submit" id="authorize" name="authorize">  
l register<input type="submit" name="librarianregister"> 
a register<input type="submit" name="adminregister">       
 
</form>

</body>
</html>