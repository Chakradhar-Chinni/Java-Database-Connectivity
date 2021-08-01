<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>    
<body>  
		<h1 align="center">Tomcat Server from Registration</h1>
		<form action = "Register" method="POST">
			<table>
				<tr><td>User Name </td> <td><input type="text" name="uname"> </td></tr>
				<tr><td>Password  </td> <td><input type="password" name="password">  </td></tr>
				<tr><td>Email     </td> <td><input type="text" name="email">  </td></tr>
				<tr><td>Contact No </td> <td><input type="text" name="phone">  </td></tr>
				<tr><td><input type="submit" value="SUBMIT"> </td></tr>
			</table> 
		</form>
</body>
</html>