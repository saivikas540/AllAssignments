<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hi <%=session.getAttribute("Name") %>
your Email ID  <%=session.getAttribute("email") %>
your DOB  <%=session.getAttribute("DOB") %>
your mobile number  <%=session.getAttribute("mb") %>
your Gender  <%=session.getAttribute("gender") %>
</body>
</html>