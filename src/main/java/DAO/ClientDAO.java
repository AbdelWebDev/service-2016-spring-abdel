package DAO;
 
import java.util.List;
 
import model.Client;
 
/**
 * Defines DAO operations for the contact model.
 * @author katia & amri abdelouhab
 *
 */

public interface ClientDAO {
     
    public void saveOrUpdate(Client client);

     
    public Client get(String  cliententite);
     
    public List<Client> list();
}