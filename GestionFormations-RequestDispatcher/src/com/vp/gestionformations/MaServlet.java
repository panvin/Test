package com.vp.gestionformations;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		// Etape 2: Soumettre les parametres de la requete à la couche service

		// Etape 3: Repond à l'utilisateur

		RequestDispatcher dispatcher;

		if (("manga".equalsIgnoreCase(login)) && ("aimejava".equalsIgnoreCase(pwd))) {
			dispatcher = request.getRequestDispatcher("Acceuil.html");
		} else {
			dispatcher = request.getRequestDispatcher("login.html");
		}

		dispatcher.forward(request, response);

	}

}
