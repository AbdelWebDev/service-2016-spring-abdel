package DAO;
 
import java.util.List;
 

import model.Equipe;
 
/**
 * Defines DAO operations for the contact model.
 * @author katia & amri abdelouhab
 *
 */
public interface EquipeDAO {
     
    public void saveOrUpdate(Equipe equipe);
     
    
     
    public Equipe get(String  nom);
     
    public List<Equipe> list();
}