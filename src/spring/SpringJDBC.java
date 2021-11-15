package spring;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class SpringJDBC {

	private static final String DELETE_USERS_QUERY = "DELETE FROM users WHERE ID=?";
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void loadAll() {
		List list = jdbcTemplate.queryForList("Select * from users");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o.toString());
		}
		
	}
	public void loadById(int id) {
		jdbcTemplate.queryForObject("SELECT * FROM users WHERE ID=?", new Object[] {id}, new UserRowMapper());
	}
	public void insert() {
		jdbcTemplate.update("INSERT INTO users(id, userName, email, userPassword, role, created)"
				+ " VALUES(3, 'admin1', 'admin1', 'admin1', 'ADMIN1', '2019-02-19 06:30:29')");	
	}
	
	public void update(int id, User user) {
		System.out.println(user.getRole());
		jdbcTemplate.update("update users set userName='"+user.getUserName()+"',email='"+user.getEmail()
		+"',userPassword='"+user.getUserPassword()+"', role='"+user.getRole()+"' where id="+id);
	}
	
	
	public void delete(BatchPreparedStatementSetter id) {
		jdbcTemplate.batchUpdate("DELETE FROM users WHERE ID=?", id);
		
	}

	public void delete(int id) {
		jdbcTemplate.update("delete from users where id="+id);
		
	}
	
}
