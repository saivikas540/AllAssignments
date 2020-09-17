<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<script>  
function validateform(){   
var email=document.myform.Email.value;  
var password=document.myform.password.value;   
  
 if(email==null||email==""){
      alert("Email is mandatory");
      return false;
  }
else if(password.length<4){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  
  
  
}  
</script> 
 <center>
<h1>LogIn to Continue</h1>
<form:form action="logincheck" name="myform" method="POST" onsubmit="return validateform()" modelAttribute="loginObj" >  
Email:<input type="text" name="Email" /> </br>
Password: <input type="password" name="password"></br>  
<input type="submit" value="Submit">  
</form:form>  </center>
<center><a href="registration">Register</a></center>

</body>

</html>