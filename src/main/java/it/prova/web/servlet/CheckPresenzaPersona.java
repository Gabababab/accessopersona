package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.web.model.Persona;

/**
 * Servlet implementation class CheckPresenzaPersona
 */
@WebServlet("/CheckPresenzaPersona")
public class CheckPresenzaPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CheckPresenzaPersona() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		Persona personaPerCheck=new Persona();
		personaPerCheck.setNome(request.getParameter("rispostaNomeInput"));
		personaPerCheck.setCognome(request.getParameter("rispostaCognomeInput"));
		
		if(personaPerCheck.getNome().equalsIgnoreCase("Gabriele") && personaPerCheck.getCognome().equalsIgnoreCase("Gravotta")) {
			request.setAttribute("rispostaNomeAttribute", personaPerCheck.getNome());
			request.setAttribute("rispostaCognomeAttribute", personaPerCheck.getCognome());
			RequestDispatcher rd=request.getRequestDispatcher("accessoConsentito.jsp");
			rd.forward(request, response);
		}	
		else {
			request.setAttribute("rispostaNomeAttribute", personaPerCheck.getNome());
			request.setAttribute("rispostaCognomeAttribute", personaPerCheck.getCognome());
			RequestDispatcher rd=request.getRequestDispatcher("accessoNegato.jsp");
			rd.forward(request, response);
		}
	}

}
