<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Page</title>
</head>
<body>
<center><h1>Welcome!!!</h1></center>
hii <%= session.getAttribute("Email") %> </br>
This is my page.

</body>
</html>