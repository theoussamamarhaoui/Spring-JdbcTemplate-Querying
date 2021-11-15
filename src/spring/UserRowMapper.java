package spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setUserName(rs.getString("userName"));
		user.setEmail(rs.getString("email"));
		user.setUserPassword(rs.getString("userPassword"));
		user.setRole(rs.getString("role"));
		user.setCreated(rs.getTimestamp("created"));
		System.out.println(user.toString());
		return user;
	}
	

}
