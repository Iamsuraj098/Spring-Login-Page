<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page isELIgnored="false" %>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% List<Integer> str = (List<Integer>)request.getAttribute("marks"); %>
	<h1>Name: ${name}</h1>
	<h2>DOB: ${dob}</h2>
	<h3>All unique no.: ${marks}</h3>
	<%-- <c:forEach var="item" items="${marks}">
		<h3>${item}</h3>
	</c:forEach> --%>
	<h3>Marks obtains: <% for(Integer i: str){out.println(i);} %></h3>
</body>
</html>