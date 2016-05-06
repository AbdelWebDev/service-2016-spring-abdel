package DAO;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
 
import model.Client;
import model.Equipe;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
 
/**
 * implimentation de l'interface ClientDAO .
 * @author katia & amri abdelouhab
 *
 */
public abstract class ClientDAOImpl implements ClientDAO {
 
    
 
    public ClientDAOImpl(DataSource dataSource) {
    	 JdbcTemplate jdbcTemplate = null;
            
  	            // insert
    	                String sql = "INSERT INTO Client (entite, contact , code )"
    	                            + " VALUES (?, ?, ?, ?)";
    	                jdbcTemplate.update(sql, Client.getentite(), Client.getcontact(), Client.getCode_postale()
    	                        );
    	            }
 
    @Override
    public void saveOrUpdate(Client client) {
        // implementation details goes here...
    }
    @Override
    public Client get(String entite) {
        String sql = "SELECT * FROM Client WHERE entite=" + entite;
        JdbcTemplate jdbcTemplate = null;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Client>() {
     
            @Override
            public Client extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                    Client client = new Client();
                    client.setentite(rs.getString("entite"));
                    client.setcontact(rs.getString("contact"));
                    client.setCode_postale(rs.getString("Code_postale"));

                    return client;
                }
                return null;
            }
            
        });
    }
}