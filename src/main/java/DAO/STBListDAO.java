package DAO;
 
import java.util.List;
 

import model.STBList;
 
/**
 * implimentation de l'interface ClientDAO .
 * @author katia & amri abdelouhab
 *
 */
public interface STBListDAO {
 
	   public void saveOrUpdate(STBList stb);
	   public List<STBList> list();
	}