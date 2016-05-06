package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author katia & amri abdelouhab
 *
 */
@XmlRootElement(name = "exigencefonctionel")
public class ExigenceFonct {
	private static String identifiant_ex;
	private static String description_ex;
	private static String priorite_ex;

	public ExigenceFonct() {
		super();
	}

	public ExigenceFonct(String identifiant_ex, String description_ex, String priorite_ex) {
		super();
		this.identifiant_ex = identifiant_ex;
		this.description_ex = description_ex;
		this.priorite_ex = priorite_ex;
	}

	public static String getIdentifiant() {
		return identifiant_ex;
	}

	@XmlElement
	public void setIdentifiant(String identifiant_ex) {
		this.identifiant_ex = identifiant_ex;
	}

	public static String getDescription() {
		return description_ex;
	}

	@XmlElement
	public void setDescription(String description_ex) {
		this.description_ex = description_ex;
	}

	public static String getPriorite() {
		return priorite_ex;
	}

	@XmlElement
	public void setPriorite(String priorite_ex) {
		this.priorite_ex = priorite_ex;
	}

}
