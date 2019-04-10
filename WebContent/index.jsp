<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center;">
<h1>Inicie Sesion</h1>

<form action="MainServlet" method="post">

	 <label>Username:</label><input name="User" type="text">
	 <br>
	 <br>
	 <label>Password:</label><input name="Pass" type="password">
	 <br>
	 <br>
	 <input type="submit" value="Login">
  
</form>
</div>
</body>
</html>