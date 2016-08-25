package com.vp.gestionformations.domaine;

/**
 * Classe domaine metier: Utilisateur du site internet
 * Cette classe comprend l'ensemble des informations qui sont associés a l'utilisateur
 * @author Vincent PANOUILLERES
 *
 */
public class User {
	
	private String login;
	private String pwd;
	
	public User(String loginUser, String password) {
		this.login = loginUser;
		this.pwd = password; 
	}
	
	public User(String loginUser) {
		this.login = loginUser;
		this.pwd = ""; 
	}
	
	
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the passwordd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param password the password to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
