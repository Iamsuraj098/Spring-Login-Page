<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head> 
<body>
<h1>This is home page</h1>
<h2>Hello world</h2>
<h1>Kya ho rha hai</h1>
<%  String str = (String)request.getAttribute("Name");
	Integer id = (Integer)request.getAttribute("id"); 
	List<String> friend = (List<String>)request.getAttribute("name");
%>
<h1>Name is <%=str%></h1>
<h2>Id is <%= id%></h2> 
<h3><% for(String s: friend){out.println(s);} %></h3>
</body>
</html>