<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.vp.gestionformations.domaine.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultat identification</title>
</head>
<body>
	<%
		User u = (User) session.getAttribute("utilisateur");
	%>
	<h1>Information utilisateur</h1>
	<ul>
		<li>Login: <%=u.getLogin()%>
		<li>Mot de Passe: <%=u.getPwd()%>
	</ul>
	<br>
	<a href="">Retourner � l'acceuil</a>
</body>
</html>