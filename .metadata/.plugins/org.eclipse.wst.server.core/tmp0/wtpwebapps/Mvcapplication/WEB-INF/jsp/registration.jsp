<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
</head>
<body>
<center>
    <h2>REGISTER</h2>
</center>
<center>
<form:form   method="post" modelAttribute="regObj">
      Name:<input type="text" name="Name"></br>
       Email:<input type="text" name="email"></br>
       DOB:<input type="text"  name="DOB"></br>
       Gender:<input type="text"  name="gender"></br>
          Mobile Number:<input type="text"  name="mb"></br>
           Password:<input type="password" 
                    name="password"></br>
        <input type="submit" value="Submit">
        
        
        </form:form>
       
        <br>
</center>

</body>
</html>