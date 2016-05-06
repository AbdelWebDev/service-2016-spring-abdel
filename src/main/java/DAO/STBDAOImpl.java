package DAO;
 
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.swing.tree.RowMapper;

import model.STB;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

 
/**
 * l'implimentation de EquipeDAO interface.
 * @author katia & amri abdelouhab
 *
 */
public abstract class STBDAOImpl implements STBDAO {
 
    protected static final String String = null;
	protected static final java.lang.String Date = null;
	private JdbcTemplate jdbcTemplate;
 
    
       @Override
    public void saveOrUpdate(STB stb) {
           String sql = "INSERT INTO STB (id,titre , version, date ,description , commentaire)"
                           + " VALUES (?, ?, ?, ?, ?, ?)";
               jdbcTemplate.update(sql, STB.getid(), STB.getVersion(), STB.getDate() , STB.getDescription() , STB.getCommentaire());
    }
 
    public STB get(int id) {
        
		final String sql = "SELECT * FROM STB WHERE id=" +id;
        return jdbcTemplate.query(sql, new ResultSetExtractor<STB>() {
     
            @Override
            public STB extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                    STB stb = new STB ();
                    stb.setid(rs.getInt("id"));
                    stb.setTitre(rs.getString("titre"));
                    stb.setVersion(rs.getString("version"));
                    stb.setDate(rs.getDate("date"));
                    return stb;
                }
                return null;
            }
            
        });
    }
   
}
        
  

