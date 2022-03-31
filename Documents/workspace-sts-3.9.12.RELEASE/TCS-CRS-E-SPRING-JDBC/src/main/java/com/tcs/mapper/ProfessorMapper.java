package com.tcs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tcs.model.Professor;

public class ProfessorMapper {

	public Professor mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Professor prof = new Professor();
		prof.setName(rs.getString("name"));
		prof.setEmail(rs.getString("email"));
		prof.setPhoneNumber(rs.getInt("phone_number"));
		prof.setTimestamp(rs.getString("timestamp"));
        return prof;
	}


	
}
