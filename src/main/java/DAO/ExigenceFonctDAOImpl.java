package DAO;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import model.ExigenceFonct;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

 
/**
 * l'implimentation de EquipeDAO interface.
 * @author katia & amri abdelouhab
 *
 */
public abstract class ExigenceFonctDAOImpl implements ExigenceFonctDAO {
 
    private JdbcTemplate jdbcTemplate;
 
    public ExigenceFonctDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
          
            // insert
                String sql = "INSERT INTO ExigenceFonct (identifiant_ex, description_ex, priorite_ex"
                            + " VALUES (?, ?, ?, ?)";
                jdbcTemplate.update(sql, ExigenceFonct.getIdentifiant(), ExigenceFonct.getDescription(), ExigenceFonct.getPriorite()
                        );
            }
         
    
       @Override
    public void saveOrUpdate(ExigenceFonct exigencefonct) {
        // implementation details goes here...
    }
  
    @Override
    public ExigenceFonct get(String identifiant_ex ) {
        String sql = "SELECT * FROM contact WHERE identifiant_ex=" + identifiant_ex;
        return jdbcTemplate.query(sql, new ResultSetExtractor<ExigenceFonct>() {
     
            @Override
            public ExigenceFonct extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                	ExigenceFonct exigencefonct = new ExigenceFonct();
                	exigencefonct.setIdentifiant(rs.getString("identifiant_ex"));
                	exigencefonct.setDescription(rs.getString("description_ex"));
                	exigencefonct.setPriorite(rs.getString("priorite_ex"));

                    return exigencefonct;
                }
                return null;
            }
            
        });
    }
}
        
  

