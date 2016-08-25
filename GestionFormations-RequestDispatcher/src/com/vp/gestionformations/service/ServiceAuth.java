package com.vp.gestionformations.service;

/**
 * Classe qui permet de verifier si les informations d'identifications sont vraies.
 * @author Vincent PANOUILLERES
 *
 */
public class ServiceAuth {
	
	public boolean estValide(String login, String pwd){
		
		if (("manga".equalsIgnoreCase(login)) && ("aimejava".equalsIgnoreCase(pwd))) {
			return true;
		} else {
			return false;
		}	
	}
}
