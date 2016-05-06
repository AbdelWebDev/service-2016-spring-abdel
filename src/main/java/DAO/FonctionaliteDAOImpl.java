package DAO;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import model.Equipe;
import model.Fonctionalite;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

 
/**
 * l'implimentation de EquipeDAO interface.
 * @author katia & amri abdelouhab
 *
 */
public abstract class FonctionaliteDAOImpl implements FonctionaliteDAO {
 
    private JdbcTemplate jdbcTemplate;
 
    public FonctionaliteDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
          
            // insert
                String sql = "INSERT INTO Fonctionalite (nom, prenom)"
                            + " VALUES (?, ?, ?, ?)";
                jdbcTemplate.update(sql,Fonctionalite.getDescription(), Fonctionalite.getPriorite()
                        );
            }
         
    
       @Override
    public void saveOrUpdate(Fonctionalite fonctionalite) {
        // implementation details goes here...
    }
 
    @Override
    public void delete(String nom) {
    	    String sql = "DELETE FROM Fonctionalite WHERE description_f=?";
    	    jdbcTemplate.update(sql, nom);
    	}
 
  

}
        
  

