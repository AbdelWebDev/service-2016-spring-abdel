package DAO;
 
import java.util.List;
 

import model.Fonctionalite;
 
/**
 * implimentation de l'interface ClientDAO .
 * @author katia & amri abdelouhab
 *
 */
public interface FonctionaliteDAO {
 
	   public void saveOrUpdate(Fonctionalite exigencefonct);
	     
	    public void delete(String   identifiant_ex);
	     
	    public Fonctionalite get(String  identifiant_ex);
	     
	    public List<Fonctionalite> list();
	}