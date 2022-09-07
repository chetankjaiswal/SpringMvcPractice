<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>About page</h1>
	
	<%
	String name=(String)request.getAttribute("name");
	Integer id=(Integer)request.getAttribute("id");
	Set<String> addresses=(HashSet<String>)request.getAttribute("address");
	%>
	<h4>Name is <%=name %> and id is <%=id %></h4>
	<h4>addresses are:<%=addresses %></h4>
	
	
</body>
</html>