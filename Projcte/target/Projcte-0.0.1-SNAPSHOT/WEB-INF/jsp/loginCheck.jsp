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
String Email=request.getParameter("Email");
String password=request.getParameter("password");
if((Email.equals("admin")&&password.equals("admin1@")))
{
	session.setAttribute("Email", Email);
	response.sendRedirect("index.jsp");
}else if((Email.equals("saivikas")&&password.equals("saivikas@")))
{
	session.setAttribute("Email", Email);

	response.sendRedirect("index.jsp");
}
else
{
	response.sendRedirect("incorrect.jsp");
}


%>

</body>
</html>