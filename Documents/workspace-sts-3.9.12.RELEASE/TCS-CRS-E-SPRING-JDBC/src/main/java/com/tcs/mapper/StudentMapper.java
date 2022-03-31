package com.tcs.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.tcs.model.Student;

public class StudentMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Student stud = new Student();
		stud.setName(rs.getString("name"));
		stud.setEmail(rs.getString("email"));
		stud.setPhoneNumber(rs.getInt("phone_number"));
		stud.setDob(rs.getDate("dob"));
		stud.setStudAprroved(rs.getBoolean("is_approved"));
		stud.setTimestamp(rs.getString("timestamp"));

        return stud;
	}
	
}
