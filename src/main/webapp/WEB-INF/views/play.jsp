<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = (String)request.getAttribute("name"); 
		Integer id = (Integer)request.getAttribute("rollno");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time");
	%>
	<h1>Play the cricket</h1>
	<h2>Name is: <%=name %></h2>
	<h2>Roll no: <%= id %></h2>
	<h2>Current time is: <%= time %></h2>
</body>
</html>