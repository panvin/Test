<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="MaServlet">
		Login: <br> <input type="text" name="loginuser"><br>
		Pwd:   <br><input type="password" name="mdpuser"><br>
		<input type="submit" value="Submit">
	</form>
	<br>
	<a href="subscribe.jsp"> Creer un compte</a>
</body>
</html>