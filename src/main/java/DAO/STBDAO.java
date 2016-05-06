package DAO;
 
import java.util.List;
 

import model.STB;
 
/**
 * implimentation de l'interface ClientDAO .
 * @author katia & amri abdelouhab
 *
 */
public interface STBDAO {
 
	   public void saveOrUpdate(STB stb);
	     
	    public STB get(String  titre);
	     
	    public List<STB> list();
	}