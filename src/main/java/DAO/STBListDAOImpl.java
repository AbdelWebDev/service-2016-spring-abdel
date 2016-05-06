package DAO;
 
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import model.STBList;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

 
/**
 * l'implimentation de EquipeDAO interface.
 * @author katia & amri abdelouhab
 *
 */
public abstract class STBListDAOImpl implements STBListDAO {
 
    private JdbcTemplate jdbcTemplate;
 
        public java.util.List<STBList> list() {
            String sql = "SELECT * FROM STBList";
            List listSTBList = (List) jdbcTemplate.query(sql, new RowMapper<STBList>() {
         
                public STBList mapRow(ResultSet rs, int rowNum) throws SQLException {
                	STBList aSTBList = new STBList();
         
                    
         
                    return aSTBList;
                }
         
            });
         
            return (java.util.List<STBList>) listSTBList;
        }
}
    
        
  

