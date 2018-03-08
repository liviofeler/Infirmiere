package com.infirmiere.epsi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet (urlPatterns ="/accueil")

public class Accueil extends HttpServlet {

@Override
public void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	

	
	/* Transmission de la paire d'objets request/response à notre JSP */
	this.getServletContext().getRequestDispatcher( "/WEB-INF/accueil.jsp" ).forward( request, response );
	}

@Override
public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	
		this.getServletContext().getRequestDispatcher( "/WEB-INF/search.jsp" ).forward( request, response );
	}	
}