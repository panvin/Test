package com.vp.gestionformations.service;

import com.vp.gestionformations.dao.UserDAO;
import com.vp.gestionformations.domaine.User;

public class UserService {
	
	public static void createuser(User usr){
		UserDAO.creer(usr);
	}

}
