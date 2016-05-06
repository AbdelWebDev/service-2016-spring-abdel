package model;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stb")
public class STB {
	private static int id ;
	private static String titre;
	private static String version;
	private static Date date;
	private static String description;
	private static String commentaire;
	private List<Client> client;
	private List<Equipe> equipe;
	private List<Fonctionalite> fonctionalite;
	private List<ExigenceFonct> exigence_fonctionel;
	
	
	public STB(String string, String string2, String string3, String string4, String string5, List<Client> client2, List<Equipe> equipe2, List<Fonctionalite> fonctionalite2, List<ExigenceFonct> exigfonc){}
	public STB(){
		this.id= id;
		this.titre=titre;
		this.date=date;
		this.version=version;
		this.commentaire=commentaire;
		this.description=description;
	}
	
	public STB(String titre,String version,Date date,String commentaire,String description,List<Client> client,List<Equipe> equipe,List<Fonctionalite> fonctionalite,List<ExigenceFonct> exigence_fonctionel, int id){
		this.id=id;
		this.titre=titre;
		this.date=date;
		this.version=version;
		this.commentaire=commentaire;
		this.description=description;
		this.client=client;
		this.equipe=equipe;
		this.exigence_fonctionel=exigence_fonctionel;
		this.fonctionalite=fonctionalite;
	}
	

	public static int getid() {
		return id;
	}
	@XmlElement
	public void setid(int id) {
		this.id = id;
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
	
	public static Date getDate() {
		return date;
	}
	
	@XmlElement
	public void setDate(Date date) {
		this.date = date;
	}
	public static String getDescription() {
		return description;
	}
	
	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
	public static String getCommentaire() {
		return commentaire;
	}
	
	@XmlElement
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public List<Client> getClient() {
		return client;
	}
	
	@XmlElement
	public void setClient(List<Client> client) {
		this.client = client;
	}
	public List<Equipe> getEquipe() {
		return equipe;
	}
	
	@XmlElement
	public void setEquipe(List<Equipe> equipe) {
		this.equipe = equipe;
	}
	public List<Fonctionalite> getFonctionalite() {
		return fonctionalite;
	}
	
	@XmlElement
	public void setFonctionalite(List<Fonctionalite> fonctionalite) {
		this.fonctionalite = fonctionalite;
	}
	public List<ExigenceFonct> getExigence_fonctionel() {
		return exigence_fonctionel;
	}
	
	@XmlElement
	public void setExigence_fonctionel(List<ExigenceFonct> exigence_fonctionel) {
		this.exigence_fonctionel = exigence_fonctionel;
	}

	
	public void ajouterClient(String entite,String contact,String code_postale){
		Client client1 = new Client(entite,contact,code_postale);
		List<Client> l = new LinkedList<Client>();
		l.add(client1);
		this.setClient(l);
	}
	
	
}
