package DAO;
 
import java.util.List;
 

import model.ExigenceFonct;
 
/**
 * implimentation de l'interface ClientDAO .
 * @author katia & amri abdelouhab
 *
 */
public interface ExigenceFonctDAO {
 
	   public void saveOrUpdate(ExigenceFonct exigencefonct);
	     
	    public ExigenceFonct get(String  identifiant_ex);
	     
	    public List<ExigenceFonct> list();
	}