package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author katia & amri abdelouhab
 *
 */
@XmlRootElement(name = "stblist")
public class STBList {
	private List<STBE> stbe;
	public static int nextid = 0;

	public STBList(List<STBE> stbe) {
		this.stbe = stbe;
	}

	public STBList() {
		this.stbe = new ArrayList<STBE>();
	}
	
	public List<STBE> getStbe() {
		return stbe;
	}

	@XmlElement
	public void setStbe(List<STBE> stbe) {
		this.stbe = stbe;
	}
	public void initialiser() {
		STBE stbe1 = new STBE(3, "doe", "john");
		STBE stbe2 = new STBE(4, "fed", "rog");

		this.stbe.add(stbe1);
		this.stbe.add(stbe2);

	}

	public void ajouter(STBE stbet) {
		this.stbe.add(stbet);
		nextid++;

	}

	

}
