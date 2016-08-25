package com.vp.gestionformations.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vp.gestionformations.dao.UserDAO;
import com.vp.gestionformations.domaine.User;
import com.vp.gestionformations.service.UserService;

/**
 * Servlet implementation class MaServlet2
 */
@WebServlet("/MaServlet2")
public class MaServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServlet2() {
		super();
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);
	}

	private void traitement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Etape 1: Recuperation des parametres de la requete
		String login = request.getParameter("loginuser");
		String pwd = request.getParameter("mdpuser");
		
		// Etape 2: Soumettre les parametres de la requete à la couche service
		User user = new User(login, pwd);
		
		HttpSession maSession = request.getSession();
		maSession.setAttribute("utilisateur", user);
		
		UserService.createuser(user);
		
		// Etape 3: Repond à l'utilisateur
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("resultatLogin.jsp"); 
		dispatcher.forward(request, response);
	}

}
