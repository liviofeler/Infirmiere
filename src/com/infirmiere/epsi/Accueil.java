package com.infirmiere.epsi;

import java.io.IOException;
import com.infirmiere.beans.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet( urlPatterns = "/accueil" )

public class Accueil extends HttpServlet {

    @Override
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

        /* Transmission de la paire d'objets request/response à notre JSP */
        this.getServletContext().getRequestDispatcher( "/WEB-INF/accueil.jsp" ).forward( request, response );
    }

    @Override
    public void doPost( HttpServletRequest request, HttpServletResponse response )throws ServletException, IOException {
    	
    	String recupModif = request.getParameter("modif");
    	String id = request.getParameter("idpatient");
    	String nom = request.getParameter("nompatient");
    	String prenom = request.getParameter("prenompatient");
        String insee = request.getParameter("inseepatient");
    	String patho = request.getParameter("pathopatient");
        String date = request.getParameter("datepatient");
        
        if(recupModif.equals("MODIFIER")) {
        	GestionPatient.ModifPatient(id, nom, prenom, insee, patho, date);
        }else {        
        	GestionPatient.SupprPatient(id);
        }

        this.getServletContext().getRequestDispatcher( "/WEB-INF/accueil.jsp" ).forward( request, response );
    }
}