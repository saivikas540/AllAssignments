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
String email=request.getParameter("email");
String Name=request.getParameter("Name");
String DOB=request.getParameter("DOB");
String gender=request.getParameter("gender");
String mb=request.getParameter("mb");

session.setAttribute("email", email);
session.setAttribute("Name", Name);
session.setAttribute("DOB", DOB);
session.setAttribute("gender", gender);
session.setAttribute("mb", mb);
response.sendRedirect("info.jsp");
%>

</body>
</html>