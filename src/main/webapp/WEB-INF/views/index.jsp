<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>Home page</h1>
	<h4>This is name by Model</h4>
	<%
	 String name=(String)request.getAttribute("Name");
	 Integer id= (Integer)request.getAttribute("id");
	 List<String>students= (ArrayList<String>)request.getAttribute("studentss");
	%>
	<h4>Name is <%=name %> id is <%=id %></h4>
	<h4>Students are:</h4>
	<%
	  for(String student:students)
	{%>
	  <h4><%=student%></h4>
    <%}%>	
    
</body>
</html>