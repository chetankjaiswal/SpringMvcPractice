<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <h3 style="color: green">${success}</h3>
     <h4>User name is ${user.name} </h4>
     <h4>User email is ${user.email} </h4>
     <h4>User password is ${user.password} </h4>
</body>
</html>