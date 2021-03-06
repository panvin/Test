package com.vp.gestionformations.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vp.gestionformations.domaine.User;
import com.vp.gestionformations.service.ServiceAuth;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public MaServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		traitement(request, response);
	}

	protected void traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Etape 1: Recuperation des parametres de la requete

		String login = request.getParameter("loginuser");
		String pwd = request.getParameter("mdpuser");
		

		// Etape 2: Soumettre les parametres de la requete � la couche service
		User user = new User(login, pwd);
		
		HttpSession maSession = request.getSession();
		maSession.setAttribute("utilisateur", user);
		
		boolean authOK;
		ServiceAuth serviceAuthentification= new ServiceAuth();
		authOK = serviceAuthentification.estValide(login, pwd);

		// Etape 3: Repond � l'utilisateur
		RequestDispatcher dispatcher;

		if ( authOK == true) {
			dispatcher =  request.getRequestDispatcher("resultatLogin.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("login.jsp");
		}
		dispatcher.forward(request, response);
		
	}

}
