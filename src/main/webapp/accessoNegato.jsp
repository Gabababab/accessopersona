<%@page import="java.util.Date"%>
<%@page import="it.prova.web.model.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
		<body>
			Accesso NEGATO, tentato da:<br>
			<%Persona personaCheEffettuaAccesso=new Persona();
			personaCheEffettuaAccesso.setNome( (String)request.getAttribute("rispostaNomeInput"));
			personaCheEffettuaAccesso.setCognome( (String)request.getAttribute("rispostaCognomeInput"));%>
			<%=personaCheEffettuaAccesso.getNome()+" "+personaCheEffettuaAccesso.getCognome()%><br>
			Alle ore:<%=new Date()%><br><br>
			<a href="accesso.jsp">Home</a>
		</body>
</html>