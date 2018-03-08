<%@page import="com.infirmiere.epsi.AffichageAccueil"%>
<%@page import="com.infirmiere.epsi.ConnexionBDD"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accueil Patient</title>
</head>
<body>
	<%
		int id = 1;
		ArrayList<Object> patient = new ArrayList<Object>();
		
		patient = AffichageAccueil.find(id);
		int count = AffichageAccueil.nbPatient(id);
		int compteur = 0;
		
		
		for( int i = 0; i < count; i++){	
			out.println("<form>");
				out.println("<fieldset>");
					out.println("<label>");
					out.println("ID : ");
					out.println("</label>");
					out.println("<input type='text' name='idpatient' value='" + patient.get(compteur) + "' />");
					compteur++;
					out.println("<label>");
					out.println("Nom  : ");
					out.println("</label>");
					out.println("<input type='text' name='nompatient' value='" + patient.get(compteur) + "' />");
					compteur++;
					out.println("<label>");
					out.println("Prénom  : ");
					out.println("</label>");
					out.println("<input type='text' name='prenompatient' value='" + patient.get(compteur) + "' />");
					compteur++;
					out.println("<label>");
					out.println("Insee  : ");
					out.println("</label>");
					out.println("<input type='text' name='inseepatient' value='" + patient.get(compteur) + "' />");
					compteur++;
					out.println("<label>");
					out.println("Pathologie  : ");
					out.println("</label>");
					out.println("<input type='text' name='pathopatient' value='" + patient.get(compteur) + "' />");
					compteur++;
					out.println("<label>");
					out.println("Date : ");
					out.println("</label>");
					out.println("<input type='text' name='datepatient' value='" + patient.get(compteur) + "' />");
					compteur++;
				out.println("</fieldset>");
			out.println("</form>");
		}
		
		
	
	%>
</body>
</html>