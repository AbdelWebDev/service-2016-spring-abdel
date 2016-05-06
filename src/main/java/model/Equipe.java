package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author katia & amri abdelouhab
 *
 */
@XmlRootElement(name = "equipe")
public class Equipe {
	
	private static String nom;
	private static String prenom;
	
	
	public Equipe() {
		super();
	}

	public Equipe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public static String getNom() {
		return nom;
	}
	
	@XmlElement
	public void setNom(String nom) {
		this.nom = nom;
	}
	public static String getPrenom() {
		return prenom;
	}
	
	@XmlElement
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
