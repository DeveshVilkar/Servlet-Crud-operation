<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<<%-- %! int a=10;
int b=20;
int sum=0;
%>
<% sum=a+b; %>
<%= sum %> --%>
<%! String[] arr={"devesh","nileash","kedar","ashu"}; %>
<%for(String r:arr){ %>
<%= r%>
<%} %>
</body>
</html>