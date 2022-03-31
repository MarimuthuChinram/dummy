package com.tcs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tcs.model.Student;
import com.tcs.model.User;

public class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		User user = new User();
		user.setuserId(rs.getString("userId"));
		user.setPassword(rs.getString("password"));
		user.setRoleId(rs.getInt("roleId"));
		user.setTimestamp(rs.getString("timestamp"));

        return user;
	}
	
}
