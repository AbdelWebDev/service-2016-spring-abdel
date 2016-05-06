package DAO;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import model.STBE;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

 
/**
 * l'implimentation de EquipeDAO interface.
 * @author katia & amri abdelouhab
 *
 */
public abstract class STBEntryDAOImpl implements STBEntryDAO {
 
    private JdbcTemplate jdbcTemplate;
 
    public STBEntryDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
          
            // insert
                String sql = "INSERT INTO STBE (nom, prenom)"
                            + " VALUES (?, ?, ?, ?)";
                jdbcTemplate.update(sql, STBE.getStbid(), STBE.getTitre(), STBE.getVersion()
                        );
            }
         
    
       @Override
    public void saveOrUpdate(STBE stbentry) {
        // implementation details goes here...
    }
 
   
    @Override
    public STBE get(int Stbid) {
        String sql = "SELECT * FROM STBE WHERE Stbid=" + Stbid;
        return jdbcTemplate.query(sql, new ResultSetExtractor<STBE>() {
     
            @Override
            public STBE extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                	STBE stbentry = new STBE();
                    stbentry.setStbid(rs.getInt("stbid"));
                    stbentry.setTitre(rs.getString("titre"));
                    stbentry.setVersion(rs.getString("version"));
                    return stbentry;
                }
                return null;
            }
            
        });
    }
}
        
  

