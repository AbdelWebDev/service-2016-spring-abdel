package model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author katia & amri abdelouhab
 *
 */
@XmlRootElement(name = "fonctionalite")
public class Fonctionalite {

	private static String description_f;
	private static String priorite_f;
	private List<ExigenceFonct> exig_fonc;

	

	public Fonctionalite(String description, String priorite, List<ExigenceFonct> exig_fonc) {
		super();
		this.description_f = description;
		this.priorite_f = priorite;
		this.exig_fonc = exig_fonc;
	}

	public static String getDescription() {
		return description_f;
	}

	@XmlElement
	public void setDescription(String description) {
		this.description_f = description;
	}

	public static String getPriorite() {
		return priorite_f;
	}

	@XmlElement
	public void setPriorite(String priorite) {
		this.priorite_f = priorite;
	}

	public List<ExigenceFonct> getExig_fonc() {
		return exig_fonc;
	}

	@XmlElement
	public void setExig_fonc(List<ExigenceFonct> exig_fonc) {
		this.exig_fonc = exig_fonc;
	}

}
