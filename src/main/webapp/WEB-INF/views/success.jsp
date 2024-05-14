<%@page import="springMVC.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detail Printing</title>
</head>
<body>
	<%-- <h2>Successfully Added</h2>
	<h3>Name is: ${name}</h3>
	<h3>Email is: ${email}</h3>
	<h3>Password is: ${password}</h3> --%>
	<h3 class="text-center">${heading }</h3>
	<h5 class="text-center">${text }</h5>
	<h3><%String st = (String)request.getAttribute("msg"); out.println(st); %></h3>
	<h3>Name is: ${user.getUser()}</h3>
	<h3>Email is: ${user.getEmail()}</h3>	
	<h3>Password is: ${user.getPassword()}</h3>
</body>
</html>