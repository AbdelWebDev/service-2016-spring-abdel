package DAO;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import model.Equipe;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

 
/**
 * l'implimentation de EquipeDAO interface.
 * @author katia & amri abdelouhab
 *
 */
public abstract class EquipeDAOImpl implements EquipeDAO {
 
    private JdbcTemplate jdbcTemplate;
 
    public EquipeDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
          
            // insert
                String sql = "INSERT INTO Equipe (nom, prenom)"
                            + " VALUES (?, ?, ?, ?)";
                jdbcTemplate.update(sql, Equipe.getNom(), Equipe.getPrenom()
                        );
            }
         
    
       @Override
    public void saveOrUpdate(Equipe equipe) {
        // implementation details goes here...
    }
 
  
 
  
    @Override
    public Equipe get(String nom) {
        String sql = "SELECT * FROM contact WHERE equipe_nom=" + nom;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Equipe>() {
     
            @Override
            public Equipe extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                    Equipe equipe = new Equipe();
                    equipe.setNom(rs.getString("nom"));
                    equipe.setPrenom(rs.getString("prenom"));

                    return equipe;
                }
                return null;
            }
            
        });
    }
}
        
  

