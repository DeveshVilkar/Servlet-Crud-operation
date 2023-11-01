<%@page import="java.util.List"%>
<%@page import="com.jsp.dto.Employe"%>
<%@page import="com.jsp.service.EmployeeService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>LIST OF EMPLOYEES</h1>
<%EmployeeService employeeService=new EmployeeService();
  List<Employe> employe=employeeService.getAll();
%>
<table border="2px" cellspacing="0" cellpadding="1">
<tr>
<th>Id</th>
<th>email</th>
<th>gender</th>
<th>name</th>
<th>salary</th>
</tr>
<% for(Employe e:employe) {%>
<tr>
<td><%= e.getId() %></td>
<td><%= e.getEmail() %></td>
<td><%= e.getGender() %></td>
<td><%= e.getName() %></td>
<td><%= e.getSalary() %></td>
<td><a href="delete.jsp?id=<%=e.getId()%>">Delete</a></td>
<td><a href="update.jsp?id=<%=e.getId()%>">Update</a></td>
</tr>
<%} %>

</table>
</body>
</html>