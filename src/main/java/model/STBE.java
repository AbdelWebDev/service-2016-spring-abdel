package model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author katia & amri abdelouhab
 *
 */
@XmlRootElement(name = "stbentry")
public class STBE {
	private static int stbid;
	private static String titre;
	private static String version;

	
	
	public STBE(int stbid,String titre,String version){
		this.stbid=stbid;
		this.titre=titre;
		this.version=version;
	}
	
	public STBE(){}

	public static int getStbid() {
		return stbid;
	}

	@XmlElement
	public void setStbid(int stbid) {
		this.stbid = stbid;
	}

	public static String getTitre() {
		return titre;
	}

	@XmlElement
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public static String getVersion() {
		return version;
	}

	@XmlElement
	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
}
