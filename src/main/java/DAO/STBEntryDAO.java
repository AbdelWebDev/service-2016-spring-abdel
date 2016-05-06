package DAO;
 
import java.util.List;
 

import model.STBE;
 
/**
 * implimentation de l'interface ClientDAO .
 * @author katia & amri abdelouhab
 *
 */
public interface STBEntryDAO {
 
	   public void saveOrUpdate(STBE stbentry);
	     
	    public STBE get(int stbid);
	     
	    public List<STBE> list();
	}