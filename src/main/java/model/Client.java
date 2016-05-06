package model;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



/**
 * @author katia & amri abdelouhab
 *
 */
@XmlRootElement(name = "client")
public class Client {
	private static String entite;
	private static String contact;
	private static String code_postale;
	public Client() {
	}

	public Client(String entite, String contact,String code_postale) {

		this.entite = entite;
		this.contact = contact;
		this.code_postale= code_postale;

	}

	public static String getentite() {
		return entite;
	}

	@XmlElement
	public void setentite(String entite) {
		this.entite = entite;
	}

	public static String getcontact() {
		return contact;
	}
	@XmlElement
	public void setcontact(String contact) {
		this.contact = contact;
	}

	public static String getCode_postale() {
		return code_postale;
	}

	@XmlElement
	public void setCode_postale(String code_postale) {
		this.code_postale = code_postale;
	}
	
	
	
}
