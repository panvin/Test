package com.vp.gestionformations.service;

import com.vp.gestionformations.dao.UserDAO;
import com.vp.gestionformations.domaine.User;

/**
 * Classe qui permet de verifier si les informations d'identifications sont vraies.
 * @author Vincent PANOUILLERES
 *
 */
public class ServiceAuth {
	
	public boolean estValide(String login, String pwd){
		
		User usr = UserDAO.lireParLogin(login);
		
		if (usr == null){
			return false;
		}
		
		if ((usr.getLogin().equalsIgnoreCase(login)) && (usr.getPwd().equalsIgnoreCase(pwd))) {
			return true;
		} else {
			return false;
		}	
	}
}
